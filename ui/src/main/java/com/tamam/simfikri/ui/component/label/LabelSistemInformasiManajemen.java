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
public class LabelSistemInformasiManajemen extends JLabel implements IComponentInitalizer{
    
    private static final long serialVersionUID = -7835962917670529322L;

    @PostConstruct
    @Override
    public void init() {
        this.setFont(new java.awt.Font("Tahoma", 0, 40));
        this.setText("SISTEM INFORMASI MANAJEMEN");
    }

}
