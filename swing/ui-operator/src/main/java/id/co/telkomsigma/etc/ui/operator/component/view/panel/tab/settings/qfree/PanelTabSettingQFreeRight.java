package id.co.telkomsigma.etc.ui.operator.component.view.panel.tab.settings.qfree;

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
public class PanelTabSettingQFreeRight extends JPanel implements IComponentInitializer {
    /**
     *
     *
     */
    private static final long serialVersionUID = 2861009280458815728L;

    private JTextField txtSourcePath;
    private JTextField txtDestinationPath;
    private JTextField txtHostIp;
    private JTextField txtStatusListPath;
    private JTextField txtQFree;

    @PostConstruct
    @Override
    public void initComponents() {
        this.setLayout(new java.awt.GridLayout(5, 0));

        txtSourcePath = new JTextField();
        txtDestinationPath = new JTextField();
        txtHostIp = new JTextField();
        txtStatusListPath = new JTextField();
        txtQFree = new JTextField();

        this.add(txtSourcePath);
        this.add(txtDestinationPath);
        this.add(txtHostIp);
        this.add(txtStatusListPath);
        this.add(txtQFree);
    }

    public JTextField getTxtSourcePath() {
        return txtSourcePath;
    }

    public void setTxtSourcePath(JTextField txtSourcePath) {
        this.txtSourcePath = txtSourcePath;
    }

    public JTextField getTxtDestinationPath() {
        return txtDestinationPath;
    }

    public void setTxtDestinationPath(JTextField txtDestinationPath) {
        this.txtDestinationPath = txtDestinationPath;
    }

    public JTextField getTxtHostIp() {
        return txtHostIp;
    }

    public void setTxtHostIp(JTextField txtHostIp) {
        this.txtHostIp = txtHostIp;
    }

    public JTextField getTxtStatusListPath() {
        return txtStatusListPath;
    }

    public void setTxtStatusListPath(JTextField txtStatusListPath) {
        this.txtStatusListPath = txtStatusListPath;
    }

    public JTextField getTxtQFree() {
        return txtQFree;
    }

    public void setTxtQFree(JTextField txtQFree) {
        this.txtQFree = txtQFree;
    }
}
