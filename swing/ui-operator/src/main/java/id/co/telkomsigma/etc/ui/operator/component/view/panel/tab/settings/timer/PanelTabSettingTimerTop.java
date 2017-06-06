package id.co.telkomsigma.etc.ui.operator.component.view.panel.tab.settings.timer;

import id.co.telkomsigma.etc.swing.component.base.IComponentInitializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;

/**
 * Created on 5/30/17.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class PanelTabSettingTimerTop extends JPanel implements IComponentInitializer{
    /**
     *
     *
     */
    private static final long serialVersionUID = -7459605248558910262L;

    @Autowired
    PanelTabSettingTimerLeft panelTabSettingTimerLeft;

    @Autowired
    PanelTabSettingTimerRight panelTabSettingTimerRight;

    @PostConstruct
    @Override
    public void initComponents() {
        this.setPreferredSize(new java.awt.Dimension(200, 200));
        this.setLayout(new java.awt.BorderLayout());
        this.add(panelTabSettingTimerLeft, java.awt.BorderLayout.WEST);
        this.add(panelTabSettingTimerRight, java.awt.BorderLayout.CENTER);
        this.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        this.setLayout(new java.awt.GridLayout(1, 2));
    }
}
