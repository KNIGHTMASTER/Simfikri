package id.co.telkomsigma.etc.ui.operator.component.scrollpane;

import id.co.telkomsigma.etc.swing.component.base.IComponentInitializer;
import id.co.telkomsigma.etc.ui.operator.component.tabel.view.TableSignalCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;

/**
 * Created on 5/30/17.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class ScrollPaneTableSignalCode extends JScrollPane implements IComponentInitializer {
    /**
     *
     *
     */
    private static final long serialVersionUID = -8591907702497027868L;

    @Autowired
    TableSignalCode tableSignalCode;

    @PostConstruct
    @Override
    public void initComponents() {
        this.setViewportView(tableSignalCode);
    }
}
