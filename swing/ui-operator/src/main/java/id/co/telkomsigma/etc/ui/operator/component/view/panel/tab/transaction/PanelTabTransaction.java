package id.co.telkomsigma.etc.ui.operator.component.view.panel.tab.transaction;

import id.co.telkomsigma.etc.swing.component.base.IComponentInitializer;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;

/**
 * Created on 5/30/17.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class PanelTabTransaction extends JPanel implements IComponentInitializer {
    /**
     *
     *
     */
    private static final long serialVersionUID = -714143334777724264L;

    /*@Autowired
    ScrollPaneTableSignalCode scrollPaneTableSignalCode;*/

    @PostConstruct
    @Override
    public void initComponents() {
        this.setLayout(new BorderLayout());
//        this.add(scrollPaneTableSignalCode, CENTER);
    }
}
