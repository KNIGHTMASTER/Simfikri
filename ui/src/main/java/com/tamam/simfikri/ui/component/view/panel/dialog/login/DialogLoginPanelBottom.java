package com.tamam.simfikri.ui.component.view.panel.dialog.login;

import com.tamam.simfikri.ui.component.base.IComponentInitalizer;
import com.tamam.simfikri.ui.component.button.dialog.login.ButtonLogin;
import com.tamam.simfikri.ui.component.button.dialog.login.ButtonReset;
import javax.annotation.PostConstruct;
import javax.swing.JPanel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 
 * @author <a href="fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class DialogLoginPanelBottom extends JPanel implements IComponentInitalizer{
    
    private static final long serialVersionUID = 6471350826305995549L;
    
    @Autowired
    private ButtonLogin btLogin;
    
    @Autowired
    private ButtonReset btReset;        

    @PostConstruct
    @Override
    public void init() {        
        this.setPreferredSize(new java.awt.Dimension(100, 30));
        this.setLayout(new java.awt.GridLayout(1, 0));        
        this.add(btLogin);
        this.add(btReset);
    }

    public ButtonLogin getBtLogin() {
        return btLogin;
    }

    public ButtonReset getBtReset() {
        return btReset;
    }
    
    

}
