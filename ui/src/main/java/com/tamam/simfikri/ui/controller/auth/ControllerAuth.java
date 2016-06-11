package com.tamam.simfikri.ui.controller.auth;

import com.tamam.simfikri.core.service.auth.IAuthService;
import com.tamam.simfikri.ui.component.dialog.DialogLogin;
import com.tamam.simfikri.ui.component.view.frame.FrameMain;
import javax.swing.JOptionPane;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 
 * @author <a href="fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class ControllerAuth {
    
    private Logger logger = LoggerFactory.getLogger(ControllerAuth.class);
    
    @Autowired
    private IAuthService authService;        
    
    public void authenticateAndAuthorize(FrameMain p_FrameMain, DialogLogin p_DialogLogin, String p_Code, String p_Password){
        int loginResult = authService.login(p_Code, p_Password);
        logger.info("Login Result : "+loginResult);
        if (loginResult == 1){
            p_FrameMain.setMenuVisibility(true);
            p_DialogLogin.dispose();
        }else {
            JOptionPane.showMessageDialog(p_DialogLogin, "Login Failed, user name || password does not match our record");            
        }
    }
}
