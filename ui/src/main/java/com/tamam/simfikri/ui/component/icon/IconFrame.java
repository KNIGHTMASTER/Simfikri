package com.tamam.simfikri.ui.component.icon;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;
import org.springframework.stereotype.Component;

/**
 * 
 * @author <a href="fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class IconFrame implements IIconFrame{
    
    @Override
    public void setIconFrame(JFrame p_JFrame){
        Toolkit kit = Toolkit.getDefaultToolkit();        
        Image frameIcon = kit.getImage(getClass().getClassLoader().getResource("assets/jframeIcon.png"));
        p_JFrame.setIconImage(frameIcon);
    }
    
}
