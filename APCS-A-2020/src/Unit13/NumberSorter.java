package Unit13;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Arnav Kanodia

import java.util.Arrays; 


public class NumberSorter
{
	//instance variables and other methods not shown

	private static int getNumDigits(int number)
	{
		int count = 0;
		while (number > 0) {
			number /= 10;
			count++;
		}
		return count;
	}

	public static int[] getSortedDigitArray(int number)
	{
		int[] sorted = new int[getNumDigits(number)];
		int i = 0;
		while (number > 0) {
			sorted[i] = number % 10;
			number /= 10;
			i++;
		}
		Arrays.sort(sorted);
		return sorted;
	}
	
}