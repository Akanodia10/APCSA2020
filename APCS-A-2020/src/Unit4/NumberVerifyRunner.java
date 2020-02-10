package Unit4;

import java.util.Scanner;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Arnav Kanodia
//Date - 2/10/202
//Class - Period 2
//Lab  -



public class NumberVerifyRunner
{
	public static void main ( String[] args )
	{
	    Scanner keyboard = new Scanner( System.in );
        
	    System.out.println("Enter a whole number :: ");
	    int num = keyboard.nextInt();
	    
		System.out.println(num + " is odd :: " + NumberVerify.isOdd(num));
		System.out.println(num + " is even :: " + NumberVerify.isEven(num));
		
		keyboard.close();
		
	}
}