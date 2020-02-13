package Unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name- Arnav Kanodia

import java.util.Scanner;

public class WordRunner
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		for (int x = 0; x<5; x++)
		{
			System.out.print("Enter a word :: "); //enter "Hello", "World", "JukeBox", "TCEA", and "UIL"
			String str = keyboard.nextLine();
			
			Word s = new Word(str);
			
			System.out.println(s.toString() + "\n");
		}
		
		keyboard.close();
		
	}
}