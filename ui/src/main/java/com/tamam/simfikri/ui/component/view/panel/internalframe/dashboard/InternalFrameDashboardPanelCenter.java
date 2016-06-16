package com.tamam.simfikri.ui.component.view.panel.internalframe.dashboard;

import com.tamam.swing.component.base.IComponentInitalizer;
import com.tamam.simfikri.ui.component.view.panel.card.CardPanelDashboard;
import com.tamam.simfikri.ui.component.view.panel.card.CardPanelMaster;
import javax.annotation.PostConstruct;
import javax.swing.JPanel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 
 * @author <a href="fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class InternalFrameDashboardPanelCenter extends JPanel implements IComponentInitalizer{
    
    private static final long serialVersionUID = 3437494610626938548L;

    @Autowired
    private CardPanelDashboard cardPanelDashboard;
    
    @Autowired
    private CardPanelMaster cardPanelMaster;
        
    @PostConstruct
    @Override
    public void init() {
        this.setOpaque(false);
        this.setLayout(new java.awt.CardLayout());
        
        this.add(cardPanelDashboard, "dashboard");
        this.add(cardPanelMaster, "master");
//        this.add(transaksi, "transaksi");
//        this.add(laporan, "laporan");
//        this.add(maintenance, "maintenance");
    }

}
