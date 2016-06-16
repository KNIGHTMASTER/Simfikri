package com.tamam.simfikri.ui.component.dialog;

import com.tamam.swing.component.base.IComponentInitalizer;
import com.tamam.simfikri.ui.component.combobox.ComboBoxTheme;
import com.tamam.simfikri.ui.controller.dialog.ControllerDialogTheme;
import javax.swing.JDialog;
import javax.swing.JLabel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 
 * @author <a href="fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class DialogTheme extends JDialog implements IComponentInitalizer{
    
    private static final long serialVersionUID = -910170184194682402L;
    
    @Autowired
    private ControllerDialogTheme themeChooser;

    @Autowired
    ComboBoxTheme comboBoxTheme;
    
    private java.awt.Component component;
    
    private boolean isInitiated = false;

    public void setComponent(java.awt.Component component) {
        this.component = component;
    }
            
    @Override
    public void init() {        
        int y = 250;
        int x = 500;
        this.setModal(true);
        this.setLocation(x, y);
        this.setSize(300, 80);
        this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        this.setTitle("Theme Configuration");
        this.getContentPane().setLayout(new java.awt.GridLayout(1, 2));

        JLabel lblOption = new JLabel("Option : ");        
        this.getContentPane().add(lblOption);                                
        
        this.getContentPane().add(comboBoxTheme);
        
        comboBoxTheme.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themeChooser.start(evt, comboBoxTheme, component);
            }
        });
        isInitiated = true;
    }

    public boolean isIsInitiated() {
        return isInitiated;
    }
    
}
