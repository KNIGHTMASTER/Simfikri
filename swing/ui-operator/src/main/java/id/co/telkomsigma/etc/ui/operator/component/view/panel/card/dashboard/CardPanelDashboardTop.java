package id.co.telkomsigma.etc.ui.operator.component.view.panel.card.dashboard;

import id.co.telkomsigma.etc.swing.component.base.IComponentInitializer;
import id.co.telkomsigma.etc.ui.operator.component.label.LabelImageDashboard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;

/**
 * Created on 5/31/17.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class CardPanelDashboardTop extends JPanel implements IComponentInitializer{
    /**
     *
     *
     */
    private static final long serialVersionUID = -3000558294378464916L;

    @Autowired
    private LabelImageDashboard labelImageDashboard;

    @PostConstruct
    @Override
    public void initComponents() {
        this.setLayout(new BorderLayout());
        this.add(labelImageDashboard, BorderLayout.NORTH);
    }
}
