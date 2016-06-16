package com.tamam.simfikri.ui.component.view.internalframe.serverlog;

import com.tamam.swing.component.base.IComponentInitalizer;
import com.tamam.simfikri.ui.component.view.panel.internalframe.serverlog.InternalFrameServerLogPanelMain;
import javax.swing.JInternalFrame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 
 * @author <a href="fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class InternalFrameServerLog extends JInternalFrame implements IComponentInitalizer{
    
    private static final long serialVersionUID = 2050146819048634765L;
    
    @Autowired
    private InternalFrameServerLogPanelMain logPanelMain;

    @Override
    public void init() {
        this.add(logPanelMain, java.awt.BorderLayout.CENTER);
        pack();
    }

    public InternalFrameServerLogPanelMain getLogPanelMain() {
        return logPanelMain;
    }

}
