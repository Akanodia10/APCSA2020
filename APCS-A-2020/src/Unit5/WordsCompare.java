package Unit5;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Arnav Kanodia
//Date - 2/11/2020
//Class - Period 2
//Lab  -


public class WordsCompare
{
	private String wordOne, wordTwo;
   private int compare;

	public WordsCompare()
	{
	}

	public WordsCompare(String one, String two)
	{
		 setWords (one, two);
	}

	public void setWords(String one, String two)
	{
         wordOne = one;
         wordTwo = two;
	}

	public void compare()
	{
		compare = wordOne.compareTo(wordTwo);
		
	}

	public String toString()
	{
		if(compare<0)
		{
			return wordOne + " should be placed before " + wordTwo + "\n";
		}
		else
		{
			return wordOne + " should be placed after " + wordTwo + "\n";
		}
	}
}