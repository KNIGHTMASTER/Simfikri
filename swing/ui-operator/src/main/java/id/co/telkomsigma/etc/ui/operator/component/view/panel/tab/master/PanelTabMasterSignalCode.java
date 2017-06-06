package id.co.telkomsigma.etc.ui.operator.component.view.panel.tab.master;

import id.co.telkomsigma.etc.swing.component.base.IComponentInitializer;
import id.co.telkomsigma.etc.ui.operator.component.scrollpane.ScrollPaneTableSignalCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;

import static java.awt.BorderLayout.CENTER;

/**
 * Created on 6/5/17.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class PanelTabMasterSignalCode extends JPanel implements IComponentInitializer{
    /**
     *
     *
     */
    private static final long serialVersionUID = 3441202783304568716L;

    @Autowired
    ScrollPaneTableSignalCode scrollPaneTableSignalCode;

    @PostConstruct
    @Override
    public void initComponents() {
        this.setLayout(new BorderLayout());
        this.add(scrollPaneTableSignalCode, CENTER);
    }
}
