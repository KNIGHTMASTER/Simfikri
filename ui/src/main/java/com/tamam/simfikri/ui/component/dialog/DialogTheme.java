package com.tamam.simfikri.ui.component.dialog;

import com.tamam.simfikri.ui.component.base.IComponentInitalizer;
import com.tamam.simfikri.ui.component.theme.ThemeChooser;
import javax.swing.JComboBox;
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
    private ThemeChooser themeChooser;

    private JComboBox cmbTheme;
    private java.awt.Component component;

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
        this.getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        JLabel lblOption = new JLabel("Option : ");        
        this.getContentPane().add(lblOption);
        
        cmbTheme = new JComboBox();
        cmbTheme.setModel(
                new javax.swing.DefaultComboBoxModel(
                        new String[] { 
                            "Nimbus", 
                            "Windows Classic", 
                            "Windows", 
                            "Acryl", 
                            "Aero", 
                            "Aluminium", 
                            "Bernstein", 
                            "Fast", 
                            "Graphite", 
                            "HiFi", 
                            "Luna", 
                            "Metal", 
                            "McWin", 
                            "Mint", 
                            "Noire", 
                            "Smart", 
                            "Texture" 
                        }
                )
        );
        
        cmbTheme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themeChooser.start(evt, cmbTheme, component);
            }
        });
        
        this.getContentPane().add(cmbTheme);
    }
    
}
