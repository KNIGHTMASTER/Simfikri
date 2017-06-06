package id.co.telkomsigma.etc.data.transaction;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created on 5/29/17.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Table(name = "tbtransaction")
@Entity
public class Transaction implements Serializable{

    /**
     *
     *
     */
    private static final long serialVersionUID = 7660595312035644550L;

    private Long id;
    private String plaza;
    private String stationType;
    private String lane;
    private String direction;
    private String blank_1;
    private String time;
    private String dst;
    private String blank_2;
    private String signalCode;
    private String blank3;
    private String manufacturerId;
    private String serialNumber;
    private String blank_4;
    private String obuStatus;
    private String signalLevel;
    private String logIndex;
    private String returnFlags;
    private String blank_5;
    private String priceInCurrency;
    private String balance;
    private String blank_6;
    private String vehicleClass;
    private String blank_7;
    private String seqValidPayment;
    private String seqDetection;
    private String seqEnforced;
    private String seqLCTransaction;
    private String seqVideoPicture;
    private String blank_8;
    private String signalCodeBitMap;
    private String blank_9;
    private String laneMode;
    private String lightSignalCode;
    private String blank_10;
    private String exitAvc;
    private String exitAvcAxles;
    private String exitAvcWheels;
    private String exitAvcSensors;
    private String blank_11;
    private String pan;
    private String expiryDate;
    private String usageControl;
    private String blank_12;
    private String efccmCountry;
    private String efccmIssuer;
    private String efccmTypeOfContract;
    private String efccmContextVersion;
    private String blank_13;
    private String rdSessionTime;
    private String rdSessionCountry;
    private String rdSessionIssuer;
    private String rdSessionPlaza;
    private String rdSessionLane;
    private String rdSessionStationType;
    private String blank_14;
    private String rndRSE;
    private String keyRef;
    private String obuAuthenticator;
    private String blank_15;
    private String pictureFileName;
    private String blank_16;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "Plaza", length = 3)
    public String getPlaza() {
        return plaza;
    }

    public void setPlaza(String plaza) {
        this.plaza = plaza;
    }

    @Column(name = "StationType", length = 1)
    public String getStationType() {
        return stationType;
    }

    public void setStationType(String stationType) {
        this.stationType = stationType;
    }

    @Column(name = "Lane", length = 2)
    public String getLane() {
        return lane;
    }

    public void setLane(String lane) {
        this.lane = lane;
    }

    @Column(name = "Direction", length = 1)
    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    @Column(name = "Blank_1", length = 1)
    public String getBlank_1() {
        return blank_1;
    }

    public void setBlank_1(String blank_1) {
        this.blank_1 = blank_1;
    }

    @Column(name = "Time", length = 17)
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Column(name = "DST", length = 3)
    public String getDst() {
        return dst;
    }

    public void setDst(String dst) {
        this.dst = dst;
    }

    @Column(name = "Blank_2", length = 1)
    public String getBlank_2() {
        return blank_2;
    }

    public void setBlank_2(String blank_2) {
        this.blank_2 = blank_2;
    }

    @Column(name = "SignalCode", length = 2)
    public String getSignalCode() {
        return signalCode;
    }

    public void setSignalCode(String signalCode) {
        this.signalCode = signalCode;
    }

    @Column(name = "Blank_3", length = 1)
    public String getBlank3() {
        return blank3;
    }

    public void setBlank3(String blank3) {
        this.blank3 = blank3;
    }

    @Column(name = "ManufacturerId", length = 5)
    public String getManufacturerId() {
        return manufacturerId;
    }

    public void setManufacturerId(String manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    @Column(name = "SerialNumber", length = 10)
    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Column(name = "Blank_4", length = 1)
    public String getBlank_4() {
        return blank_4;
    }

    public void setBlank_4(String blank_4) {
        this.blank_4 = blank_4;
    }

    @Column(name = "ObuStatus", length = 5)
    public String getObuStatus() {
        return obuStatus;
    }

    public void setObuStatus(String obuStatus) {
        this.obuStatus = obuStatus;
    }

    @Column(name = "SignalLevel", length = 3)
    public String getSignalLevel() {
        return signalLevel;
    }

    public void setSignalLevel(String signalLevel) {
        this.signalLevel = signalLevel;
    }

    @Column(name = "LogIndex", length = 2)
    public String getLogIndex() {
        return logIndex;
    }

    public void setLogIndex(String logIndex) {
        this.logIndex = logIndex;
    }

    @Column(name = "ReturnFlags", length = 5)
    public String getReturnFlags() {
        return returnFlags;
    }

    public void setReturnFlags(String returnFlags) {
        this.returnFlags = returnFlags;
    }

    @Column(name = "Blank_5", length = 1)
    public String getBlank_5() {
        return blank_5;
    }

    public void setBlank_5(String blank_5) {
        this.blank_5 = blank_5;
    }

    @Column(name = "PriceInCurrency", length = 8)
    public String getPriceInCurrency() {
        return priceInCurrency;
    }

    public void setPriceInCurrency(String priceInCurrency) {
        this.priceInCurrency = priceInCurrency;
    }

    @Column(name = "Balance", length = 13)
    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    @Column(name = "Blank_6", length = 1)
    public String getBlank_6() {
        return blank_6;
    }

    public void setBlank_6(String blank_6) {
        this.blank_6 = blank_6;
    }

    @Column(name = "VehicleClass", length = 3)
    public String getVehicleClass() {
        return vehicleClass;
    }

    public void setVehicleClass(String vehicleClass) {
        this.vehicleClass = vehicleClass;
    }

    @Column(name = "Blank_7", length = 1)
    public String getBlank_7() {
        return blank_7;
    }

    public void setBlank_7(String blank_7) {
        this.blank_7 = blank_7;
    }

    @Column(name = "SeqValidPayment", length = 10)
    public String getSeqValidPayment() {
        return seqValidPayment;
    }

    public void setSeqValidPayment(String seqValidPayment) {
        this.seqValidPayment = seqValidPayment;
    }

    @Column(name = "SeqDetection", length = 10)
    public String getSeqDetection() {
        return seqDetection;
    }

    public void setSeqDetection(String seqDetection) {
        this.seqDetection = seqDetection;
    }

    @Column(name = "SeqEnforced", length = 10)
    public String getSeqEnforced() {
        return seqEnforced;
    }

    public void setSeqEnforced(String seqEnforced) {
        this.seqEnforced = seqEnforced;
    }

    @Column(name = "SeqLCTransaction", length = 10)
    public String getSeqLCTransaction() {
        return seqLCTransaction;
    }

    public void setSeqLCTransaction(String seqLCTransaction) {
        this.seqLCTransaction = seqLCTransaction;
    }

    @Column(name = "SeqVideoPicture", length = 10)
    public String getSeqVideoPicture() {
        return seqVideoPicture;
    }

    public void setSeqVideoPicture(String seqVideoPicture) {
        this.seqVideoPicture = seqVideoPicture;
    }

    @Column(name = "Blank_8", length = 1)
    public String getBlank_8() {
        return blank_8;
    }

    public void setBlank_8(String blank_8) {
        this.blank_8 = blank_8;
    }

    @Column(name = "SignalCodeBitMap", length = 8)
    public String getSignalCodeBitMap() {
        return signalCodeBitMap;
    }

    public void setSignalCodeBitMap(String signalCodeBitMap) {
        this.signalCodeBitMap = signalCodeBitMap;
    }

    @Column(name = "Blank_9")
    public String getBlank_9() {
        return blank_9;
    }

    public void setBlank_9(String blank_9) {
        this.blank_9 = blank_9;
    }

    @Column(name = "LaneMode", length = 2)
    public String getLaneMode() {
        return laneMode;
    }

    public void setLaneMode(String laneMode) {
        this.laneMode = laneMode;
    }

    @Column(name = "LightSignalCode", length = 2)
    public String getLightSignalCode() {
        return lightSignalCode;
    }

    public void setLightSignalCode(String lightSignalCode) {
        this.lightSignalCode = lightSignalCode;
    }

    @Column(name = "Blank_10", length = 1)
    public String getBlank_10() {
        return blank_10;
    }

    public void setBlank_10(String blank_10) {
        this.blank_10 = blank_10;
    }

    @Column(name = "ExitAvc", length = 3)
    public String getExitAvc() {
        return exitAvc;
    }

    public void setExitAvc(String exitAvc) {
        this.exitAvc = exitAvc;
    }

    @Column(name = "ExitAvcAxles", length = 2)
    public String getExitAvcAxles() {
        return exitAvcAxles;
    }

    public void setExitAvcAxles(String exitAvcAxles) {
        this.exitAvcAxles = exitAvcAxles;
    }

    @Column(name = "ExitAvcWheels", length = 2)
    public String getExitAvcWheels() {
        return exitAvcWheels;
    }

    public void setExitAvcWheels(String exitAvcWheels) {
        this.exitAvcWheels = exitAvcWheels;
    }

    @Column(name = "ExitAvcSensors", length = 2)
    public String getExitAvcSensors() {
        return exitAvcSensors;
    }

    public void setExitAvcSensors(String exitAvcSensors) {
        this.exitAvcSensors = exitAvcSensors;
    }

    @Column(name = "Blank_11", length = 1)
    public String getBlank_11() {
        return blank_11;
    }

    public void setBlank_11(String blank_11) {
        this.blank_11 = blank_11;
    }

    @Column(name = "PAN", length = 19)
    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    @Column(name = "ExpiryDate", length = 8)
    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Column(name = "UsageControl", length = 4)
    public String getUsageControl() {
        return usageControl;
    }

    public void setUsageControl(String usageControl) {
        this.usageControl = usageControl;
    }

    @Column(name = "Blank_12", length = 1)
    public String getBlank_12() {
        return blank_12;
    }

    public void setBlank_12(String blank_12) {
        this.blank_12 = blank_12;
    }

    @Column(name = "EFCCM_Country", length = 3)
    public String getEfccmCountry() {
        return efccmCountry;
    }

    public void setEfccmCountry(String efccmCountry) {
        this.efccmCountry = efccmCountry;
    }

    @Column(name = "EFCCM_Issuer", length = 5)
    public String getEfccmIssuer() {
        return efccmIssuer;
    }

    public void setEfccmIssuer(String efccmIssuer) {
        this.efccmIssuer = efccmIssuer;
    }

    @Column(name = "EFCCM_TypeOfContract", length = 4)
    public String getEfccmTypeOfContract() {
        return efccmTypeOfContract;
    }

    public void setEfccmTypeOfContract(String efccmTypeOfContract) {
        this.efccmTypeOfContract = efccmTypeOfContract;
    }

    @Column(name = "EFCCM_ContextVersion", length = 2)
    public String getEfccmContextVersion() {
        return efccmContextVersion;
    }

    public void setEfccmContextVersion(String efccmContextVersion) {
        this.efccmContextVersion = efccmContextVersion;
    }

    @Column(name = "Blank_13", length = 1)
    public String getBlank_13() {
        return blank_13;
    }

    public void setBlank_13(String blank_13) {
        this.blank_13 = blank_13;
    }

    @Column(name = "RD_SessionTime", length = 14)
    public String getRdSessionTime() {
        return rdSessionTime;
    }

    public void setRdSessionTime(String rdSessionTime) {
        this.rdSessionTime = rdSessionTime;
    }

    @Column(name = "RD_SessionCountry", length = 3)
    public String getRdSessionCountry() {
        return rdSessionCountry;
    }

    public void setRdSessionCountry(String rdSessionCountry) {
        this.rdSessionCountry = rdSessionCountry;
    }

    @Column(name = "RD_SessionIssuer", length = 5)
    public String getRdSessionIssuer() {
        return rdSessionIssuer;
    }

    public void setRdSessionIssuer(String rdSessionIssuer) {
        this.rdSessionIssuer = rdSessionIssuer;
    }

    @Column(name = "RD_SessionPlaza", length = 3)
    public String getRdSessionPlaza() {
        return rdSessionPlaza;
    }

    public void setRdSessionPlaza(String rdSessionPlaza) {
        this.rdSessionPlaza = rdSessionPlaza;
    }

    @Column(name = "RD_SessionLane", length = 2)
    public String getRdSessionLane() {
        return rdSessionLane;
    }

    public void setRdSessionLane(String rdSessionLane) {
        this.rdSessionLane = rdSessionLane;
    }

    @Column(name = "RD_StationType", length = 1)
    public String getRdSessionStationType() {
        return rdSessionStationType;
    }

    public void setRdSessionStationType(String rdSessionStationType) {
        this.rdSessionStationType = rdSessionStationType;
    }

    @Column(name = "Blank_14", length = 1)
    public String getBlank_14() {
        return blank_14;
    }

    public void setBlank_14(String blank_14) {
        this.blank_14 = blank_14;
    }

    @Column(name = "RndRSE", length = 8)
    public String getRndRSE() {
        return rndRSE;
    }

    public void setRndRSE(String rndRSE) {
        this.rndRSE = rndRSE;
    }

    @Column(name = "KeyRef", length = 3)
    public String getKeyRef() {
        return keyRef;
    }

    public void setKeyRef(String keyRef) {
        this.keyRef = keyRef;
    }

    @Column(name = "ObuAuthenticator", length = 8)
    public String getObuAuthenticator() {
        return obuAuthenticator;
    }

    public void setObuAuthenticator(String obuAuthenticator) {
        this.obuAuthenticator = obuAuthenticator;
    }

    @Column(name = "Blank_15", length = 1)
    public String getBlank_15() {
        return blank_15;
    }

    public void setBlank_15(String blank_15) {
        this.blank_15 = blank_15;
    }

    @Column(name = "PictureFileName", length = 48)
    public String getPictureFileName() {
        return pictureFileName;
    }

    public void setPictureFileName(String pictureFileName) {
        this.pictureFileName = pictureFileName;
    }

    @Column(name = "Blank_16", length = 1)
    public String getBlank_16() {
        return blank_16;
    }

    public void setBlank_16(String blank_16) {
        this.blank_16 = blank_16;
    }
}
