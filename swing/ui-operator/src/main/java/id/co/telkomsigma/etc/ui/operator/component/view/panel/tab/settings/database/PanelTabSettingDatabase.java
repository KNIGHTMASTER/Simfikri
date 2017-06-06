package id.co.telkomsigma.etc.ui.operator.component.view.panel.tab.settings.database;

import id.co.telkomsigma.etc.swing.component.base.IComponentAction;
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
public class PanelTabSettingDatabase extends JPanel implements IComponentInitializer, IComponentAction {
    /**
     *
     *
     */
    private static final long serialVersionUID = -3586816668647376686L;

    @Autowired
    PanelTabSettingDatabaseTop panelTabSettingDatabaseTop;

    @Autowired
    PanelTabSettingDatabaseBottom panelTabSettingDatabaseBottom;

    private boolean isInitialized = false;

    @PostConstruct
    @Override
    public void initComponents() {
        this.setLayout(new BorderLayout());
        this.add(panelTabSettingDatabaseTop, java.awt.BorderLayout.CENTER);
        this.add(panelTabSettingDatabaseBottom, java.awt.BorderLayout.PAGE_END);
        initAction();
        isInitialized = true;
    }

    @Override
    public void initAction() {

    }

    public boolean isInitialized() {
        return isInitialized;
    }
}
