package id.co.telkomsigma.etc.ui.operator.component.view.panel.dialog.server;

import id.co.telkomsigma.etc.swing.component.base.IComponentInitializer;
import javax.annotation.PostConstruct;
import javax.swing.JLabel;
import javax.swing.JPanel;
import org.springframework.stereotype.Component;

/**
 * 
 * @author <a href="fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class DialogServerPanelLeft extends JPanel implements IComponentInitializer {
    
    private static final long serialVersionUID = -7271039294614896940L;
    
    @PostConstruct
    @Override
    public void initComponents() {
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
