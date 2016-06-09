package com.tamam.simfikri.ui.component.frame;

import com.tamam.simfikri.ui.component.icon.IIconFrame;
import java.awt.Frame;
import javax.swing.JFrame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 
 * @author <a href="fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class FrameSetupImpl implements IFrameSetup{        

    @Autowired
    IIconFrame iIconFrame;

    @Override
    public void doCompleteSetup(JFrame p_JFrame) {
        setView(p_JFrame);
        setIcon(p_JFrame);
    }    
    
    @Override
    public void setView(JFrame p_JFrame) {
        p_JFrame.setExtendedState(Frame.MAXIMIZED_BOTH);
    }

    @Override
    public void setIcon(JFrame p_JFrame) {
        iIconFrame.setIconFrame(p_JFrame);
    }
        
      
}
