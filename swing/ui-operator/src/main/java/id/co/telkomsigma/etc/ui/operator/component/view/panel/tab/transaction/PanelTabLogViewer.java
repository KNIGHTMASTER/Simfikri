package id.co.telkomsigma.etc.ui.operator.component.view.panel.tab.transaction;

import id.co.telkomsigma.etc.swing.component.base.IComponentInitializer;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;

/**
 * Created on 5/30/17.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class PanelTabLogViewer extends JPanel implements IComponentInitializer {
    /**
     *
     *
     */
    private static final long serialVersionUID = -714143334777724264L;

    private JLabel label1 = new JLabel();

    @PostConstruct
    @Override
    public void initComponents() {
        label1.setText("Tab Log Viewer");
    }
}
