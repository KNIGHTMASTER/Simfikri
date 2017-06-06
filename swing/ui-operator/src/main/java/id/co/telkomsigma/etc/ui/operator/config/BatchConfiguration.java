package id.co.telkomsigma.etc.ui.operator.config;

import id.co.telkomsigma.etc.data.transaction.Transaction;
import id.co.telkomsigma.etc.service.batch.JobTransactionNotificationListener;
import id.co.telkomsigma.etc.service.batch.TransactionFieldSetMapper;
import id.co.telkomsigma.etc.service.batch.TransactionItemWriter;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.LineMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FixedLengthTokenizer;
import org.springframework.batch.item.file.transform.LineTokenizer;
import org.springframework.batch.item.file.transform.Range;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import static id.co.telkomsigma.etc.data.ApplicationConstant.TransactionKey.*;

/**
 * Created on Jun 5, 2017
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Configuration
@EnableBatchProcessing
public class BatchConfiguration {

    @Autowired
    public JobBuilderFactory jobBuilderFactory;

    @Autowired
    public StepBuilderFactory stepBuilderFactory;

    private final String JOB_NAME = "importTransactionLCJob";

    @Bean
    public Job importTransactionLCJob(JobTransactionNotificationListener listener) {
        return jobBuilderFactory.get(JOB_NAME)
                .listener(listener)
                .flow(step1())
                .end()
                .build();

    }

    @Bean
    public Step step1() {
        return stepBuilderFactory.get("step1")
                .<Transaction, Transaction> chunk(100)
                .reader(transactionLCReader())
                .writer(transactionLCWriter())
                .build();
    }

    @Bean
    public FlatFileItemReader<Transaction> transactionLCReader() {
        FlatFileItemReader<Transaction> reader = new FlatFileItemReader<Transaction>();
        reader.setResource(new ClassPathResource("tr2014082913060242.str"));
        reader.setLineMapper(transactionLineMapper());
        return reader;
    }

    @Bean
    public ItemWriter<Transaction> transactionLCWriter(){
        return new TransactionItemWriter();
    }

    @Bean
    public LineMapper<Transaction> transactionLineMapper() {
        DefaultLineMapper<Transaction> mapper = new DefaultLineMapper<>();
        mapper.setLineTokenizer(transactionLineTokenizer());
        mapper.setFieldSetMapper(productFieldSetMapper());
        return mapper;
    }

    @Bean
    public LineTokenizer transactionLineTokenizer() {
        FixedLengthTokenizer tokenizer = new FixedLengthTokenizer();

        tokenizer.setColumns(
                new Range[] {
                        new Range(1, 3), new Range(4, 4), new Range(5, 6), new Range(7, 7), new Range(8, 8), /*BLANK_1*/
                        new Range(9, 25), new Range(26, 28), new Range(29, 29), /*BLANK_2*/
                        new Range(30, 31), new Range(32, 32), /*BLANK_3*/
                        new Range(33, 37), new Range(38, 47), new Range(48, 48), /*BLANK_4*/
                        new Range(49, 53), new Range(54, 56), new Range(57, 58), new Range(59, 63), new Range(64, 64), /*BLANK_5*/
                        new Range(65, 72), new Range(73, 85), new Range(86, 86), /*BLANK_6*/
                        new Range(87, 89), new Range(90, 90), /*BLANK_7*/
                        new Range(91, 100), new Range(101, 110), new Range(111, 120), new Range(121, 130), new Range(131, 140), new Range(141, 141), /*BLANK_8*/
                        new Range(142, 149), new Range(150, 150), /*BLANK_9*/
                        new Range(151, 152), new Range(153, 154), new Range(155, 155), /*BLANK_10*/
                        new Range(156, 158), new Range(159, 160), new Range(161, 162), new Range(163, 164), new Range(165, 165), /*BLANK_11*/
                        new Range(166, 184), new Range(185, 192), new Range(193, 196), new Range(197, 197), /*BLANK_12*/
                        new Range(198, 200), new Range(201, 205), new Range(206, 209), new Range(210, 211), new Range(212, 212), /*BLANK_13*/
                        new Range(213, 226), new Range(227, 229), new Range(230, 234), new Range(235, 237), new Range(238, 239), new Range(240, 240), new Range(241, 241), /*BLANK_14*/
                        new Range(242, 249), new Range(250, 252), new Range(253, 260), new Range(261, 261), /*BLANK_15*/
                        new Range(262, 310), new Range(311, 311) /*BLANK_16*/
                });

        tokenizer.setNames(
                new String[] {
                        PLAZA, STATION_TYPE, LANE, DIRECTION, BLANK_1,
                        TIME, DST, BLANK_2,
                        SIGNAL_CODE, BLANK_3,
                        MANUFACTURER_ID, SERIAL_NUMBER, BLANK_4,
                        OBU_STATUS, SIGNAL_LEVEL, LOG_INDEX, RETURN_FLAGS, BLANK_5,
                        PRICE_IN_CURRENCY, BALANCE, BLANK_6,
                        VEHICLE_CLASS, BLANK_7,
                        SEQ_VALID_PAYMENT, SEQ_DETECTION, SEQ_ENFORCED, SEC_LC_TRANSACTION, SEQ_VIDEO_PICTURE, BLANK_8,
                        SIGNAL_CODE_BITMAP, BLANK_9,
                        LANE_MODE, LIGHT_SIGNAL_CODE, BLANK_10,
                        EXIT_AVC, EXIT_AVC_AXLES, EXIT_AVC_WHEELS, EXIT_AVC_SENSORS, BLANK_11,
                        PAN, EXPIRY_DATE, USAGE_CONTROL, BLANK_12,
                        EFCCM_COUNTRY, EFCCM_ISSUER, EFCCM_TYPE_OF_CONTRACT, EFCCM_CONTEXT_VERSION, BLANK_13,
                        RD_SESSION_TIME, RD_SESSION_COUNTRY, RD_SESSION_ISSUER, RD_SESSION_PLAZA, RD_SESSION_LANE, RD_SESSION_STATION_TYPE, BLANK_14,
                        RNDRSE, KEY_REF, OBU_AUTHENTICATOR, BLANK_15,
                        PICTURE_FILE_NAME, BLANK_16
                });
        return tokenizer;
    }

    @Bean
    public FieldSetMapper<Transaction> productFieldSetMapper() {
        return new TransactionFieldSetMapper();
    }
}
