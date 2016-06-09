package com.tamam.simfikri.ui.component.button.dashboard;

import com.tamam.simfikri.ui.component.base.IComponentInitalizer;
import javax.annotation.PostConstruct;
import javax.swing.JButton;
import org.springframework.stereotype.Component;

/**
 * 
 * @author <a href="fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class ButtonReport extends JButton implements IComponentInitalizer{
    
    private static final long serialVersionUID = 6537752601033614224L;

    @PostConstruct
    @Override
    public void init() {
        this.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("assets/button-black-report.png")));
    }

}
