package Unit5;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Arnav Kanodia
//Date - 2/11/2020
//Class - Period 2
//Lab  -


public class StringEquality
{
	private String wordOne, wordTwo;

	public StringEquality()
	{
	}

	public StringEquality(String one, String two)
	{
		setWords(one, two);
	}

	public void setWords(String one, String two)
	{
		wordOne= one;
		wordTwo= two;
		
	}

	public boolean checkEquality( )
	{
		return wordOne.equals(wordTwo);	}

	public String toString()
	{
		if (checkEquality()) {
			return wordOne + " has the same letters as " + wordTwo + "\n";
		}
			return wordOne + " does not have the same letters as " + wordTwo + "\n";	}
}