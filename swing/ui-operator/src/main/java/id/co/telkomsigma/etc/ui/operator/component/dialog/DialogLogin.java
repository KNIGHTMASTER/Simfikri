package id.co.telkomsigma.etc.ui.operator.component.dialog;

import id.co.telkomsigma.etc.swing.component.base.ICentralizePositionComponent;
import id.co.telkomsigma.etc.swing.component.base.IComponentAction;
import id.co.telkomsigma.etc.swing.component.base.IComponentInitializer;
import id.co.telkomsigma.etc.ui.operator.component.view.frame.MainFrame;
import id.co.telkomsigma.etc.ui.operator.component.view.panel.dialog.login.DialogLoginPanelBottom;
import id.co.telkomsigma.etc.ui.operator.component.view.panel.dialog.login.DialogLoginPanelTop;
import id.co.telkomsigma.etc.ui.operator.controller.dialog.ControllerDialogLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;

/**
 * 
 * @author <a href="fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class DialogLogin extends JDialog implements IComponentInitializer, IComponentAction{
    
    private static final long serialVersionUID = 6858232016968301160L;    
    
    @Autowired
    private ControllerDialogLogin controllerDialogLogin;
    
    @Autowired
    private DialogLoginPanelTop dialogLoginPanelTop;
    
    @Autowired
    private DialogLoginPanelBottom dialogLoginPanelBottom;

    @Autowired
    ICentralizePositionComponent centralizePositionComponent;

    private MainFrame mainFrame;
    
    private boolean isInitiated = false;

    public void setMainFrame(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
    }            
    
    @Override
    public void initComponents() {
        this.setTitle("Login");
        this.getContentPane().add(dialogLoginPanelTop, java.awt.BorderLayout.CENTER);
        this.getContentPane().add(dialogLoginPanelBottom, java.awt.BorderLayout.PAGE_END);
        this.setModal(true);
        this.setSize(400, 150);
        centralizePositionComponent.setDialogToCenter(this);

        initAction();
        isInitiated = true;
    }                
    
    @Override
    public void initAction() {
        final JTextField txtUserName = dialogLoginPanelTop.getDialogLoginPanelRight().getTxtUserName();
        final JPasswordField txtPassword = dialogLoginPanelTop.getDialogLoginPanelRight().getTxtPassword();
        dialogLoginPanelBottom.getBtLogin().addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {                
                controllerDialogLogin.btLoginActionPerformed(evt, txtUserName, mainFrame, rootPane, txtPassword, DialogLogin.this);
            }
        });
        
        dialogLoginPanelBottom.getBtReset().addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                controllerDialogLogin.btResetActionPerformed(evt, txtUserName, txtPassword);
            }
        });
    }           

    public boolean isInitiated() {
        return isInitiated;
    }
        
}
