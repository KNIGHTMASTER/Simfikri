package id.co.telkomsigma.etc.ui.operator.component.chart;

import id.co.telkomsigma.etc.swing.component.base.IComponentInitializer;
import id.co.telkomsigma.etc.swing.component.chart.IChartGenerator;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.Dataset;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.util.List;

/**
 * Created on 5/31/17.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class BarObuHealthChart extends JPanel implements IComponentInitializer, IChartGenerator<BarObuHealthChart>{
    /**
     *
     *
     */
    private static final long serialVersionUID = 7310036734466116185L;

    private List<BarObuHealthChart> dataSetList;

    @PostConstruct
    @Override
    public void initComponents() {
        ChartPanel chartPanel = new ChartPanel(getChart("Transaction Chart", getDataSet()));
        this.add(chartPanel);
    }

    @Override
    public void insertDataSet(List<BarObuHealthChart> dataSetList) {
        this.dataSetList = dataSetList;
    }

    @Override
    public Dataset getDataSet() {
        final String fait = "FAIT";
        final String audi = "AUDI";
        final String ford = "FORD";
        final String speed = "Speed";
        final String popular = "Popular";
        final String mailage = "Mailage";
        final String userrating = "User Rating";
        final String safety = "safety";

        DefaultCategoryDataset defaultCategoryDataset = new DefaultCategoryDataset();
        defaultCategoryDataset.addValue(1.0, fait, speed);
        defaultCategoryDataset.addValue(4.0, fait, popular);
        defaultCategoryDataset.addValue(3.0, fait, userrating);
        defaultCategoryDataset.addValue(5.0, fait, mailage);
        defaultCategoryDataset.addValue(5.0, fait, safety);

        defaultCategoryDataset.addValue(5.0, audi, speed);
        defaultCategoryDataset.addValue(7.0, audi, popular);
        defaultCategoryDataset.addValue(6.0, audi, userrating);
        defaultCategoryDataset.addValue(10.0, audi, mailage);
        defaultCategoryDataset.addValue(4.0, audi, safety);

        defaultCategoryDataset.addValue(4.0, ford, speed);
        defaultCategoryDataset.addValue(3.0, ford, popular);
        defaultCategoryDataset.addValue(2.0, ford, userrating);
        defaultCategoryDataset.addValue(3.0, ford, mailage);
        defaultCategoryDataset.addValue(6.0, ford, safety);
        return defaultCategoryDataset;
    }

    @Override
    public JFreeChart getChart(String p_ChartTitle, Dataset p_DataSet) {
        return ChartFactory.createBarChart3D(
                "Car Usage Statistics",
                "Category",
                "Score",
                (CategoryDataset) p_DataSet,
                PlotOrientation.VERTICAL,
                true, true, false);
    }
}
