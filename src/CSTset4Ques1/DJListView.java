package CSTset4Ques1;

import java.util.ArrayList;

import javafx.scene.control.ListView;
import javafx.stage.Stage;

public class DJListView implements Observer {
    
    private ListView<String> list;
    
    public DJListView(Stage stage) {
        list = new ListView<>();
    }
    
    public void setListView(ArrayList<DjRecHist> records) {
        list.getItems().clear();
        for (int i = 0; i < records.size(); i++) {
            String date = records.get(i).getDate().toString();
            double value = (records.get(i).getPrices());
            list.getItems().add(date + " " + value);
        }
        
    }
    
    public ListView<String> getListView() {
        return list;
    }

    @Override
    public void update(ArrayList<DjRecHist> records) {
       setListView(records);
    }
}