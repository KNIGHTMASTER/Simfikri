package id.co.telkomsigma.etc.ui.operator.component.view.panel.tab.settings.timer;

import id.co.telkomsigma.etc.swing.component.base.IComponentInitializer;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;

/**
 * Created on 5/30/17.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class PanelTabSettingTimerRight extends JPanel implements IComponentInitializer{
    /**
     *
     *
     */
    private static final long serialVersionUID = 6094300951303836255L;

    private JTextField txtDeduct;
    private JTextField txtTopup;

    @PostConstruct
    @Override
    public void initComponents() {
        this.setLayout(new java.awt.GridLayout(2, 0));

        txtDeduct = new JTextField();
        txtTopup = new JTextField();

        this.add(txtDeduct);
        this.add(txtTopup);
    }

    public JTextField getTxtDeduct() {
        return txtDeduct;
    }

    public void setTxtDeduct(JTextField txtDeduct) {
        this.txtDeduct = txtDeduct;
    }

    public JTextField getTxtTopup() {
        return txtTopup;
    }

    public void setTxtTopup(JTextField txtTopup) {
        this.txtTopup = txtTopup;
    }
}
