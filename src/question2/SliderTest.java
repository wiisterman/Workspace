package question2;
import javafx.application.Application;
import javafx.beans.property.*;
import javafx.beans.value.*;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SliderTest extends Application	
{

	    @Override
	    public void start(Stage primaryStage) {
	        // Add a scene
	        VBox root = new VBox();
	        Scene scene = new Scene(root, 500, 200);

	        final Label betLabel = new Label("sdsd");

	        final Slider betSlider = new Slider();
	        betSlider.valueProperty().addListener(new ChangeListener() {

	            @Override
	            public void changed(ObservableValue arg0, Object arg1, Object arg2) {
	                betLabel.textProperty().setValue(
	                        String.valueOf((int) betSlider.getValue()));

	            }
	        });

	        root.getChildren().addAll(betSlider, betLabel);
	        betLabel.textProperty().setValue("abc");

	        // show the stage
	        primaryStage.setTitle("Demo");
	        primaryStage.setScene(scene);
	        primaryStage.show();
	    }

	    public static void main(String[] args) {
	        launch(args);
	    }
	}