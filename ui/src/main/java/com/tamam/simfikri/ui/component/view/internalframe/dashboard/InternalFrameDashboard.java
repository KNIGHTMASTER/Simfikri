package com.tamam.simfikri.ui.component.view.internalframe.dashboard;

import com.tamam.simfikri.ui.component.base.IComponentInitalizer;
import com.tamam.simfikri.ui.component.button.dashboard.ButtonDashboard;
import com.tamam.simfikri.ui.component.button.dashboard.ButtonMaintenance;
import com.tamam.simfikri.ui.component.button.dashboard.ButtonMaster;
import com.tamam.simfikri.ui.component.button.dashboard.ButtonReport;
import com.tamam.simfikri.ui.component.button.dashboard.ButtonTransaction;
import com.tamam.simfikri.ui.component.view.panel.internalframe.dashboard.InternalFrameDashboardPanelCenter;
import com.tamam.simfikri.ui.component.view.panel.internalframe.dashboard.InternalFrameDashboardPanelLeft;
import com.tamam.simfikri.ui.controller.internalframe.ControllerDashboard;
import javax.annotation.PostConstruct;
import javax.swing.JInternalFrame;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 
 * @author <a href="fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class InternalFrameDashboard extends JInternalFrame implements IComponentInitalizer{
    
    private static final long serialVersionUID = -7054309726946051212L;
    private Logger logger = LoggerFactory.getLogger(InternalFrameDashboard.class);

    @Autowired
    private InternalFrameDashboardPanelLeft panelLeft;
    
    @Autowired
    private InternalFrameDashboardPanelCenter panelCenter;
    
    @Autowired
    private ButtonDashboard buttonDashboard;
    
    @Autowired
    private ButtonMaintenance buttonMaintenance;
    
    @Autowired
    private ButtonMaster buttonMaster;
    
    @Autowired
    private ButtonReport buttonReport;
    
    @Autowired
    private ButtonTransaction buttonTransaction;
    
    @Autowired
    private ControllerDashboard controllerDashboard;
    
    @PostConstruct
    @Override
    public void init() {        
        this.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Dashboard"));
        this.setMaximizable(true);
        this.setResizable(true);
        this.setClosable(true);
        this.setIconifiable(true);
        
        initButton();
        initAction();                

        this.add(panelLeft, java.awt.BorderLayout.PAGE_END);                
        this.getContentPane().add(panelCenter, java.awt.BorderLayout.CENTER);
    }        
    
    private void initButton(){
        panelLeft.add(buttonDashboard);
        panelLeft.add(buttonMaster);
        panelLeft.add(buttonTransaction);
        panelLeft.add(buttonReport);
        panelLeft.add(buttonMaintenance);
    }

    private void initAction(){
        buttonDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                controllerDashboard.buttonDashboardActionPerformed(evt, panelCenter);
            }
        });
        
        buttonMaster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                controllerDashboard.buttonMasterActionPerformed(evt, panelCenter);
            }
        });
                
        buttonTransaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                controllerDashboard.buttonTransactionActionPerformed(evt, panelCenter);
            }
        });
        
        buttonReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                controllerDashboard.buttonReportActionPerformed(evt, panelCenter);
            }
        });
        
        buttonMaintenance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                controllerDashboard.buttonMaintenanceActionPerformed(evt, panelCenter);
            }
        });
    }
    
    
   
}
