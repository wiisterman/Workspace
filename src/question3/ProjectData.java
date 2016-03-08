package question3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;




@SuppressWarnings("serial")
public class ProjectData implements Serializable 
{
	
	
	ArrayList<SaveButtonEventObject> saver = new ArrayList<SaveButtonEventObject>();
	
	
	public ProjectData()
	{
		this.saver = saver;
	}
	
	public ArrayList<SaveButtonEventObject> getSaver(){
		return saver;
	}

	public void setSaver(ArrayList<SaveButtonEventObject> saver) {
		this.saver = new ArrayList<SaveButtonEventObject>();
	}
	
	
	public void saveArrayDataToBinaryFile(ProjectData data)
	{
		
		FileOutputStream fileOut = null;
		ObjectOutputStream output = null;
		
		try
		{
			fileOut = new FileOutputStream("HR.dat");
			output = new ObjectOutputStream(fileOut);
		}
		catch(IOException e)
		{
			e.printStackTrace();
			return;
		}
		try
		{
			output.writeObject(data.getSaver());
			output.close();
		}
		catch(IOException j)
		{
			j.printStackTrace();
			return;
		}
		
	}
	
	public void loadBinaryDataToArrays(ProjectData data)
	{
		FileInputStream fileIn = null;
		ObjectInputStream input = null;
		
		try
		{
			fileIn = new FileInputStream("HR.dat");
			input = new ObjectInputStream(fileIn);
		}
		catch(IOException e)
		{
			e.printStackTrace();
			return;
		}
		try
		{
			data.setSaver((ArrayList<SaveButtonEventObject>) input.readObject());
		
			input.close();
		}
		catch(IOException | ClassNotFoundException j)
		{
			
			/*Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("");
			alert.setContent();
			*/
			j.printStackTrace();
			return;
		}
	}
	
	public SaveButtonEventObject searchArray(String id, ProjectData data)
	{
		for(SaveButtonEventObject emp: data.getSaver())
		{
			if(emp.getId() == id)
				{
					return emp;
				}
			
		}
		return null;
	}
	
}