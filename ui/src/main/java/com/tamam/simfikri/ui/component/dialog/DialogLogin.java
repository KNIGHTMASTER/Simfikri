package com.tamam.simfikri.ui.component.dialog;

import com.tamam.simfikri.core.service.auth.IAuthService;
import com.tamam.simfikri.ui.component.base.IComponentInitalizer;
import javax.annotation.PostConstruct;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
public class DialogLogin extends JDialog implements IComponentInitalizer{
    
    private static final long serialVersionUID = 6858232016968301160L;

    @Autowired
    IAuthService authService;
    
    private JTextField txtUserName;
    private JPasswordField txtPassword;
    private JButton btLogin;
    private JButton btReset;        
    
    @PostConstruct
    @Override
    public void init() {
        int y = 250;
        int x = 500;
        this.setTitle("Login");
        this.getContentPane().add(getPanelTop(), java.awt.BorderLayout.CENTER);
        this.getContentPane().add(getPanelBottom(), java.awt.BorderLayout.PAGE_END);
        this.setModal(true);
        this.setLocation(x, y);
        this.setSize(330, 150);        
    }

    private JPanel getPanelTop(){
        JPanel panelTop = new JPanel();
        panelTop.setPreferredSize(new java.awt.Dimension(200, 200));
        panelTop.setLayout(new java.awt.BorderLayout());
        panelTop.add(getPanelLeft(), java.awt.BorderLayout.WEST);
        panelTop.add(getPanelRight(), java.awt.BorderLayout.CENTER);
        panelTop.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        panelTop.setLayout(new java.awt.GridLayout(1, 2));       
        return panelTop;
    }
    
    private JPanel getPanelRight(){
        JPanel panelRight = new JPanel();
        panelRight.setPreferredSize(new java.awt.Dimension(100, 100));
        panelRight.setLayout(new java.awt.GridLayout(2, 0));

        txtUserName = new JTextField();
        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLogin.doClick();
            }
        });
        panelRight.add(txtUserName);

        txtPassword = new JPasswordField();
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassword.requestFocus();
            }
        });
        panelRight.add(txtPassword);
        return panelRight;
    }
    
    private JPanel getPanelLeft(){
        JPanel panelLeft = new JPanel();
        panelLeft.setLayout(new java.awt.GridLayout(2, 0));

        JLabel lblUserName = new JLabel();
        lblUserName.setText("User Name :");
        panelLeft.add(lblUserName);

        JLabel lblPassword = new JLabel();
        lblPassword.setText("Password :");
        panelLeft.add(lblPassword);
        
        return panelLeft;
    }

    private JPanel getPanelBottom(){
        JPanel panelBottom = new JPanel();
        panelBottom.setPreferredSize(new java.awt.Dimension(100, 30));
        panelBottom.setLayout(new java.awt.GridLayout(1, 0));

        btLogin = new JButton();
        btLogin.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("assets/bt-login.png")));
        btLogin.setMnemonic('L');
        btLogin.setFocusable(false);
        btLogin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btLogin.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLoginActionPerformed(evt);
            }
        });
        panelBottom.add(btLogin);

        btReset = new JButton();
        btReset.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("assets/bt-reset.png")));
        btReset.setMnemonic('R');
        btReset.setFocusable(false);
        btReset.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btReset.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btResetActionPerformed(evt);
            }
        });
        panelBottom.add(btReset);
        
        return panelBottom;
    }
    
    private void btLoginActionPerformed(java.awt.event.ActionEvent evt) {
        String userName = txtUserName.getText().trim();
        String password = String.valueOf(txtPassword.getPassword()).trim();
        if (userName != null){
            if (password != null){
                int loginResult = authService.login(userName, password);
                
            }else {
                JOptionPane.showMessageDialog(rootPane, "Password can not be empty");
            }
        }else {
            JOptionPane.showMessageDialog(rootPane, "User name can not be empty");
        }
    }
    
    private void btResetActionPerformed(java.awt.event.ActionEvent evt){
        
    }
    
}
