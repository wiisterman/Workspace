package question3;

import javafx.application.Application;
import javafx.stage.Stage;

public class Demo extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		WindowView window = new WindowView(stage);
		Employee model = new Employee();
		
		EmployeeController controller = 
				new EmployeeController(model, window);
	}

}

