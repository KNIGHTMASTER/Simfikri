package id.co.telkomsigma.etc.ui.operator.component.view.panel.card.master;

import id.co.telkomsigma.etc.swing.component.base.IComponentInitializer;
import id.co.telkomsigma.etc.ui.operator.component.view.tab.TabMaster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;

/**
 * 
 * @author <a href="fauzi.knightthis.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class CardPanelMaster extends JPanel implements IComponentInitializer{

    /**
     *
     *
     */
    private static final long serialVersionUID = -1333772299710964047L;

    /*@Autowired
    CardPanelMasterTop cardPanelMasterTop;*/

    @Autowired
    TabMaster tabMaster;

    private JLabel lblMaster = new JLabel("Master Data Viewer");

    @PostConstruct
    @Override
    public void initComponents() {
        /*this.setLayout(new GridBagLayout());
        this.add(cardPanelMasterTop);*/
        this.setLayout(new BorderLayout());
        this.add(tabMaster, java.awt.BorderLayout.CENTER);
        this.add(lblMaster, BorderLayout.PAGE_START);
    }

    /*public CardPanelMasterTop getCardPanelMasterTop() {
        return cardPanelMasterTop;
    }*/
}
