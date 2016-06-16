package com.tamam.simfikri.ui.component.label;

import com.tamam.swing.component.base.IComponentInitalizer;
import javax.annotation.PostConstruct;
import javax.swing.JLabel;
import org.springframework.stereotype.Component;

/**
 * 
 * @author <a href="fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class LabelImageDashboard extends JLabel implements IComponentInitalizer{
    
    private static final long serialVersionUID = -2090531098487556960L;

    @PostConstruct
    @Override
    public void init() {
        this.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("assets/dashboard.png"))); // NOI18N
    }

}
