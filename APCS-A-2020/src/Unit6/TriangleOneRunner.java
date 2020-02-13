package Unit6;

import java.util.Scanner;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name- Arnav Kanodia


public class TriangleOneRunner
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		for (int x = 0; x<5; x++)
		{
			System.out.print("Enter a word :: "); //enter "hippo", "abcd", "it", "a", and "chicken"
			String str = keyboard.nextLine();
			
			TriangleOne s = new TriangleOne(str);
			
			s.print();
			System.out.println();
		}
		
		keyboard.close();
		
		
	}
}