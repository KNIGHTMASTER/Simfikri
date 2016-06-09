package com.tamam.simfikri.ui.component.frame;

import javax.swing.JFrame;

/**
 * 
 * @author <a href="fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
public interface IFrameSetup {
    
    void doCompleteSetup(JFrame p_JFrame);
    
    void setView(JFrame p_JFrame);
    
    void setIcon(JFrame p_JFrame);
}
