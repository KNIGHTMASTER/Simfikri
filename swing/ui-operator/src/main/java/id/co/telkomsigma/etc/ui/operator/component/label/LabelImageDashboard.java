package id.co.telkomsigma.etc.ui.operator.component.label;

import id.co.telkomsigma.etc.swing.component.base.IComponentInitializer;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;

/**
 * 
 * @author <a href="fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class LabelImageDashboard extends JLabel implements IComponentInitializer {
    
    private static final long serialVersionUID = -2090531098487556960L;

    @PostConstruct
    @Override
    public void initComponents() {
        this.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("assets/etc.png"))); // NOI18N
    }

}
