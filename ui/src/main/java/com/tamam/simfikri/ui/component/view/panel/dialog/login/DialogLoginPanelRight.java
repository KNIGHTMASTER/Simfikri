package com.tamam.simfikri.ui.component.view.panel.dialog.login;

import com.tamam.simfikri.ui.component.base.IComponentInitalizer;
import com.tamam.simfikri.ui.component.button.dialog.login.ButtonLogin;
import javax.annotation.PostConstruct;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 
 * @author <a href="fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class DialogLoginPanelRight extends JPanel implements IComponentInitalizer{
    
    private static final long serialVersionUID = -6110242459623006348L;
    
    @Autowired
    private ButtonLogin btLogin;
    
    private JPasswordField txtPassword;
    private JTextField txtUserName;

    @PostConstruct
    @Override
    public void init() {        
        this.setPreferredSize(new java.awt.Dimension(100, 100));
        this.setLayout(new java.awt.GridLayout(2, 0));

        txtUserName = new JTextField();
        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassword.requestFocus();
            }
        });
        this.add(txtUserName);

        txtPassword = new JPasswordField();
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {                
                btLogin.doClick();
            }
        });
        this.add(txtPassword);
    }

    public JPasswordField getTxtPassword() {
        return txtPassword;
    }

    public JTextField getTxtUserName() {
        return txtUserName;
    }

    
}
