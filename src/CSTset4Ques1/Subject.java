package CSTset4Ques1;

import java.util.ArrayList;

public interface Subject 
{
	 	public void register(Observer o);
	    public void unregister(Observer o);
	    public void notifyObserver(ArrayList<DjRecHist> records);
}
