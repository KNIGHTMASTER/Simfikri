package id.co.telkomsigma.etc.ui.operator.component.dialog;

import id.co.telkomsigma.etc.swing.component.base.ICentralizePositionComponent;
import id.co.telkomsigma.etc.swing.component.base.IComponentInitializer;
import id.co.telkomsigma.etc.ui.operator.component.combobox.ComboBoxTheme;
import id.co.telkomsigma.etc.ui.operator.controller.dialog.ControllerDialogTheme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;

/**
 * 
 * @author <a href="fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class DialogTheme extends JDialog implements IComponentInitializer {
    
    private static final long serialVersionUID = -910170184194682402L;
    
    @Autowired
    private ControllerDialogTheme themeChooser;

    @Autowired
    ComboBoxTheme comboBoxTheme;

    @Autowired
    ICentralizePositionComponent centralizePositionComponent;
    
    private java.awt.Component component;
    
    private boolean isInitiated = false;

    public void setComponent(java.awt.Component component) {
        this.component = component;
    }
            
    @Override
    public void initComponents() {
        this.setModal(true);
        this.setSize(300, 80);
        centralizePositionComponent.setDialogToCenter(this);
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
