package com.tamam.simfikri.ui.component.dialog;

import com.tamam.simfikri.core.parameter.ParamFTPServer;
import com.tamam.simfikri.ui.component.base.IComponentAction;
import com.tamam.simfikri.ui.component.base.IComponentInitalizer;
import com.tamam.simfikri.ui.component.validation.ParamComponentDialogServer;
import com.tamam.simfikri.ui.component.validation.ValidationDialogServer;
import com.tamam.simfikri.ui.component.view.frame.FrameMain;
import com.tamam.simfikri.ui.component.view.panel.dialog.server.DialogServerPanelBottom;
import com.tamam.simfikri.ui.component.view.panel.dialog.server.DialogServerPanelTop;
import com.tamam.simfikri.ui.controller.dialog.ControllerDialogLogin;
import com.tamam.simfikri.ui.controller.dialog.ControllerDialogServer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 
 * @author <a href="fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class DialogServer extends JDialog implements IComponentInitalizer, IComponentAction{
    
    private Logger logger = LoggerFactory.getLogger(DialogServer.class);
    private static final long serialVersionUID = 6858232016968301160L;    

    private ParamComponentDialogServer componentDialogServer;
            
    @Autowired
    private ControllerDialogLogin controllerDialogLogin;
    
    @Autowired
    private DialogServerPanelTop dialogServerPanelTop;
    
    @Autowired
    private DialogServerPanelBottom dialogServerPanelBottom;
    
    @Autowired
    private ValidationDialogServer validationDialogServer;
    
    @Autowired
    private ControllerDialogServer controllerDialogServer;
    
    private FrameMain frameMain;

    public void setFrameMain(FrameMain frameMain) {
        this.frameMain = frameMain;
    }            
    
    @Override
    public void init() {
        int y = 250;
        int x = 500;
        this.setTitle("Server");
        this.getContentPane().add(dialogServerPanelTop, java.awt.BorderLayout.CENTER);
        this.getContentPane().add(dialogServerPanelBottom, java.awt.BorderLayout.PAGE_END);
        this.setModal(true);
        this.setLocation(x, y);
        this.setSize(330, 150);  
        initAction();        
    }                
    
    @Override
    public void initAction() {                                        
        dialogServerPanelBottom.getBtTest().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {                
                initParam();
                int isValid = validationDialogServer.isValid();
                logger.info("Is Valid Dialog Server : "+isValid);
                if (isValid == 1){                    
                    controllerDialogServer.btTestActionPerformed();
                }
            }
        });
        dialogServerPanelBottom.getBtSave().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {                
                initParam();
                int isValid = validationDialogServer.isValid();
                if (isValid == 1){
                    initParam();
                    //go to controller
                }
            }
        });        
    }
    
    private void initParam(){
        componentDialogServer = new ParamComponentDialogServer();
        componentDialogServer.setContainer(this);
        String ip = dialogServerPanelTop.getDialogServerPanelRight().getTxtIP().getText().trim();
        String ftpPort = dialogServerPanelTop.getDialogServerPanelRight().getTxtFTPPort().getText().trim();
        String ftpUserName = dialogServerPanelTop.getDialogServerPanelRight().getTxtFTPUserName().getText().trim();
        String ftpPassword = dialogServerPanelTop.getDialogServerPanelRight().getTxtFTPPassword().getText().trim();
        
        componentDialogServer.setIpServer(ip);
        componentDialogServer.setFtpPort(ftpPort);
        componentDialogServer.setFtpUserName(ftpUserName);
        componentDialogServer.setFtpPassword(ftpPassword);
        validationDialogServer.setComponent(componentDialogServer);
        
        ParamFTPServer paramFTPServer = new ParamFTPServer();
        paramFTPServer.setIpServer(ip);
        paramFTPServer.setFtpPort(ftpPort);
        paramFTPServer.setFtpUserName(ftpUserName);
        paramFTPServer.setFtpPassword(ftpPassword);
        controllerDialogServer.setComponent(paramFTPServer);
    }
}
