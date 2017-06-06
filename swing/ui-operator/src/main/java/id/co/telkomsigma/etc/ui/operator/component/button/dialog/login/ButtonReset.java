package id.co.telkomsigma.etc.ui.operator.component.button.dialog.login;

import id.co.telkomsigma.etc.swing.component.base.IComponentInitializer;
import javax.annotation.PostConstruct;
import javax.swing.JButton;
import org.springframework.stereotype.Component;

/**
 * 
 * @author <a href="fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class ButtonReset extends JButton implements IComponentInitializer {
    
    private static final long serialVersionUID = -6973554628553837980L;

    @PostConstruct
    @Override
    public void initComponents() {
        this.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("assets/bt-reset.png")));
        this.setMnemonic('R');
        this.setFocusable(false);
        this.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        this.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    }

}
