package id.co.telkomsigma.etc.service.batch;

import id.co.telkomsigma.etc.data.ApplicationConstant.TransactionKey;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created on Jun 5, 2017
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
public class LCTransactionReader implements IFileReader<List<Map<String, String>>>, Serializable{
    /**
     * 
     * 
     */
    private static final long serialVersionUID = 4486743600608361111L;

    List<Map<String, String>> result = new ArrayList<>();
    
    private static final Logger LOGGER = LoggerFactory.getLogger(LCTransactionReader.class);
    
    @Override
    public void read(String p_SourcePath){
        Map<String, String> mapData = new HashMap<>();        
        try (BufferedReader br = new BufferedReader(new FileReader(p_SourcePath))) {
            String sCurrentLine;
            int a = 0;
            while ((sCurrentLine = br.readLine()) != null) {
                System.out.println(sCurrentLine);
                mapData.put(TransactionKey.PLAZA, sCurrentLine.substring(0, 3));
                mapData.put(TransactionKey.STATION_TYPE, sCurrentLine.substring(3, 4));
                mapData.put(TransactionKey.LANE, sCurrentLine.substring(4, 6));
                mapData.put(TransactionKey.DIRECTION, sCurrentLine.substring(6, 7));
                mapData.put(TransactionKey.BLANK_1, sCurrentLine.substring(7, 8));
                result.add(mapData);
                a++;
            }
            LOGGER.info("LINE : "+a);
        } catch (IOException e) {
            LOGGER.error(e.toString());
        }
    }

    @Override
    public List<Map<String, String>> getOutput() {
        return result;
    }
}
