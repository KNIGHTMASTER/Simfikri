package id.co.telkomsigma.etc.ui.operator.component.scrollpane;

import id.co.telkomsigma.etc.swing.component.base.IComponentInitializer;
import id.co.telkomsigma.etc.ui.operator.component.tabel.view.TableBlackList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;

/**
 * Created on 6/5/17.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class ScrollPaneTableBlackList extends JScrollPane implements IComponentInitializer {
    /**
     *
     *
     */
    private static final long serialVersionUID = 3183033481449105827L;

    @Autowired
    TableBlackList tableBlackList;

    @PostConstruct
    @Override
    public void initComponents() {
        setViewportView(tableBlackList);
    }
}
