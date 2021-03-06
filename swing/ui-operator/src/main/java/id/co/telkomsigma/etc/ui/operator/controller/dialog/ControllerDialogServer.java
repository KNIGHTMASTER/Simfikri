package id.co.telkomsigma.etc.ui.operator.controller.dialog;

import id.co.telkomsigma.etc.service.parameter.IParamComponent;
import id.co.telkomsigma.etc.service.parameter.ParamFTPServer;
import id.co.telkomsigma.etc.service.ftp.FTPConnection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 
 * @author <a href="fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class ControllerDialogServer implements IParamComponent<ParamFTPServer> {

    private Logger logger = LoggerFactory.getLogger(ControllerDialogServer.class);    
        
    @Autowired
    FTPConnection fTPConnection;
    
    private ParamFTPServer paramFTPServer;
    
    public void btTestActionPerformed(){
        fTPConnection.setComponent(paramFTPServer);
        int isConnected = fTPConnection.isConnected();
        if (isConnected == 1){
            logger.info("Test Successfull");
        }
    }

    @Override
    public void setComponent(ParamFTPServer p_Component) {
        this.paramFTPServer = p_Component;
    }

    @Override
    public ParamFTPServer getComponent() {
        return paramFTPServer;
    }

        
}
