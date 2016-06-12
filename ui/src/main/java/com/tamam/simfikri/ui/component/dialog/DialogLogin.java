package com.tamam.simfikri.ui.component.dialog;

import com.tamam.simfikri.ui.component.base.IComponentAction;
import com.tamam.simfikri.ui.component.base.IComponentInitalizer;
import com.tamam.simfikri.ui.component.view.frame.FrameMain;
import com.tamam.simfikri.ui.component.view.panel.dialog.login.DialogLoginPanelBottom;
import com.tamam.simfikri.ui.component.view.panel.dialog.login.DialogLoginPanelTop;
import com.tamam.simfikri.ui.controller.dialog.ControllerDialogLogin;
import javax.swing.JDialog;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 
 * @author <a href="fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class DialogLogin extends JDialog implements IComponentInitalizer, IComponentAction{
    
    private static final long serialVersionUID = 6858232016968301160L;    
    
    @Autowired
    private ControllerDialogLogin controllerDialogLogin;
    
    @Autowired
    private DialogLoginPanelTop dialogLoginPanelTop;
    
    @Autowired
    private DialogLoginPanelBottom dialogLoginPanelBottom;
    
    private FrameMain frameMain;

    public void setFrameMain(FrameMain frameMain) {
        this.frameMain = frameMain;
    }            
    
    @Override
    public void init() {
        int y = 250;
        int x = 500;
        this.setTitle("Login");
        this.getContentPane().add(dialogLoginPanelTop, java.awt.BorderLayout.CENTER);
        this.getContentPane().add(dialogLoginPanelBottom, java.awt.BorderLayout.PAGE_END);
        this.setModal(true);
        this.setLocation(x, y);
        this.setSize(330, 150);  
        initAction();
    }                
    
    @Override
    public void initAction() {
        final JTextField txtUserName = dialogLoginPanelTop.getDialogLoginPanelRight().getTxtUserName();
        final JPasswordField txtPassword = dialogLoginPanelTop.getDialogLoginPanelRight().getTxtPassword();
        dialogLoginPanelBottom.getBtLogin().addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {                
                controllerDialogLogin.btLoginActionPerformed(evt, txtUserName, frameMain, rootPane, txtPassword, DialogLogin.this);                            
            }
        });
        
        dialogLoginPanelBottom.getBtReset().addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                controllerDialogLogin.btResetActionPerformed(evt, txtUserName, txtPassword);
            }
        });
    }           
}
