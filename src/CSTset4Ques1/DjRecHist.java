package CSTset4Ques1;

public class DjRecHist 
{ 
	private String date;
	private double prices;

	public DjRecHist(String date, double prices) 
	{
		this.date = date;
		this.prices = prices;
	}

	public String getDate() 
	{
		return date;
	}

	public double getPrices() 
	{
		return prices;
	}

	public void setPrices(double prices) 
	{
		this.prices = prices;
	}

	@Override
	public String toString() 
	{
	    String str = ("date: " + date +" Prices: " + prices);
	    return str;
	}
	}