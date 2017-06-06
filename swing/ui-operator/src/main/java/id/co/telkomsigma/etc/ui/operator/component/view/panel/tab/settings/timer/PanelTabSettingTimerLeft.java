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
public class PanelTabSettingTimerLeft extends JPanel implements IComponentInitializer{
    /**
     *
     *
     */
    private static final long serialVersionUID = 2473041560110519332L;

    @PostConstruct
    @Override
    public void initComponents() {
        this.setLayout(new java.awt.GridLayout(2, 0));

        JLabel lblDeduct = new JLabel();
        lblDeduct.setText("Deduct (ms)");
        this.add(lblDeduct);

        JLabel lblTopup = new JLabel();
        lblTopup.setText("Topup (ms)");
        this.add(lblTopup);
    }
}
