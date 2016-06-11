package com.tamam.simfikri.ui.component.view.desktoppane;

import com.tamam.simfikri.ui.component.base.IComponentInitalizer;
import javax.annotation.PostConstruct;
import javax.swing.JDesktopPane;
import org.springframework.stereotype.Component;

/**
 * 
 * @author <a href="fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class DesktopPaneMain extends JDesktopPane implements IComponentInitalizer{
    
    private static final long serialVersionUID = 8027135626383207342L;

    @PostConstruct
    @Override
    public void init() {
        
    }

}
