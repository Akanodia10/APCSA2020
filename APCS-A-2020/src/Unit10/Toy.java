package Unit10;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Arnav Kanodia


public class Toy
{
	private String name;
	private int count;

	public Toy()
	{
	}

	public Toy( String nm )
	{
		name=nm;
	}
	
	public int getCount()
	{
		return count;
	}
	
	public void setCount( int cnt )
	{
		count=cnt;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName( String nm )
	{
		name=nm;
	}

	public String toString()
	{
	   return name + " " + count;
	}
}