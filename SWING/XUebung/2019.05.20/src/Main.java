
import java.io.File;
import java.io.IOException;
import java.time.DateTimeException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.chart.PieChart;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.xy.DefaultXYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matthäus
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//                DefaultPieDataset data = new DefaultPieDataset();
//                data.setValue("Red", 200);
//                data.setValue("blue", 400);
//                JFreeChart chart = ChartFactory.createPieChart("Farben", data, true, true, Locale.FRENCH);
//        try {
//            ChartUtilities.saveChartAsJPEG(new File("C:\\Users\\Matthäus\\Desktop\\Jeremias\\new.jpg"), chart, 200, 200);
//        } catch (IOException ex) {
//            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
//        XYSeries xy = new XYSeries("XY-Graph");
//        xy.add(2, 3);
//        xy.add(4, 5l);
//         XYSeriesCollection data = new XYSeriesCollection();
//         data.addSeries(xy);
//         JFreeChart chart = ChartFactory.createXYLineChart("Asia", "Wurst", "Nudeln", data, PlotOrientation.HORIZONTAL, true, true, true);
//        try {
//            ChartUtilities.saveChartAsJPEG(new File("C:\\Users\\Matthäus\\Desktop\\Jeremias\\new2.jpg"), chart, 200, 200);
//        } catch (IOException ex) {
//            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//        DefaultCategoryDataset data = new DefaultCategoryDataset();
//        data.addValue(20, "Justin", "Nudeln");
//        data.addValue(30, "Justin", "Hass");
//        data.addValue(40, "Tulli", "Nudeln");
//        data.addValue(10, "Tulli", "Hass");
//        JFreeChart chart = ChartFactory.createBarChart("Nudeln", "Butter", "kekse", data, PlotOrientation.VERTICAL, true, true, true);
//        try {
//            ChartUtilities.saveChartAsJPEG(new File("C:\\Users\\Matthäus\\Desktop\\Jeremias\\new3.jpg"), chart, 200, 200);
//        } catch (IOException ex) {
//            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
    }
    
    
}
