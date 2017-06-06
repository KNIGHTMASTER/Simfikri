package id.co.telkomsigma.etc.ui.operator.component.view.internalframe.serverlog;

import id.co.telkomsigma.etc.swing.component.base.IComponentInitializer;
import id.co.telkomsigma.etc.ui.operator.component.view.panel.internalframe.serverlog.InternalFrameServerLogPanelMain;
import javax.swing.JInternalFrame;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 
 * @author <a href="fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class InternalFrameServerLog extends JInternalFrame implements IComponentInitializer {
    
    private static final long serialVersionUID = 2050146819048634765L;
    
    @Autowired
    private InternalFrameServerLogPanelMain logPanelMain;

    @Override
    public void initComponents() {
        this.add(logPanelMain, java.awt.BorderLayout.CENTER);
        pack();
    }

    public InternalFrameServerLogPanelMain getLogPanelMain() {
        return logPanelMain;
    }

}
