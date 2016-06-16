package com.tamam.simfikri.ui.component.view.panel.dialog.server;

import com.tamam.swing.component.base.IComponentInitalizer;
import javax.annotation.PostConstruct;
import javax.swing.JLabel;
import javax.swing.JPanel;
import org.springframework.stereotype.Component;

/**
 * 
 * @author <a href="fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class DialogServerPanelLeft extends JPanel implements IComponentInitalizer{
    
    private static final long serialVersionUID = -7271039294614896940L;
    
    @PostConstruct
    @Override
    public void init() {        
        this.setLayout(new java.awt.GridLayout(4, 0));
        
        JLabel lblIP = new JLabel();
        lblIP.setText("IP");
        this.add(lblIP);

        JLabel lblFTPPort = new JLabel();
        lblFTPPort.setText("FTP Port");
        this.add(lblFTPPort);
        
        JLabel lblFTPUserName = new JLabel();
        lblFTPUserName.setText("FTP User Name");
        this.add(lblFTPUserName);
        
        JLabel lblFTPPassword = new JLabel();
        lblFTPPassword.setText("FTP Password");
        this.add(lblFTPPassword);
    }

}
