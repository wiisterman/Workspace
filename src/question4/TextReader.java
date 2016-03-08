package question4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TextReader 
{
	public static void main(String[] args) throws FileNotFoundException
	{
		List<String> dates = new ArrayList<String>();
		getDate(dates);
		
		System.out.println(dates);
		double[] prices = null;
		getPrices(prices);
		//System.out.println(prices);
	}
	
	
	
	
	List<String> dates = new ArrayList<String>();
	public static List<String> getDate(List<String> dates) throws FileNotFoundException
	{
		Scanner s = new Scanner(new File("DJIA.txt"));
		
		List<String> value = new ArrayList<String>();
		while (s.hasNext())
		{
			dates.add((String) s.next());      
			s.next();  
		}
		
		return dates;

	}
	
	
	public static double[] getPrices(double[] doublePrices) throws FileNotFoundException
	{	List<String> Oldprices = new ArrayList<String>();
		Scanner s = new Scanner(new File("DJIA.txt"));
		String someString = ".";
		String otherString = "";
		String contentsTBD = "";
		List<String> value = new ArrayList<String>();
		while (s.hasNext())
		{
			s.next();      
			Oldprices.add((String) s.next()); 
		}
		while(Oldprices.contains(".")) {
			Oldprices.remove(".");
		}
		  
		ArrayList<String> pricelist = new ArrayList<String>();
		for(int i = 0; i < Oldprices .size(); i++)
	      {
	          if(Oldprices.get(i).contains(someString))
	          {
	        	  pricelist.add(Oldprices.get(i).replace(someString, otherString));
	             //someList.set(i, someList.get(i).replace(someString, otherString));
	          } else {

	              // If it not contains `someString`, add it as it is to newList
	        	  pricelist.add(Oldprices.get(i));
	          }

	       }
	       //System.out.println(prices);  // Original
	       System.out.println(pricelist);   // New List
	   	while(pricelist.contains(" ")) {
	   		pricelist.remove(" ");
		}
	    
	

	   	doublePrices = new double[pricelist.size()]; //create an array with the size of the failList

	   	for (int i = 0; i < pricelist.size(); ++i) { //iterate over the elements of the list
	   	    doublePrices[i] = Double.parseDouble(pricelist.get(i)); //store each element as a double in the array
	   	}

		
		
		
		
		
		return doublePrices;

	}
	
}
	
