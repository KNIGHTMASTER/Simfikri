package com.tamam.simfikri.ui.component.view.panel.dialog.login;

import com.tamam.swing.component.base.IComponentInitalizer;
import javax.annotation.PostConstruct;
import javax.swing.JPanel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 
 * @author <a href="fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class DialogLoginPanelTop extends JPanel implements IComponentInitalizer{
    
    private static final long serialVersionUID = -5008424482762613192L;
    
    @Autowired
    private DialogLoginPanelLeft dialogLoginPanelLeft;
    
    @Autowired
    private DialogLoginPanelRight dialogLoginPanelRight;
    
    @PostConstruct
    @Override
    public void init() {
        this.setPreferredSize(new java.awt.Dimension(200, 200));
        this.setLayout(new java.awt.BorderLayout());
        this.add(dialogLoginPanelLeft, java.awt.BorderLayout.WEST);
        this.add(dialogLoginPanelRight, java.awt.BorderLayout.CENTER);
        this.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        this.setLayout(new java.awt.GridLayout(1, 2));       
    }

    public DialogLoginPanelLeft getDialogLoginPanelLeft() {
        return dialogLoginPanelLeft;
    }

    public DialogLoginPanelRight getDialogLoginPanelRight() {
        return dialogLoginPanelRight;
    }
    
}
