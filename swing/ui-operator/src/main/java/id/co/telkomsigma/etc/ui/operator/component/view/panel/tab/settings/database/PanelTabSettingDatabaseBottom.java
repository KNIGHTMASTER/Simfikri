package id.co.telkomsigma.etc.ui.operator.component.view.panel.tab.settings.database;

import id.co.telkomsigma.etc.swing.component.base.IComponentInitializer;
import id.co.telkomsigma.etc.ui.operator.component.button.panel.ButtonSavePanelTabSettingDatabase;
import id.co.telkomsigma.etc.ui.operator.component.button.panel.ButtonTestPanelTabSettingDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;

/**
 * Created on 5/30/17.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class PanelTabSettingDatabaseBottom extends JPanel implements IComponentInitializer {
    /**
     *
     *
     */
    private static final long serialVersionUID = -1506200383903455098L;

    @Autowired
    @Qualifier("btTestPanelTabSettingDatabase")
    ButtonTestPanelTabSettingDatabase btTestPanelTabSettingDatabase;

    @Autowired
    @Qualifier("btSavePanelTabSettingDatabase")
    ButtonSavePanelTabSettingDatabase btSavePanelTabSettingDatabase;

    @PostConstruct
    @Override
    public void initComponents() {
        this.setLayout(new java.awt.GridLayout(1, 1));

        this.add(btSavePanelTabSettingDatabase);
        this.add(btTestPanelTabSettingDatabase);
    }
}
