package CSTset4Ques1;

import java.util.ArrayList;

import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

public class DjlineChart implements Observer {
    
    private CategoryAxis xAxis;
    private NumberAxis yAxis;
    private LineChart<String,Number> lineChart;
    private XYChart.Series series;
    
    public DjlineChart() {
        
        xAxis = new CategoryAxis();
        yAxis = new NumberAxis();
        xAxis.setLabel("Date");
        yAxis.setLabel("Price$");
        lineChart = new LineChart(xAxis,yAxis);    
        lineChart.setTitle("Dow Jones Industrial Average");
        series = new XYChart.Series();
        series.setName("DJIA");
        lineChart.getData().add(series); 
    }
    
    public LineChart<String,Number> getLineChart() {
        return lineChart;
    }
    
    public void setChartValues(ArrayList<DjRecHist> list) {
        lineChart.getData().removeAll();
        for (int i = 0; i < list.size(); i++) {
            series.getData().add(new XYChart.Data(list.get(i).getDate().toString(),
                    list.get(i).getPrices()));
        }
    }

    @Override
    public void update(ArrayList<DjRecHist> records) {
       setChartValues(records);
    }
    
}
