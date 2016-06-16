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
public class LabelSimfikri extends JLabel implements IComponentInitalizer{
    private static final long serialVersionUID = -4395133024358708614L;

    @PostConstruct
    @Override
    public void init() {
        this.setFont(new java.awt.Font("Tahoma", 0, 40));
        this.setText("SIMFIKRI");
    }

}
