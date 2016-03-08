package question4;

import javafx.application.Application;
import javafx.stage.Stage;

public class Demo extends Application
{
	@Override
	public void start(Stage primaryStage) throws Exception 
	{
		Constructors con = new Constructors();
		
		con.setInterface(new View2());
		con.start(primaryStage);

		con.setInterface(new View1());
		con.start(primaryStage);
		
	}
	

}
