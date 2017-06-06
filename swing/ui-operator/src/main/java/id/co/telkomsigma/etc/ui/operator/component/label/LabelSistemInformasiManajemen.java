package id.co.telkomsigma.etc.ui.operator.component.label;

import id.co.telkomsigma.etc.swing.component.base.IComponentInitializer;
import javax.annotation.PostConstruct;
import javax.swing.JLabel;
import org.springframework.stereotype.Component;

/**
 * 
 * @author <a href="fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class LabelSistemInformasiManajemen extends JLabel implements IComponentInitializer {
    
    private static final long serialVersionUID = -7835962917670529322L;

    @PostConstruct
    @Override
    public void initComponents() {
        this.setFont(new java.awt.Font("Tahoma", 0, 40));
        this.setText("SISTEM INFORMASI MANAJEMEN");
    }

}
