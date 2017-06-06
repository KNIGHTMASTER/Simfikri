package id.co.telkomsigma.etc.ui.operator.component.view.tab;

import id.co.telkomsigma.etc.swing.component.base.IComponentInitializer;
import id.co.telkomsigma.etc.ui.operator.component.view.panel.tab.settings.database.PanelTabSettingDatabase;
import id.co.telkomsigma.etc.ui.operator.component.view.panel.tab.settings.language.PanelTabSettingLanguage;
import id.co.telkomsigma.etc.ui.operator.component.view.panel.tab.settings.qfree.PanelTabSettingQFree;
import id.co.telkomsigma.etc.ui.operator.component.view.panel.tab.settings.timer.PanelTabSettingTimer;
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
public class TabSettings extends JTabbedPane implements IComponentInitializer {
    /**
     *
     *
     */
    private static final long serialVersionUID = 8837090291134162688L;

    @Autowired
    PanelTabSettingQFree panelTabSettingQFree;

    @Autowired
    PanelTabSettingDatabase panelTabSettingDatabase;

    @Autowired
    PanelTabSettingLanguage panelTabSettingLanguage;

    @Autowired
    PanelTabSettingTimer panelTabSettingTimer;

    @PostConstruct
    @Override
    public void initComponents() {
        this.add("QFree", panelTabSettingQFree);
        this.add("Database", panelTabSettingDatabase);
        this.add("Timer", panelTabSettingTimer);
        this.add("Language", panelTabSettingLanguage);
    }
}
