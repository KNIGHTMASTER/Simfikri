package id.co.telkomsigma.etc.ui.operator.component.view.internalframe.master;

import id.co.telkomsigma.etc.swing.component.base.ICentralizePositionComponent;
import id.co.telkomsigma.etc.swing.component.base.IComponentInitializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;

/**
 * Created on 6/2/17.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class InternalFrameMasterBlackList extends JInternalFrame implements IComponentInitializer{

    /**
     *
     *
     */
    private static final long serialVersionUID = -6207374013418585137L;

    /*@Autowired
    ScrollPaneTableBlackList scrollPaneTableBlackList;*/

    @Autowired
    private ICentralizePositionComponent centralizePositionComponent;

    @PostConstruct
    @Override
    public void initComponents() {
        this.setMaximizable(true);
        this.setResizable(true);
        this.setClosable(true);
        this.setIconifiable(true);

        this.setSize(1000, 500);

        this.setTitle("Master Black List");

        this.setLayout(new BorderLayout());
        /*this.add(scrollPaneTableBlackList, CENTER);*/

        centralizePositionComponent.setComponentToCenter(this);
    }
}
