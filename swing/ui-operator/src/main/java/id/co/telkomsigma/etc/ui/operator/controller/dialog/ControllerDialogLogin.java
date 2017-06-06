package id.co.telkomsigma.etc.ui.operator.controller.dialog;

import id.co.telkomsigma.etc.ui.operator.component.dialog.DialogLogin;
import id.co.telkomsigma.etc.ui.operator.component.view.frame.MainFrame;
import id.co.telkomsigma.etc.ui.operator.controller.auth.ControllerAuth;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 
 * @author <a href="fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class ControllerDialogLogin {

    @Autowired
    private ControllerAuth controllerAuth;
    
    public void btLoginActionPerformed(java.awt.event.ActionEvent evt, JTextField txtUserName, MainFrame mainFrame, java.awt.Component rootPane, JPasswordField txtPassword, DialogLogin dialogLogin) {
        String userName = txtUserName.getText().trim();
        String password = String.valueOf(txtPassword.getPassword()).trim();
        txtUserName.setText("");
        txtPassword.setText("");
        if (userName != null){
            if (password != null){
                controllerAuth.authenticateAndAuthorize(mainFrame, dialogLogin, userName, password);
            }else {
                JOptionPane.showMessageDialog(rootPane, "Password can not be empty");
            }
        }else {
            JOptionPane.showMessageDialog(rootPane, "User name can not be empty");
        }
    }
    
    public void btResetActionPerformed(java.awt.event.ActionEvent evt, JTextField txtUserName, JPasswordField txtPassword){
        txtUserName.setText("");
        txtPassword.setText("");
        txtUserName.requestFocus();
    }
}
