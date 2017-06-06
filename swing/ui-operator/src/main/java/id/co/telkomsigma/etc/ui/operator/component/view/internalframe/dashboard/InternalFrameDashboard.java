package id.co.telkomsigma.etc.ui.operator.component.view.internalframe.dashboard;

import id.co.telkomsigma.etc.swing.component.base.ICentralizePositionComponent;
import id.co.telkomsigma.etc.swing.component.base.IComponentAction;
import id.co.telkomsigma.etc.swing.component.base.IComponentInitializer;
import id.co.telkomsigma.etc.ui.operator.component.button.dashboard.*;
import id.co.telkomsigma.etc.ui.operator.component.view.panel.internalframe.dashboard.InternalFrameDashboardPanelCenter;
import id.co.telkomsigma.etc.ui.operator.component.view.panel.internalframe.dashboard.InternalFrameDashboardPanelLeft;
import id.co.telkomsigma.etc.ui.operator.controller.internalframe.dashboard.ControllerDashboard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;

/**
 * 
 * @author <a href="fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class InternalFrameDashboard extends JInternalFrame implements IComponentInitializer, IComponentAction {

    /**
     *
     *
     */
    private static final long serialVersionUID = -7054309726946051212L;

    @Autowired
    private InternalFrameDashboardPanelLeft panelLeft;

    @Autowired
    private InternalFrameDashboardPanelCenter panelCenter;
    
    @Autowired
    private ButtonDashboard buttonDashboard;

    @Autowired
    private ButtonMaster buttonMaster;
    
    @Autowired
    private ButtonMaintenance buttonMaintenance;
    
    @Autowired
    private ButtonReport buttonReport;
    
    @Autowired
    private ButtonTransaction buttonTransaction;
    
    @Autowired
    private ControllerDashboard controllerDashboard;

    @Autowired
    private ICentralizePositionComponent centralizePositionComponent;

    @PostConstruct
    @Override
    public void initComponents() {
        this.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Menu"));

        this.setMaximizable(true);
        this.setResizable(true);
        this.setClosable(true);
        this.setIconifiable(true);
        
        initButton();
        initAction();

        this.add(panelLeft, java.awt.BorderLayout.PAGE_END);                
        this.getContentPane().add(panelCenter, java.awt.BorderLayout.CENTER);


        centralizePositionComponent.setIFrameToCenter(this);
    }
    
    private void initButton(){
        panelLeft.add(buttonDashboard);
        panelLeft.add(buttonMaster);
        panelLeft.add(buttonTransaction);
        panelLeft.add(buttonReport);
        panelLeft.add(buttonMaintenance);
    }

    @Override
    public void initAction(){
        buttonDashboard.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                controllerDashboard.buttonDashboardActionPerformed(evt, panelCenter);
            }
        });
                
        buttonMaster.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                controllerDashboard.buttonMasterActionPerformed(evt, panelCenter);
            }
        });

        buttonTransaction.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                controllerDashboard.buttonTransactionActionPerformed(evt, panelCenter);
            }
        });
        
        buttonReport.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                controllerDashboard.buttonReportActionPerformed(evt, panelCenter);
            }
        });
        
        buttonMaintenance.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                controllerDashboard.buttonMaintenanceActionPerformed(evt, panelCenter);
            }
        });
    }

    public InternalFrameDashboardPanelCenter getPanelCenter() {
        return panelCenter;
    }
}
