package id.co.telkomsigma.etc.ui.operator.component.view.panel.dialog.login;

import id.co.telkomsigma.etc.swing.component.base.IComponentInitializer;
import id.co.telkomsigma.etc.ui.operator.component.button.dialog.login.ButtonLogin;
import id.co.telkomsigma.etc.ui.operator.component.button.dialog.login.ButtonReset;
import javax.annotation.PostConstruct;
import javax.swing.JPanel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 
 * @author <a href="fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class DialogLoginPanelBottom extends JPanel implements IComponentInitializer {
    
    private static final long serialVersionUID = 6471350826305995549L;
    
    @Autowired
    private ButtonLogin btLogin;
    
    @Autowired
    private ButtonReset btReset;        

    @PostConstruct
    @Override
    public void initComponents() {
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
