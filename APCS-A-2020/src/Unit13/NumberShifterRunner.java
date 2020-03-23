package Unit13;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -Arnav Kanodia

import java.util.Arrays;

import java.io.IOException;


public class NumberShifterRunner
{
	public static void main( String args[] ) throws IOException
	{
		int [] test1 = NumberShifter.makeLucky7Array(10);
		System.out.println(Arrays.toString(test1));
		NumberShifter.shiftEm(test1);
		System.out.println(Arrays.toString(test1));
	}
}



