package question4;

import javafx.stage.Stage;

public class Constructors implements Interface
{

	private Interface ability;
	
	
	
	public void setInterface(Interface ability) {
		this.ability = ability;
	}
	
	@Override
	public void start(Stage stage) {
		this.ability.start(stage);
		
	}

	
}
