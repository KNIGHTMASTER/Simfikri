package id.co.telkomsigma.etc.ui.operator.component.view.panel.tab.settings.timer;

import id.co.telkomsigma.etc.swing.component.base.IComponentInitializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;

/**
 * Created on 5/30/17.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class PanelTabSettingTimer extends JPanel implements IComponentInitializer{
    /**
     *
     *
     */
    private static final long serialVersionUID = -7095614511530384870L;

    @Autowired
    PanelTabSettingTimerInception panelTabSettingTimerInception;

    @PostConstruct
    @Override
    public void initComponents() {
        this.setLayout(new GridBagLayout());
        this.add(panelTabSettingTimerInception);
    }
}
