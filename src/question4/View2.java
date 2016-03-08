package question4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.Chart;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class View2  extends Application implements Interface 
{

	
	@Override
	public void start(Stage primaryStage) 
	{
		double[] data = null;
		TextReader x = new TextReader();
		
		try {
			TextReader.getPrices(data);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			 
		  
		primaryStage.setTitle("Line Chart Sample");
		        //defining the axes
		        final NumberAxis xAxis = new NumberAxis();
		        final NumberAxis yAxis = new NumberAxis();
		        xAxis.setLabel("Number of Month");
		        //creating the chart
		        final LineChart<Number,Number> lineChart = 
		                new LineChart<Number,Number>(xAxis,yAxis);
		                
		        lineChart.setTitle("Stock Monitoring, 2010");
		        //defining a series
		        XYChart.Series series = new XYChart.Series();
		        series.setName("My portfolio");
		        //populating the series with data
		      //  series.getData().add(new XYChart.Data(1, data[1]));
		        for(int i = 0; i < data.length; i++)
				{
		        	series.getData().add(new XYChart.Data(i, data[i]));
				}
		        
		
		        
		        Scene scene  = new Scene(lineChart,800,600);
		        lineChart.getData().add(series);
		       
		        primaryStage.setScene(scene);
		        primaryStage.show();
		    }
	}
	

	

