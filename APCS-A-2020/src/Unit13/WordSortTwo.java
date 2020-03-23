package Unit13;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Arnav Kanodia

import java.util.Arrays;


public class WordSortTwo
{
	private String[] wordRay;



	public WordSortTwo(String sentence)
	{
		wordRay = sentence.split(" ");
	}

	public void sort()
	{
		Arrays.sort(wordRay);
	}

	public String toString()
	{
		String output="";
		for (String s: wordRay) {
			output += s +"\n";
		}
		return output+"\n\n";
	}
}