package Unit6;

import java.util.Scanner;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Arnav Kanodia


public class PerfectRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		for (int x = 0; x< 10; x++) {

			{
				System.out.print("Enter a number :: "); //enter: 496, 45, 6, 14, 8128, 1245, 33, 28, 27, 33550336
				int num = keyboard.nextInt();
				Perfect s = new Perfect(num);
				s.isPerfect();
				System.out.println(s.toString() + "\n");
			}
											
	}
		keyboard.close();		
	}
}
