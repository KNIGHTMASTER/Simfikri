package id.co.telkomsigma.etc.ui.operator.component.view.panel.card.dashboard;

import id.co.telkomsigma.etc.swing.component.base.IComponentInitializer;
import id.co.telkomsigma.etc.ui.operator.component.chart.BarObuHealthChart;
import id.co.telkomsigma.etc.ui.operator.component.chart.PieTransactionChart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;

/**
 * Created on 5/31/17.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class CardPanelDashboardBottom extends JPanel implements IComponentInitializer{
    /**
     *
     *
     */
    private static final long serialVersionUID = -584886819660626205L;

    @Autowired
    PieTransactionChart pieTransactionChart;

    @Autowired
    BarObuHealthChart barObuHealthChart;

    @PostConstruct
    @Override
    public void initComponents() {
        this.setOpaque(false);
        this.setLayout(new java.awt.GridLayout(1, 2));

        this.add(pieTransactionChart);
        this.add(barObuHealthChart);
    }
}
