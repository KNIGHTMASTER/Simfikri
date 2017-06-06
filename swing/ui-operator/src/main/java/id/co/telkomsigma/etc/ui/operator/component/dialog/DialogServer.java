package id.co.telkomsigma.etc.ui.operator.component.dialog;

import id.co.telkomsigma.etc.swing.component.base.ICentralizePositionComponent;
import id.co.telkomsigma.etc.swing.component.base.IComponentAction;
import id.co.telkomsigma.etc.swing.component.base.IComponentInitializer;
import id.co.telkomsigma.etc.swing.component.base.IComponentMenuCallable;
import id.co.telkomsigma.etc.ui.operator.component.view.tab.TabSettings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;

/**
 * 
 * @author <a href="fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class DialogServer extends JDialog implements IComponentInitializer, IComponentAction, IComponentMenuCallable{

    /**
     *
     *
     */
    private static final long serialVersionUID = 6858232016968301160L;

    private static final Logger LOGGER = LoggerFactory.getLogger(DialogServer.class);

    @Autowired
    TabSettings tabSettings;

    @Autowired
    ICentralizePositionComponent centralizePositionComponent;

    public boolean isInitialized = false;


    @Override
    public void initComponents() {
        this.setTitle("Application Settings");
        this.setModal(true);
        this.setResizable(false);
        this.setSize(500, 250);
        centralizePositionComponent.setDialogToCenter(this);

        this.add(tabSettings);

        isInitialized = true;
    }                
    
    @Override
    public void initAction() {
    }

    @Override
    public void setMainFrame(JFrame p_MainFrame) {

    }

    @Override
    public boolean isInitialized() {
        return isInitialized;
    }
}
