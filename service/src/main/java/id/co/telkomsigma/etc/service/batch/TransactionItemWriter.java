package id.co.telkomsigma.etc.service.batch;

import id.co.telkomsigma.etc.data.transaction.Transaction;
import id.co.telkomsigma.etc.service.master.ITransactionLCService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on Jun 5, 2017
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class TransactionItemWriter implements ItemWriter<Transaction> {

    private List<Transaction> transactions = new ArrayList<>();

    private static final Logger LOGGER = LoggerFactory.getLogger(TransactionItemWriter.class);

    @Autowired
    ITransactionLCService transactionLCService;

    @Override
    public void write(List<? extends Transaction> items) {
        LOGGER.info("ITEM SIZE "+items.size());
        for (Transaction transaction : items){
            LOGGER.info("PLAZA : "+transaction.getPlaza());
        }
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }


}
