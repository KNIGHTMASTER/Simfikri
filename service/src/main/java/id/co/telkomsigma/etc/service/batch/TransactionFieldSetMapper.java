package id.co.telkomsigma.etc.service.batch;

import id.co.telkomsigma.etc.data.transaction.Transaction;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import static id.co.telkomsigma.etc.data.ApplicationConstant.TransactionKey.*;

/**
 * Created on 6/5/17.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
public class TransactionFieldSetMapper implements FieldSetMapper<Transaction> {

    @Override
    public Transaction mapFieldSet(FieldSet fieldSet) throws BindException {
        System.out.println("Field Set Mapper");
        Transaction transaction = new Transaction();

        transaction.setPlaza(fieldSet.readString(PLAZA));
        transaction.setStationType(fieldSet.readString(STATION_TYPE));
        transaction.setLane(fieldSet.readString(LANE));
        transaction.setDirection(fieldSet.readString(DIRECTION));
        transaction.setBlank_1(fieldSet.readString(BLANK_1));

        transaction.setTime(fieldSet.readString(TIME));
        transaction.setDst(fieldSet.readString(DST));
        transaction.setBlank_2(fieldSet.readString(BLANK_2));

        transaction.setSignalCode(fieldSet.readString(SIGNAL_CODE));
        transaction.setBlank3(fieldSet.readString(BLANK_3));

        transaction.setManufacturerId(fieldSet.readString(MANUFACTURER_ID));
        transaction.setSerialNumber(fieldSet.readString(SERIAL_NUMBER));
        transaction.setBlank_4(BLANK_4);

        transaction.setObuStatus(OBU_STATUS);
        transaction.setSignalLevel(SIGNAL_LEVEL);
        transaction.setLogIndex(LOG_INDEX);
        transaction.setReturnFlags(RETURN_FLAGS);
        transaction.setBlank_5(BLANK_5);

        transaction.setPriceInCurrency(PRICE_IN_CURRENCY);
        transaction.setBalance(BALANCE);
        transaction.setBlank_6(BLANK_6);

        transaction.setVehicleClass(VEHICLE_CLASS);
        transaction.setBlank_7(BLANK_7);

        transaction.setSeqValidPayment(SEQ_VALID_PAYMENT);
        transaction.setSeqDetection(SEQ_DETECTION);
        transaction.setSeqEnforced(SEQ_ENFORCED);
        transaction.setSeqLCTransaction(SEC_LC_TRANSACTION);
        transaction.setSeqVideoPicture(SEQ_VIDEO_PICTURE);
        transaction.setBlank_8(BLANK_8);

        transaction.setSignalCodeBitMap(SIGNAL_CODE_BITMAP);
        transaction.setBlank_9(BLANK_9);

        transaction.setLaneMode(LANE_MODE);
        transaction.setLightSignalCode(LIGHT_SIGNAL_CODE);
        transaction.setBlank_10(BLANK_10);

        transaction.setExitAvc(EXIT_AVC);
        transaction.setExitAvcAxles(EXIT_AVC_AXLES);
        transaction.setExitAvcWheels(EXIT_AVC_WHEELS);
        transaction.setExitAvcSensors(EXIT_AVC_SENSORS);
        transaction.setBlank_11(BLANK_11);

        transaction.setPan(PAN);
        transaction.setExpiryDate(EXPIRY_DATE);
        transaction.setUsageControl(USAGE_CONTROL);
        transaction.setBlank_12(BLANK_12);

        transaction.setEfccmCountry(EFCCM_COUNTRY);
        transaction.setEfccmIssuer(EFCCM_ISSUER);
        transaction.setEfccmTypeOfContract(EFCCM_TYPE_OF_CONTRACT);
        transaction.setEfccmContextVersion(EFCCM_CONTEXT_VERSION);
        transaction.setBlank_13(BLANK_13);

        transaction.setRdSessionTime(RD_SESSION_TIME);
        transaction.setRdSessionCountry(RD_SESSION_COUNTRY);
        transaction.setRdSessionIssuer(RD_SESSION_ISSUER);
        transaction.setRdSessionPlaza(RD_SESSION_PLAZA);
        transaction.setRdSessionLane(RD_SESSION_LANE);
        transaction.setRdSessionStationType(RD_SESSION_STATION_TYPE);
        transaction.setBlank_14(BLANK_14);

        transaction.setRndRSE(RNDRSE);
        transaction.setKeyRef(KEY_REF);
        transaction.setObuAuthenticator(OBU_AUTHENTICATOR);
        transaction.setBlank_15(BLANK_15);

        transaction.setPictureFileName(PICTURE_FILE_NAME);
        transaction.setBlank_16(BLANK_16);

        return transaction;
    }
}
