package question5;

public class StudentDecorator {
	private DoHWComp component;

	public void setComponent(DoHWComp component) {
	this.component = component;
	}

	public void doHW() {
		if(component != null) 
		{
		component.doHw();
		}
}

}
