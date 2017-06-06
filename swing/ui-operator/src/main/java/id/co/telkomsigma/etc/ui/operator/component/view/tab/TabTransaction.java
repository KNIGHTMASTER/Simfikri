package id.co.telkomsigma.etc.ui.operator.component.view.tab;

import id.co.telkomsigma.etc.swing.component.base.IComponentInitializer;
import id.co.telkomsigma.etc.ui.operator.component.view.panel.tab.transaction.PanelTabLogViewer;
import id.co.telkomsigma.etc.ui.operator.component.view.panel.tab.transaction.PanelTabTransaction;
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
public class TabTransaction extends JTabbedPane implements IComponentInitializer {

    /**
     *
     *
     */
    private static final long serialVersionUID = 7740286891291625080L;

    @Autowired
    PanelTabTransaction panelTabTransaction;

    @Autowired
    PanelTabLogViewer panelTabLogViewer;

    @PostConstruct
    @Override
    public void initComponents() {
        this.add("Transaction", panelTabTransaction);
        this.add("Log Viewer", panelTabLogViewer);
    }
}
