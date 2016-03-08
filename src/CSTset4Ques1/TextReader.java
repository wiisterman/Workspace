package CSTset4Ques1;

import java.io.BufferedReader;

import java.io.FileReader;
;

public class TextReader {
	
	Djsub records;
	   

	    public Djsub getRecords() {

	        try {
	           String l;
	           
	           double price;

	           records = new Djsub();
	           FileReader fileRead = new FileReader("DJIA.txt");
	           BufferedReader buffRead = new BufferedReader(fileRead);

	           while ((l = buffRead.readLine()) != null) {
	               String data[] = l.split(",");
	             
	               if (!data[1].contentEquals(".")) {
	            	   price = Double.parseDouble(data[1]);
	                   String date = null;
					records.addRecord(new DjRecHist(date, price));
	               }              
	           }

	      } catch (Exception e) {
	          e.printStackTrace();
	      }

	       return records;
	    }
	    
	    }