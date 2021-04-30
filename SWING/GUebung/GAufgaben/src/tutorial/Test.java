/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial;

import java.io.File;
import java.io.IOException;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.xy.StandardXYItemRenderer;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.time.Day;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author jgruenauer17
 */
public class Test {

    public static void main(String[] args) {
//        pieChart();
//        xyChart();
//        barChart();
        timeseries();
    }

    private static void pieChart() {
        // Create a simple pie chart
        DefaultPieDataset pieDataset = new DefaultPieDataset();
        pieDataset.setValue("A", new Integer(75));
        pieDataset.setValue("B", new Integer(10));
        pieDataset.setValue("C", new Integer(10));
        pieDataset.setValue("D", new Integer(5));
        JFreeChart chart = ChartFactory.createPieChart("CSC408 Mark Distribution", // Title
                pieDataset, // Dataset
                true, // Show legend
                true, // Use tooltips
                false // Configure chart to generate URLs?
        );
        try {
            ChartUtilities.saveChartAsPNG(new File("S:\\2m\\jgruenauer17\\MGIN\\2.Semester\\GUebung\\GAufgaben\\chart1.jpg"), chart, 500, 300);
        } catch (Exception e) {
            System.out.println("Problem occurred creating chart.");
        }
    }

    private static void xyChart() {
        // Create a simple XY chart
        XYSeries series = new XYSeries("XYGraph");
        series.add(1, 1);
        series.add(1, 2);
        series.add(2, 1);
        series.add(3, 9);
        series.add(4, 10);
        // Add the series to your data set
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(series);
        // Generate the graph
        JFreeChart chart = ChartFactory.createXYAreaChart(
                "XY Chart", // Title
                "x-axis", // x-axis Label
                "y-axis", // y-axis Label
                dataset, // Dataset
                PlotOrientation.VERTICAL, // Plot Orientation
                true, // Show Legend
                true, // Use tooltips
                false // Configure chart to generate URLs?
        );
        try {
            ChartUtilities.saveChartAsJPEG(new File("S:\\2m\\jgruenauer17\\MGIN\\2.Semester\\GUebung\\GAufgaben\\chart2.jpg"), chart, 500, 300);
        } catch (IOException e) {
            System.err.println("Problem occurred creating chart.");
        }
    }

    private static void barChart() {
        // Create a simple Bar chart
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.setValue(6, "Profit", "Jane");
        dataset.setValue(7, "Profit", "Tom");
        dataset.setValue(8, "Profit", "Jill");
        dataset.setValue(5, "Profit", "John");
        dataset.setValue(12, "Profit", "Fred");
        JFreeChart chart = ChartFactory.createBarChart3D("Comparison between Salesman",
                "Salesman", "Profit", dataset, PlotOrientation.VERTICAL,
                false, true, false);
        try {
            ChartUtilities.saveChartAsJPEG(new File("S:\\2m\\jgruenauer17\\MGIN\\2.Semester\\GUebung\\GAufgaben\\chart3.jpg"), chart, 500, 300);
        } catch (IOException e) {
            System.err.println("Problem occurred creating chart.");
        }
    }

    private static void timeseries() {
        // Create a time series chart
        TimeSeries pop = new TimeSeries("Population", Day.class);
        pop.add(new Day(10, 1, 2004), 100);
        pop.add(new Day(10, 2, 2004), 150);
        pop.add(new Day(10, 3, 2004), 250);
        pop.add(new Day(10, 4, 2004), 275);
        pop.add(new Day(10, 5, 2004), 325);
        pop.add(new Day(10, 6, 2004), 425);
        
        TimeSeriesCollection dataset = new TimeSeriesCollection();
        dataset.addSeries(pop);
        
        JFreeChart chart = ChartFactory.createTimeSeriesChart(
                "Population of CSC408 Town",
                "Date",
                "Population",
                dataset,
                true,
                true,
                false);
        try {
            ChartUtilities.saveChartAsJPEG(new File("S:\\2m\\jgruenauer17\\MGIN\\2.Semester\\GUebung\\GAufgaben\\chart4.jpg"), chart, 500, 300);
        } catch (IOException e) {
            System.err.println("Problem occurred creating chart.");
        }
    }

}
