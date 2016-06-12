package com.tamam.simfikri.ui.component.validation;

import javax.swing.JOptionPane;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * 
 * @author <a href="fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class ValidationDialogServer implements IViewValidation{

    private Logger logger = LoggerFactory.getLogger(ValidationDialogServer.class);
    private ParamComponentDialogServer componentDialogServer;
    
    @Override
    public int isValid() {
        int result = 0;
        String ip = componentDialogServer.getIpServer();
        String ftpPort = componentDialogServer.getFtpPort();
        String ftpUserName = componentDialogServer.getFtpUserName();
        String ftpPassword = componentDialogServer.getFtpPassword();
        java.awt.Component container = componentDialogServer.getContainer();
        logger.info("IP :"+ip);
        if (ip != null && ip.length() > 0){
            if (ftpPort != null && ftpPort.length() > 0){
                if (ftpUserName != null && ftpUserName.length() > 0){
                    if (ftpPassword != null && ftpPassword.length() > 0){
                        result = 1;
                    }else {
                        JOptionPane.showMessageDialog(container, "FTP Password can not be empty");
                    }
                }else {
                    JOptionPane.showMessageDialog(container, "FTP Username can not be empty");
                }
            }else {
                JOptionPane.showMessageDialog(container, "FTP Port can not be empty");
            }
        }else {
            JOptionPane.showMessageDialog(container, "IP can not be empty");
        }
        return result;
    }

    @Override
    public void setComponent(Object p_Component) {
        if (p_Component instanceof ParamComponentDialogServer){
            this.componentDialogServer = (ParamComponentDialogServer) p_Component;
        }
    }

    @Override
    public Object getComponent() {
        return componentDialogServer;
    }

    
    
}
