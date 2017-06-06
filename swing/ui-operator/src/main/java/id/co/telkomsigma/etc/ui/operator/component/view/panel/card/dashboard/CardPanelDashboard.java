package id.co.telkomsigma.etc.ui.operator.component.view.panel.card.dashboard;

import id.co.telkomsigma.etc.swing.component.base.IComponentInitializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;

/**
 * 
 * @author <a href="fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class CardPanelDashboard extends JPanel implements IComponentInitializer {

    /**
     *
     *
     */
    private static final long serialVersionUID = -1394046529854035697L;

    @Autowired
    CardPanelDashboardTop cardPanelDashboardTop;

    @Autowired
    CardPanelDashboardBottom cardPanelDashboardBottom;
    
    @PostConstruct
    @Override
    public void initComponents() {
        this.setOpaque(false);        
        this.setLayout(new java.awt.BorderLayout());
        
        this.add(cardPanelDashboardTop, BorderLayout.PAGE_START);
        this.add(cardPanelDashboardBottom, BorderLayout.CENTER);
    }

}
