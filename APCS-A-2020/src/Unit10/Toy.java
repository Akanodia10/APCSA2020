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
		this.count =1;
		this.name = "";
	}
	public Toy(String name)
	{
		this.count =1;
		this.name = name;
	}

	public void setCount(int count)
	{
		this.count = count;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}
	public int getCount()
	{
		return count;
	}

	public String toString()
	{
		return name + " " + count;
	}
}