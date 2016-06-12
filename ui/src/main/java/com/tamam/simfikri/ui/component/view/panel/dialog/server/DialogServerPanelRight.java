package com.tamam.simfikri.ui.component.view.panel.dialog.server;

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
public class DialogServerPanelRight extends JPanel implements IComponentInitalizer{
    
    private static final long serialVersionUID = -6110242459623006348L;
    
    private JTextField txtIP;
    private JTextField txtFTPPort;
    private JTextField txtFTPUserName;
    private JTextField txtFTPPassword;

    @PostConstruct
    @Override
    public void init() {        
        this.setPreferredSize(new java.awt.Dimension(100, 100));
        this.setLayout(new java.awt.GridLayout(4, 0));
        
        initButton();
        
        this.add(txtIP);
        this.add(txtFTPPort);
        this.add(txtFTPUserName);
        this.add(txtFTPPassword);
    }
    
    private void initButton() {
        txtIP = new JTextField();
        txtFTPPort = new JTextField();
        txtFTPUserName = new JTextField();
        txtFTPPassword = new JTextField();
    }

    public JTextField getTxtIP() {
        return txtIP;
    }

    public void setTxtIP(JTextField txtIP) {
        this.txtIP = txtIP;
    }

    public JTextField getTxtFTPPort() {
        return txtFTPPort;
    }

    public void setTxtFTPPort(JTextField txtFTPPort) {
        this.txtFTPPort = txtFTPPort;
    }

    public JTextField getTxtFTPUserName() {
        return txtFTPUserName;
    }

    public void setTxtFTPUserName(JTextField txtFTPUserName) {
        this.txtFTPUserName = txtFTPUserName;
    }

    public JTextField getTxtFTPPassword() {
        return txtFTPPassword;
    }

    public void setTxtFTPPassword(JTextField txtFTPPassword) {
        this.txtFTPPassword = txtFTPPassword;
    }

    
    
}
