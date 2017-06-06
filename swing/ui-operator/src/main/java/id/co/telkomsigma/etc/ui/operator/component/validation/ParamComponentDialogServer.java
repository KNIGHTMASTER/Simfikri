package id.co.telkomsigma.etc.ui.operator.component.validation;

import id.co.telkomsigma.etc.service.parameter.ParamFTPServer;
import java.awt.Component;

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
