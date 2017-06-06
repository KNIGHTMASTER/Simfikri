package id.co.telkomsigma.etc.ui.operator.component.view.panel.tab.settings.timer;

import id.co.telkomsigma.etc.swing.component.base.IComponentInitializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;

/**
 * Created on 5/31/17.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class PanelTabSettingTimerInception extends JPanel implements IComponentInitializer{
    /**
     *
     *
     */
    private static final long serialVersionUID = 5430579881011468988L;

    @Autowired
    PanelTabSettingTimerTop panelTabSettingTimerTop;

    @Autowired
    PanelTabSettingTimerBottom panelTabSettingTimerBottom;

    @PostConstruct
    @Override
    public void initComponents() {
        this.setLayout(new BorderLayout());
        this.setMinimumSize(new Dimension(300, 100));
        this.setPreferredSize(new Dimension(300, 100));
        this.add(panelTabSettingTimerTop, java.awt.BorderLayout.CENTER);
        this.add(panelTabSettingTimerBottom, java.awt.BorderLayout.PAGE_END);
    }
}
