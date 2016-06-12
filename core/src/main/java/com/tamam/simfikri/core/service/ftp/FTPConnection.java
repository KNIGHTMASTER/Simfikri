package com.tamam.simfikri.core.service.ftp;

import com.tamam.simfikri.core.parameter.IParamComponent;
import com.tamam.simfikri.core.parameter.ParamFTPServer;
import java.io.IOException;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 
 * @author <a href="fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Service
public class FTPConnection implements IFTPConnection, IParamComponent<ParamFTPServer>{

    private Logger logger = LoggerFactory.getLogger(FTPConnection.class);
    
    private ParamFTPServer paramFTPConnection;

    private FTPClient fTPClient;        
    
    public FTPConnection() {
        fTPClient = new FTPClient();        
    }
        
    @Override
    public void contractConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int isConnected() {
        int result = 0;
        String ipServer = paramFTPConnection.getIpServer();
        int ftpPort = Integer.valueOf(paramFTPConnection.getFtpPort());
        String ftpUserName = paramFTPConnection.getFtpUserName();
        String ftpPassword = paramFTPConnection.getFtpPassword();        
        logger.info("PARAM FTP CONNECTION : "+paramFTPConnection.toString());
        try {
            fTPClient.connect(ipServer, ftpPort);
            showServerReply(fTPClient);
            int replyCode = fTPClient.getReplyCode();
            if (!FTPReply.isPositiveCompletion(replyCode)) {
                logger.info("Operation failed. Server reply code: " + replyCode);                
            }
            boolean success = fTPClient.login(ftpUserName, ftpPassword);
            showServerReply(fTPClient);
            if (!success) {                
                logger.info("Could not login to the server");                
            } else {
                result = 1;
                System.out.println("LOGGED IN SERVER");
            }
        } catch (IOException ex) {
            System.out.println("Oops! Something wrong happened");
            ex.printStackTrace();
        }
        return result;
    }
    
    private static void showServerReply(FTPClient ftpClient) {
        String[] replies = ftpClient.getReplyStrings();
        if (replies != null && replies.length > 0) {
            for (String aReply : replies) {
                System.out.println("SERVER: " + aReply);
            }
        }
    }

    @Override
    public void setComponent(ParamFTPServer p_Component) {
        this.paramFTPConnection = p_Component;
    }

    @Override
    public ParamFTPServer getComponent() {
        return paramFTPConnection;
    }


}
