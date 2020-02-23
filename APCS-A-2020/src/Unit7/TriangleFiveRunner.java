package Unit7;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Arnav Kanodia


import java.util.Scanner;

public class TriangleFiveRunner
{
   public static void main(String args[]) {
   Scanner keyboard = new Scanner(System.in);
	
	int x = 0;
	
	while (x < 5)
	{
		System.out.print("Enter a letter :: ");
		String letter = keyboard.next();
		char c = letter.charAt(0);
		
		System.out.print("Enter an amount :: ");
		int amt = keyboard.nextInt();
		
		TriangleFive s = new TriangleFive(c, amt);
		System.out.print(s.toString());
		System.out.print("\n");
		x++;
		
		keyboard.close();
	}

}

}