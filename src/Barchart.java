

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.util.ArrayList;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;


public class Barchart extends ApplicationFrame {
public String category = "";
public String mainTitle = "";

//
public Barchart(final String title  ,ArrayList<String> terms,ArrayList<Integer> freqs) {
        super(title);
        mainTitle = title;
        final CategoryDataset dataset = createDataset(title,terms,freqs);
        final JFreeChart chart = createChart(dataset);
        final ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(500, 270));
        setContentPane(chartPanel);
    }  

public Barchart(final String title  ,int posFrequency,int negFrequency) {
        super(title);
        mainTitle = title;
        final CategoryDataset dataset = createDataset(posFrequency,negFrequency);
        final JFreeChart chart = createChart(dataset);
        final ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(500, 270));
        setContentPane(chartPanel);
    }  

public Barchart(final String title  ,int posNegFrequency,int posPosFrequency ,int negNegFrequency,int negPosFrequency) {
        super(title);
        mainTitle = title;
        final CategoryDataset dataset = createDataset(posNegFrequency,posPosFrequency,negNegFrequency,negPosFrequency);
        final JFreeChart chart = createChart(dataset);
        final ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(500, 270));
        setContentPane(chartPanel);
    }  


//

public Barchart(final String title  ,int frequency) {
        super(title);
        mainTitle = title;
        final CategoryDataset dataset = createDataset(title,frequency);
        final JFreeChart chart = createChart(dataset);
        final ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(500, 270));
        setContentPane(chartPanel);
    }  

public Barchart(final String title  ,int firstVal,int secondVal,int thirdVal) {
        super(title);
        mainTitle = title;
        final CategoryDataset dataset = createDataset(title,firstVal,secondVal,thirdVal);
        final JFreeChart chart = createChart(dataset);
        final ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(500, 270));
        setContentPane(chartPanel);
    }    
  public Barchart(final String title  ,String message1,String message2,int posCount,int negCount) {
        super(title);
        mainTitle = title;
        final CategoryDataset dataset = createDataset(message1,message2,posCount,negCount);
        final JFreeChart chart = createChart(dataset);
        final ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(500, 270));
        setContentPane(chartPanel);
  }
  private CategoryDataset createDataset(String msg1,String msg2,int posCount1,int negCount1){
       final DefaultCategoryDataset dataset = new DefaultCategoryDataset();
       
       dataset.addValue(posCount1, msg1, msg1);
       dataset.addValue(negCount1, msg2, msg2);
       return dataset;
       
  }
  
   private CategoryDataset createDataset(int posCount1,int negCount1){
       final DefaultCategoryDataset dataset = new DefaultCategoryDataset();
       
       dataset.addValue(posCount1, "POSITIVE", "+");
       dataset.addValue(negCount1, "POSITIVE", "-");
       return dataset;
       
  }
   private CategoryDataset createDataset(int one,int two,int three,int four){
       final DefaultCategoryDataset dataset = new DefaultCategoryDataset();
       
       dataset.addValue(one, "POSITIVE NEGETIVE", "+-");
       dataset.addValue(two, "POSITIVE POSITIVE", "++");
       dataset.addValue(two, "NEGETIVE NEGETIVE", "--");
       dataset.addValue(two, "POSITIVE POSITIVE", "++");
       return dataset;
       
  }
   

  
  private CategoryDataset createDataset(String ttl,int freqency) {        
        // row keys...
        final String series1 = "SEMANTIC FREQENCY";        
        // column keys...
        final String category1 = "Key frequency";
       
        final DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(freqency, series1, category1);
        
        //dataset.addValue(7, series2, category2);        
        return dataset;        
    }  
  //
   private CategoryDataset createDataset(String title,ArrayList<String> allItems,ArrayList<Integer> allFreqs) {        
        // row keys...
      
        final DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for(int i=0;i<allItems.size();i++){
            String term = allItems.get(i);
           dataset.addValue(allFreqs.get(i), ""+i,term); 
        }
        return dataset;        
    }  
  
  //
  
  
  
 private CategoryDataset createDataset(String category,int fVal,int sVal,int tVal) {        
        // row keys...
        final String series1 = "CLOUD1";
        final String series2 = "CLOUD2"; 
        final String series3 = "CLOUD3"; 
        // column keys...
        final String category1 = "first "+category;
        final String category2 = "second "+category;    
        final String category3 = "third "+category;
        // create the dataset...
        final DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(fVal, series1, category1);
        dataset.addValue(sVal, series2, category2); 
        dataset.addValue(tVal, series3, category3);
        //dataset.addValue(7, series2, category2);        
        return dataset;        
    }  
    private JFreeChart createChart(final CategoryDataset dataset) {
        
        // create the chart...
        final JFreeChart chart = ChartFactory.createBarChart(
            mainTitle,         // chart title
            "pattern",               // domain axis label
            "frequency",                  // range axis label
            dataset,                  // data
            PlotOrientation.VERTICAL, // orientation
            true,                     // include legend
            true,                     // tooltips?
            false                     // URLs?
        );

      
        chart.setBackgroundPaint(Color.white);

        // get a reference to the plot for further customisation...
        final CategoryPlot plot = chart.getCategoryPlot();
        plot.setBackgroundPaint(Color.lightGray);
        plot.setDomainGridlinePaint(Color.white);
        plot.setRangeGridlinePaint(Color.white);

        // set the range axis to display integers only...
        final NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
        rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());

        // disable bar outlines...
        final BarRenderer renderer = (BarRenderer) plot.getRenderer();
        renderer.setDrawBarOutline(false);
        
        // set up gradient paints for series...
        final GradientPaint gp0 = new GradientPaint(
            0.0f, 0.0f, Color.blue, 
            0.0f, 0.0f, Color.lightGray
        );
        final GradientPaint gp1 = new GradientPaint(
            0.0f, 0.0f, Color.green, 
            0.0f, 0.0f, Color.lightGray
        );
        final GradientPaint gp2 = new GradientPaint(
            0.0f, 0.0f, Color.red, 
            0.0f, 0.0f, Color.lightGray
        );
        renderer.setSeriesPaint(0, gp0);
        renderer.setSeriesPaint(1, gp1);
        renderer.setSeriesPaint(2, gp2);

        final CategoryAxis domainAxis = plot.getDomainAxis();
        domainAxis.setCategoryLabelPositions(
            CategoryLabelPositions.createUpRotationLabelPositions(Math.PI / 6.0)
        );
        // OPTIONAL CUSTOMISATION COMPLETED.
        
        return chart;
        
    }
    
    
    public static void main(final String[] args) {

        //final Barchart demo = new Barchart("====Faculty FeedBack=====");
       // demo.pack();
        //RefineryUtilities.centerFrameOnScreen(demo);
        //demo.setVisible(true);

    }

}
