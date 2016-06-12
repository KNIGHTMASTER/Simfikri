package com.tamam.simfikri.ui.component.view.panel.dialog.server;

import com.tamam.simfikri.ui.component.base.IComponentInitalizer;
import com.tamam.simfikri.ui.component.button.dialog.server.ButtonSave;
import com.tamam.simfikri.ui.component.button.dialog.server.ButtonTest;
import javax.annotation.PostConstruct;
import javax.swing.JPanel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 
 * @author <a href="fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class DialogServerPanelBottom extends JPanel implements IComponentInitalizer{
    
    private static final long serialVersionUID = 6471350826305995549L;
    
    @Autowired
    private ButtonSave btSave;
    
    @Autowired
    private ButtonTest btTest;
        

    @PostConstruct
    @Override
    public void init() {        
        this.setPreferredSize(new java.awt.Dimension(100, 30));
        this.setLayout(new java.awt.GridLayout(1, 0));        
        this.add(btSave);
        this.add(btTest);
    }

    public ButtonSave getBtSave() {
        return btSave;
    }

    public ButtonTest getBtTest() {
        return btTest;
    }

    
}
