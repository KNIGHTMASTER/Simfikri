package com.tamam.simfikri.ui.component.view.panel.internalframe.dashboard;

import com.tamam.simfikri.ui.component.base.IComponentInitalizer;
import javax.annotation.PostConstruct;
import javax.swing.JButton;
import org.springframework.stereotype.Component;

/**
 * 
 * @author <a href="fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class InternalFrameDashboardPanelLeft extends JButton implements IComponentInitalizer{
    
    private static final long serialVersionUID = 1660104272255643289L;

    @PostConstruct
    @Override
    public void init() {
        this.setMinimumSize(new java.awt.Dimension(64, 90));
        this.setOpaque(false);
        this.setLayout(new java.awt.GridLayout(1, 5));        
    }

}
