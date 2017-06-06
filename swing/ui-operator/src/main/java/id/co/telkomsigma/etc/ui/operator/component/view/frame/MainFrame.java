package id.co.telkomsigma.etc.ui.operator.component.view.frame;

import id.co.telkomsigma.etc.ui.operator.component.dialog.DialogAbout;
import id.co.telkomsigma.etc.ui.operator.component.dialog.DialogLogin;
import id.co.telkomsigma.etc.ui.operator.component.dialog.DialogServer;
import id.co.telkomsigma.etc.ui.operator.component.dialog.DialogTheme;
import id.co.telkomsigma.etc.ui.operator.component.frame.IFrameSetup;
import id.co.telkomsigma.etc.ui.operator.component.view.desktoppane.DesktopPaneMain;
import id.co.telkomsigma.etc.ui.operator.component.view.internalframe.dashboard.InternalFrameDashboard;
import id.co.telkomsigma.etc.ui.operator.controller.frame.ControllerFrameMain;
import id.co.telkomsigma.etc.ui.operator.controller.frame.ParamControllerFrameMain;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author <a href="fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class MainFrame extends javax.swing.JFrame {

    /**
     *
     *
     */
    private static final long serialVersionUID = -7864902051693765103L;

    private static final Logger LOGGER = LoggerFactory.getLogger(MainFrame.class);
    
    final Toolkit toolkit = Toolkit.getDefaultToolkit();
    final Dimension screenSize = toolkit.getScreenSize();
    
    private ParamControllerFrameMain paramControllerFrameMain;
    
    @Autowired
    private IFrameSetup frameSetup;
    
    @Autowired
    private DialogTheme dialogTheme;
    
    @Autowired
    private DialogLogin dialogLogin;
    
    @Autowired
    private DialogAbout dialogAbout;
    
    @Autowired
    private DialogServer dialogServer;
    
    @Autowired
    private DesktopPaneMain desktopPaneMain;
    
    @Autowired
    private InternalFrameDashboard internalFrameDashboard;

    @Autowired
    private ControllerFrameMain controllerFrameMain;

    private javax.swing.JMenu menuLogin;
    private javax.swing.JMenu menuMain;
    private javax.swing.JMenu menuSetting;
    private javax.swing.JMenuItem subMenuAbout;
    private javax.swing.JMenuItem subMenuDashboard;
    private javax.swing.JMenuItem subMenuLogin;
    private javax.swing.JMenuItem subMenuLogout;
    private javax.swing.JMenuItem subMenuServer;
    private javax.swing.JMenuItem subMenuTheme;

    @PostConstruct
    public void setupFrame(){        
        frameSetup.doCompleteSetup(MainFrame.this, MainFrame.this);
        initButton();
        setMenuVisibility(false);        
        setContentPane(desktopPaneMain);
        initParam();
        controllerFrameMain.setComponent(paramControllerFrameMain);
    }


    private void initParam(){
        paramControllerFrameMain = new ParamControllerFrameMain();
        
        paramControllerFrameMain.setScreenSizeHeight(screenSize.height);
        paramControllerFrameMain.setScreenSizeWidth(screenSize.width);
        paramControllerFrameMain.setObserverHeight(this.HEIGHT);
        paramControllerFrameMain.setObserverWidth(this.WIDTH);
        
        paramControllerFrameMain.setMainFrame(this);
        paramControllerFrameMain.setDesktopPaneMain(desktopPaneMain);
        paramControllerFrameMain.setDialogAbout(dialogAbout);
        paramControllerFrameMain.setDialogLogin(dialogLogin);
        paramControllerFrameMain.setDialogServer(dialogServer);
        paramControllerFrameMain.setDialogTheme(dialogTheme);
        paramControllerFrameMain.setInternalFrameDashboard(internalFrameDashboard);

        /*Init Sub Controller that Require instance of Frame*/
        /*ParamCardPanelMaster paramCardPanelMaster = new ParamCardPanelMaster();
        paramCardPanelMaster.setDesktopPaneMain(desktopPaneMain);
        paramCardPanelMaster.setMainFrame(MainFrame.this);
        internalFrameDashboard.getPanelCenter().getCardPanelMaster().getCardPanelMasterTop().getControllerCardPanelMasterTop().setComponent(paramCardPanelMaster);*/
    }
    
    private void initButton(){
        menuMain.setIcon(new ImageIcon(getClass().getClassLoader().getResource("assets/menu-main.png")));
        subMenuDashboard.setIcon(new ImageIcon(getClass().getClassLoader().getResource("assets/dashboard-small.png")));        
        menuLogin.setIcon(new ImageIcon(getClass().getClassLoader().getResource("assets/menu-login.png")));
        subMenuLogin.setIcon(new ImageIcon(getClass().getClassLoader().getResource("assets/sub-menu-login.png")));
        subMenuLogout.setIcon(new ImageIcon(getClass().getClassLoader().getResource("assets/menu-logout.png")));
        menuSetting.setIcon(new ImageIcon(getClass().getClassLoader().getResource("assets/menu-setting.png")));
        subMenuTheme.setIcon(new ImageIcon(getClass().getClassLoader().getResource("assets/menu-theme.png")));
        subMenuAbout.setIcon(new ImageIcon(getClass().getClassLoader().getResource("assets/menu-about.png")));
        subMenuServer.setIcon(new ImageIcon(getClass().getClassLoader().getResource("assets/bt-network.png")));
    }
    
    public void setMenuVisibility(boolean b){
        menuMain.setVisible(b);
        subMenuDashboard.setVisible(b);
        subMenuLogin.setVisible(!b);
        subMenuLogout.setVisible(b);
    }
    
    public MainFrame() {
        initComponents();        
    }

    private void initComponents() {
        JMenuBar menuBar = new JMenuBar();
        menuMain = new javax.swing.JMenu();
        subMenuDashboard = new javax.swing.JMenuItem();
        menuLogin = new javax.swing.JMenu();
        subMenuLogin = new javax.swing.JMenuItem();
        subMenuLogout = new javax.swing.JMenuItem();
        menuSetting = new javax.swing.JMenu();
        subMenuTheme = new javax.swing.JMenuItem();
        subMenuAbout = new javax.swing.JMenuItem();
        subMenuServer = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ETC Operator");

        menuMain.setText("Main");

        subMenuDashboard.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        subMenuDashboard.setText("Dashboard");
        subMenuDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuDashboardActionPerformed(evt);
            }
        });
        menuMain.add(subMenuDashboard);

        menuBar.add(menuMain);

        menuLogin.setText("Auth");

        subMenuLogin.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        subMenuLogin.setText("Login");
        subMenuLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuLoginActionPerformed(evt);
            }
        });
        menuLogin.add(subMenuLogin);

        subMenuLogout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        subMenuLogout.setText("Logout");
        subMenuLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuLogoutActionPerformed(evt);
            }
        });
        menuLogin.add(subMenuLogout);

        menuBar.add(menuLogin);

        menuSetting.setText("setting");

        subMenuTheme.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        subMenuTheme.setText("Theme");
        subMenuTheme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuThemeActionPerformed(evt);
            }
        });
        menuSetting.add(subMenuTheme);

        subMenuServer.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        subMenuServer.setText("Server");
        subMenuServer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuServerActionPerformed(evt);
            }
        });
        menuSetting.add(subMenuServer);

        subMenuAbout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        subMenuAbout.setText("About");
        subMenuAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuAboutActionPerformed(evt);
            }
        });
        menuSetting.add(subMenuAbout);


        menuBar.add(menuSetting);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 348, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }

    private void subMenuDashboardActionPerformed(java.awt.event.ActionEvent evt) {
        controllerFrameMain.subMenuDashboardActionPerformed();
    }

    private void subMenuLoginActionPerformed(java.awt.event.ActionEvent evt) {
        controllerFrameMain.subMenuLoginActionPerformed();
    }

    private void subMenuLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuLogoutActionPerformed
        setMenuVisibility(false);
    }

    private void subMenuThemeActionPerformed(java.awt.event.ActionEvent evt) {
        controllerFrameMain.subMenuThemeActionPerformed();
    }

    private void subMenuAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuAboutActionPerformed
        dialogAbout.setVisible(true);
    }

    private void subMenuServerActionPerformed(java.awt.event.ActionEvent evt) {
        controllerFrameMain.subMenuServerActionPerformed();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

}
