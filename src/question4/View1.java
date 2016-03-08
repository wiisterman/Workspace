package question4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class View1 implements Interface
{
			final static String y1 = "y1";
		   
		    
	@Override
	public void start(Stage primaryStage) {
		{
			double[] data = null;
			TextReader x = new TextReader();
			
			try {
				TextReader.getPrices(data);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		        stage.setTitle("Bar Chart Sample");
		        final CategoryAxis xAxis = new CategoryAxis();
		        final NumberAxis yAxis = new NumberAxis();
		        final BarChart<String,Number> bc = 
		            new BarChart<String,Number>(xAxis,yAxis);
		        bc.setTitle("Stocks");
		        xAxis.setLabel("");       
		        yAxis.setLabel("Value");
		 
		        XYChart.Series series1 = new XYChart.Series();
		        series1.setName("2003");       
		        
		        for(int i = 0; i < data.length; i++)
				{
		        	series1.getData().add(new XYChart.Data(y1, data[i]));
				}
		        
		        Scene scene  = new Scene(bc,800,600);
		        bc.getData().addAll(series1);
		        primaryStage.setScene(scene);
		        primaryStage.show();
		    }
		
	}

	

}
