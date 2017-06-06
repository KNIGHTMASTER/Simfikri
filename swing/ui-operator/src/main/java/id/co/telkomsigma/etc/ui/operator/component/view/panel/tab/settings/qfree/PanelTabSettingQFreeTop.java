package id.co.telkomsigma.etc.ui.operator.component.view.panel.tab.settings.qfree;

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
public class PanelTabSettingQFreeTop extends JPanel implements IComponentInitializer {
    /**
     *
     *
     */
    private static final long serialVersionUID = 5989264536732045185L;

    @Autowired
    PanelTabSettingQFreeLeft panelTabSettingQFreeLeft;

    @Autowired
    PanelTabSettingQFreeRight panelTabSettingQFreeRight;


    @PostConstruct
    @Override
    public void initComponents() {
        this.setPreferredSize(new java.awt.Dimension(200, 200));
        this.setLayout(new java.awt.BorderLayout());
        this.add(panelTabSettingQFreeLeft, java.awt.BorderLayout.WEST);
        this.add(panelTabSettingQFreeRight, java.awt.BorderLayout.CENTER);
        this.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        this.setLayout(new java.awt.GridLayout(1, 2));
    }
}
