package Unit10;

import java.util.Scanner;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -Arnav Kanodia


public class ToyRunner
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		String choice = "";
		
		System.out.print("\nDo you want to enter another toy? ");
		choice=keyboard.next();	
		
		while (choice.equals("Y") || choice.contentEquals("y")) {
			System.out.print("\nEnter the toy:: ");
			String toy = keyboard.next();
	
			System.out.print("Enter the count:: ");
 			int count = keyboard.nextInt();			
			
 			System.out.println();
 			
			System.out.println(toy+" " + count);
			System.out.print("\nDo you want to enter a toy? ");
			choice=keyboard.next();		
			
			keyboard.close();
		}
		
	}
}