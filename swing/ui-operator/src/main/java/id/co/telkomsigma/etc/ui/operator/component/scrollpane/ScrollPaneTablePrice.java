package id.co.telkomsigma.etc.ui.operator.component.scrollpane;

import id.co.telkomsigma.etc.swing.component.base.IComponentInitializer;
import id.co.telkomsigma.etc.ui.operator.component.tabel.view.TablePrice;
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
public class ScrollPaneTablePrice extends JScrollPane implements IComponentInitializer{
    /**
     *
     *
     */
    private static final long serialVersionUID = -4808693085940615538L;

    @Autowired
    TablePrice tablePrice;


    @PostConstruct
    @Override
    public void initComponents() {
        setViewportView(tablePrice);
    }
}
