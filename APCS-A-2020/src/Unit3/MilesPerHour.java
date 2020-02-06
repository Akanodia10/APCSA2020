package Unit3;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Arnav Kanodia
//Date - 2/6/20
//Class - Period 2
//Lab  -



public class MilesPerHour
{
	private int distance, hours, minutes;
	private double mph;

	public MilesPerHour()
	{
		setNums(0,0,0);
		mph=0.0;
	}

	public MilesPerHour(int dist, int hrs, int mins)
	{
		setNums (dist, hrs, mins);
	}

	public void setNums(int dist, int hrs, int mins)
	{
		distance=dist;
		hours=hrs;
		minutes=mins;
	}

	public void calcMPH()
	{
		mph= distance/(hours + minutes/60.0);
	}

	public void print()
	{
		System.out.println(mph);
	}
	
	//create a print or toString or both
	
	public String toString()
	{
		return ""+(int)distance +" miles in "+(int)hours+" hours and "+(int)minutes+" minutes = "+Math.round(mph)+" MPH.";
		
	}
}