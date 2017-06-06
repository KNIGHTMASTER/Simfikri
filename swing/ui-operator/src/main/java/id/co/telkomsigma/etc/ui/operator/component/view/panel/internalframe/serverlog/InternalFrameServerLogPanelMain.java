package id.co.telkomsigma.etc.ui.operator.component.view.panel.internalframe.serverlog;

import id.co.telkomsigma.etc.swing.component.base.IComponentInitializer;
import javax.annotation.PostConstruct;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import org.springframework.stereotype.Component;

/**
 *
 * @author <a href="fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class InternalFrameServerLogPanelMain extends JPanel implements IComponentInitializer {

    private static final long serialVersionUID = -7724521492316719243L;

    private JTextArea txtAreaLog;
    private JScrollPane scroller;

    @PostConstruct
    @Override
    public void initComponents() {
        txtAreaLog = new JTextArea();
        txtAreaLog.setEditable(false);
        txtAreaLog.setColumns(50);
        txtAreaLog.setRows(1);
        txtAreaLog.setLineWrap(true);
        txtAreaLog.setWrapStyleWord(true);
        
        scroller = new javax.swing.JScrollPane();        

        scroller.setViewportView(txtAreaLog);
        this.add(scroller, java.awt.BorderLayout.CENTER);
    }

    public JTextArea getTxtAreaLog() {
        return txtAreaLog;
    }

    public JScrollPane getScroller() {
        return scroller;
    }
    
}
