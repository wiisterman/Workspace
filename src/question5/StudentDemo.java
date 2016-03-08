package question5;

public class StudentDemo 
{
	public static void main(String[] args) {
		ConcreteHW hw = new ConcreteHW();
	
		System.out.println("-------------");
		DoMoreHw ex1 = new DoMoreHw();
		ex1.setComponent(hw);
		ex1.doMoreHw();
	
	}
}
