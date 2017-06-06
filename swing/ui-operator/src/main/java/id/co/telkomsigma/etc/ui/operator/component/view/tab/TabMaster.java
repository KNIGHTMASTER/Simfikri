package id.co.telkomsigma.etc.ui.operator.component.view.tab;

import id.co.telkomsigma.etc.swing.component.base.IComponentInitializer;
import id.co.telkomsigma.etc.ui.operator.component.view.panel.tab.master.PanelTabMasterBlackList;
import id.co.telkomsigma.etc.ui.operator.component.view.panel.tab.master.PanelTabMasterPrice;
import id.co.telkomsigma.etc.ui.operator.component.view.panel.tab.master.PanelTabMasterSignalCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;

/**
 * Created on 6/5/17.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class TabMaster extends JTabbedPane implements IComponentInitializer{
    /**
     *
     *
     */
    private static final long serialVersionUID = 7954635913010210225L;

    @Autowired
    PanelTabMasterPrice panelTabMasterPrice;

    @Autowired
    PanelTabMasterSignalCode panelTabMasterSignalCode;

    @Autowired
    PanelTabMasterBlackList panelTabMasterBlackList;

    @PostConstruct
    @Override
    public void initComponents() {
        this.add("Price", panelTabMasterPrice);
        this.add("Signal Code", panelTabMasterSignalCode);
        this.add("Black List", panelTabMasterBlackList);
    }
}
