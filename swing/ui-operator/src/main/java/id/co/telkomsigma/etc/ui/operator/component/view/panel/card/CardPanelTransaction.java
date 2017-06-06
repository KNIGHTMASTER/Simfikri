package id.co.telkomsigma.etc.ui.operator.component.view.panel.card;

import id.co.telkomsigma.etc.swing.component.base.IComponentInitializer;
import id.co.telkomsigma.etc.ui.operator.component.view.tab.TabTransaction;
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
public class CardPanelTransaction extends JLabel implements IComponentInitializer {

    /**
     *
     *
     */
    private static final long serialVersionUID = -1333772299710964047L;

    @Autowired
    TabTransaction tabTransaction;

    private JLabel labelTransaction = new JLabel("Transaction Viewer");

    @PostConstruct
    @Override
    public void initComponents() {
        this.setLayout(new BorderLayout());
        this.add(tabTransaction, java.awt.BorderLayout.CENTER);
        this.add(labelTransaction, BorderLayout.PAGE_START);
    }

}
