package com.tamam.simfikri.ui.component.validation;

import com.tamam.simfikri.core.parameter.ParamFTPServer;
import java.awt.Component;
import javax.swing.JTextField;

/**
 * 
 * @author <a href="fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
public class ParamComponentDialogServer extends ParamFTPServer{
    
    private static final long serialVersionUID = 6869903066305527347L;

    private Component container;

    public Component getContainer() {
        return container;
    }

    public void setContainer(Component container) {
        this.container = container;
    }
    
    
}
