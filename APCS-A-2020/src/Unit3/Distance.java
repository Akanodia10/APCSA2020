package Unit3;
//(c) A+ Computer Science 
//www.apluscompsci.com

//Name - Arnav Kanodia
//Date - 2/5/20
//Class - Period 2
//Lab  -


public class Distance
{
	private double xOne,yOne,xTwo,yTwo;
	private double distance;

	public Distance()
	{
	}

	public Distance(int x1, int y1, int x2, int y2)
	{
		setCoordinates(x1,y1,x2,y2);
		calcDistance();
	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;
	}

	public void calcDistance()
	{
		distance = Math.sqrt(Math.pow(xOne-xTwo, 2.0) + Math.pow(yOne-yTwo, 2));

	}
	
	public double getDistance()
	{
		return distance;
	}
	
	public void print()
	{
		System.out.println(distance);
	}
	
	//complete print or the toString

	public String toString()
	{
		return "The distance =" + distance;
	}
}