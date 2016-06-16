package com.tamam.simfikri.ui.component.dialog;

import com.tamam.swing.component.base.IComponentInitalizer;
import javax.annotation.PostConstruct;
import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import org.springframework.stereotype.Component;

/**
 * 
 * @author <a href="fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class DialogAbout extends JDialog implements IComponentInitalizer{
    
    private static final long serialVersionUID = -5546517331962931229L;

    @PostConstruct
    @Override
    public void init() {
        int y = 250;
        int x = 500;
        this.setModal(true);
        this.setLocation(x, y);
        this.setSize(300, 300);
        this.setTitle("Application Information");        
        JScrollPane scroller = new javax.swing.JScrollPane();
        JTextArea textAreaInformation = new JTextArea();        
        textAreaInformation.setText("ABCDEFGHIJKLM\n"+"OPQRSTUVWXYZ");
        textAreaInformation.setEditable(false);
        this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);        
        textAreaInformation.setColumns(20);
        textAreaInformation.setRows(5);
        scroller.setViewportView(textAreaInformation);
        this.getContentPane().add(scroller, java.awt.BorderLayout.CENTER);        
        pack();
    }

    
}
