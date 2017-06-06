package id.co.telkomsigma.etc.ui.operator.component.view.panel.tab.settings.timer;

import id.co.telkomsigma.etc.swing.component.button.ButtonStart;
import id.co.telkomsigma.etc.swing.component.button.ButtonStop;
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
public class PanelTabSettingTimerBottom extends JPanel implements IComponentInitializer{
    /**
     *
     *
     */
    private static final long serialVersionUID = -1414777891193953570L;

    @Autowired
    ButtonStart btStart;

    @Autowired
    ButtonStop btStop;

    @PostConstruct
    @Override
    public void initComponents() {
        this.setLayout(new java.awt.GridLayout(1, 1));
        this.add(btStart);
        this.add(btStop);
    }
}
