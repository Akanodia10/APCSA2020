package Unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name- Arnaav Kanodia


public class TriangleOne
{
	private String word;

	public TriangleOne()
	{
		word="";
	}

	public TriangleOne(String s)
	{
		setWord(s);
	}

	public void setWord(String s)
	{
		word=s;
	}

	public void print( )
	{
		for (int i = 0; i<word.length(); i++)
			System.out.println(word.substring(0, word.length() -1 -i)); 
	}
}