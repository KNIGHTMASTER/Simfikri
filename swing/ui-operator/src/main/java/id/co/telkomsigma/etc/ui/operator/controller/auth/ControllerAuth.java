package id.co.telkomsigma.etc.ui.operator.controller.auth;

import id.co.telkomsigma.etc.service.auth.IAuthService;
import id.co.telkomsigma.etc.ui.operator.component.dialog.DialogLogin;
import id.co.telkomsigma.etc.ui.operator.component.view.frame.MainFrame;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;

/**
 * 
 * @author <a href="fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class ControllerAuth {
    
    private final Logger logger = LoggerFactory.getLogger(ControllerAuth.class);
    
    @Autowired
    private IAuthService authService;
    
    public void authenticateAndAuthorize(MainFrame p_MainFrame, DialogLogin p_DialogLogin, String p_Code, String p_Password){
//        int loginResult = authService.login(p_Code, p_Password);
        int loginResult = 1;
        logger.info("Login Result : "+loginResult);
        if (loginResult == 1){
            p_MainFrame.setMenuVisibility(true);
            p_DialogLogin.dispose();
        }else {
            JOptionPane.showMessageDialog(p_DialogLogin, "Login Failed, user name || password does not match our record");            
        }
    }
}
