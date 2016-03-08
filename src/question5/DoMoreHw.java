package question5;

public class DoMoreHw extends StudentDecorator
{
	public void doMoreHw() {
		super.doHW();
		System.out.println("And I Work At Mc'Donalds!");
	}
}
