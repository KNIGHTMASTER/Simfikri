package id.co.telkomsigma.etc.ui.operator.component.view.panel.internalframe.dashboard;

import id.co.telkomsigma.etc.swing.component.base.IComponentInitializer;
import id.co.telkomsigma.etc.ui.operator.component.view.panel.card.CardPanelTransaction;
import id.co.telkomsigma.etc.ui.operator.component.view.panel.card.dashboard.CardPanelDashboard;
import id.co.telkomsigma.etc.ui.operator.component.view.panel.card.master.CardPanelMaster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;

/**
 * 
 * @author <a href="fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class InternalFrameDashboardPanelCenter extends JPanel implements IComponentInitializer {

    /**
     *
     *
     */
    private static final long serialVersionUID = 3437494610626938548L;

    @Autowired
    private CardPanelDashboard cardPanelDashboard;
    
    @Autowired
    private CardPanelMaster cardPanelMaster;

    @Autowired
    private CardPanelTransaction cardPanelTransaction;


    @PostConstruct
    @Override
    public void initComponents() {
        this.setOpaque(false);
        this.setLayout(new java.awt.CardLayout());

        this.add(cardPanelDashboard, "dashboard");
        this.add(cardPanelMaster, "master");
        this.add(cardPanelTransaction, "transaksi");
//        this.add(laporan, "laporan");
//        this.add(maintenance, "maintenance");
    }

    public CardPanelMaster getCardPanelMaster() {
        return cardPanelMaster;
    }
}
