package id.co.telkomsigma.etc.ui.operator.component.view.panel.dialog.login;

import id.co.telkomsigma.etc.swing.component.base.IComponentInitializer;
import javax.annotation.PostConstruct;
import javax.swing.JLabel;
import javax.swing.JPanel;
import org.springframework.stereotype.Component;

/**
 * 
 * @author <a href="fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class DialogLoginPanelLeft extends JPanel implements IComponentInitializer {
    
    private static final long serialVersionUID = -7271039294614896940L;
    
    @PostConstruct
    @Override
    public void initComponents() {
        this.setLayout(new java.awt.GridLayout(2, 0));
        
        JLabel lblUserName = new JLabel();
        lblUserName.setText("User Name :");
        this.add(lblUserName);

        JLabel lblPassword = new JLabel();
        lblPassword.setText("Password :");
        this.add(lblPassword);
    }

}
