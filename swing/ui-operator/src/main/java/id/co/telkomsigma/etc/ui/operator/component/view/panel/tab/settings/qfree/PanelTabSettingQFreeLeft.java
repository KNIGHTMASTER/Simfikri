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
public class PanelTabSettingQFreeLeft extends JPanel implements IComponentInitializer {
    /**
     *
     *
     */
    private static final long serialVersionUID = -6347210917533527136L;

    @PostConstruct
    @Override
    public void initComponents() {
        this.setLayout(new java.awt.GridLayout(5, 0));

        JLabel lblSourcePath = new JLabel();
        lblSourcePath.setText("Source Path");
        this.add(lblSourcePath);

        JLabel lblDestinationPath = new JLabel();
        lblDestinationPath.setText("Source Path");
        this.add(lblDestinationPath);

        JLabel lblHostIp = new JLabel();
        lblHostIp.setText("Host Ip");
        this.add(lblHostIp);

        JLabel statusListPath = new JLabel();
        statusListPath.setText("Status List Path");
        this.add(statusListPath);

        JLabel qFree = new JLabel();
        qFree.setText("QFree");
        this.add(qFree);
    }
}
