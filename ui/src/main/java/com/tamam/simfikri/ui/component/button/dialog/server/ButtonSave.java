package com.tamam.simfikri.ui.component.button.dialog.server;

import com.tamam.swing.component.base.IComponentInitalizer;
import javax.annotation.PostConstruct;
import javax.swing.JButton;
import org.springframework.stereotype.Component;

/**
 * 
 * @author <a href="fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class ButtonSave extends JButton implements IComponentInitalizer{
    
    private static final long serialVersionUID = -1441161236689632531L;

    @PostConstruct
    @Override
    public void init() {        
        this.setText("Save");
        this.setMnemonic('S');
        this.setFocusable(false);
        this.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        this.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    }

}
