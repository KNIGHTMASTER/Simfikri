package id.co.telkomsigma.etc.ui.operator.component.chart;

import id.co.telkomsigma.etc.swing.component.base.IComponentInitializer;
import id.co.telkomsigma.etc.swing.component.chart.IChartGenerator;
import id.co.telkomsigma.etc.ui.operator.component.chart.data.PieTransactionData;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.Dataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.util.List;

/**
 * Created on 5/29/17.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class PieTransactionChart extends JPanel implements IComponentInitializer, IChartGenerator<PieTransactionData> {

    /**
     *
     *
     */
    private static final long serialVersionUID = 8810488477131640922L;
    private List<PieTransactionData> pieTransactionDatas;

    @PostConstruct
    @Override
    public void initComponents() {
        ChartPanel chartPanel = new ChartPanel(getChart("Transaction Chart", getDataSet()));
        this.add(chartPanel);
    }

    @Override
    public void insertDataSet(List<PieTransactionData> dataSetList) {
        this.pieTransactionDatas = dataSetList;
    }

    @Override
    public Dataset getDataSet() {
        DefaultPieDataset dataset = new DefaultPieDataset( );
        dataset.setValue( "IPhone 5s" , new Double( 20 ) );
        dataset.setValue( "SamSung Grand" , new Double( 20 ) );
        dataset.setValue( "MotoG" , new Double( 40 ) );
        dataset.setValue( "Nokia Lumia" , new Double( 10 ) );
        return dataset;
    }

    @Override
    public JFreeChart getChart(String p_ChartTitle, Dataset p_DataSet) {
        JFreeChart chart = ChartFactory.createPieChart(
                p_ChartTitle,
                (PieDataset) p_DataSet,
                true,
                true,
                false);

        return chart;
    }
}
