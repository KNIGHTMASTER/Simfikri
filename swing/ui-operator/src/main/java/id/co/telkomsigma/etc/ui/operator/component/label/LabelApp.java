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
public class LabelApp extends JLabel implements IComponentInitializer {
    private static final long serialVersionUID = -4395133024358708614L;

    @PostConstruct
    @Override
    public void initComponents() {
        this.setFont(new java.awt.Font("Tahoma", 0, 40));
        this.setText("APP");
    }

}
