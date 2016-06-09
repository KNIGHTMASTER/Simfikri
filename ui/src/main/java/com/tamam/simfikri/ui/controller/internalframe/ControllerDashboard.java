package com.tamam.simfikri.ui.controller.internalframe;

import java.awt.CardLayout;
import javax.swing.JPanel;
import org.springframework.stereotype.Component;

/**
 * 
 * @author <a href="fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class ControllerDashboard {
    
    public void buttonDashboardActionPerformed(java.awt.event.ActionEvent evt, JPanel p_CardLayout){
        CardLayout cl=(CardLayout) p_CardLayout.getLayout();        
        cl.show(p_CardLayout, "dashboard");
    }
    
    public void buttonMasterActionPerformed(java.awt.event.ActionEvent evt, JPanel p_CardLayout){
        CardLayout cl=(CardLayout) p_CardLayout.getLayout();        
        cl.show(p_CardLayout, "master");
    }
    
    public void buttonTransactionActionPerformed(java.awt.event.ActionEvent evt, JPanel p_CardLayout){
        CardLayout cl=(CardLayout) p_CardLayout.getLayout();                
        cl.show(p_CardLayout, "transaksi");
    }
    
    
    public void buttonReportActionPerformed(java.awt.event.ActionEvent evt, JPanel p_CardLayout){
        CardLayout cl=(CardLayout) p_CardLayout.getLayout();        
        cl.show(p_CardLayout, "laporan");
    }
    
    public void buttonMaintenanceActionPerformed(java.awt.event.ActionEvent evt, JPanel p_CardLayout){
        CardLayout cl=(CardLayout) p_CardLayout.getLayout();        
        cl.show(p_CardLayout, "maintenance");
    }
}
