package Unit7;
//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  Arnav Kanodia

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		boolean userChoice;
		do 
		{
			out.print("Rock-Paper-Scissors - pick your weapon[R,P,S] :: ");
			String player = keyboard.next().toUpperCase();
			
			RockPaperScissors game = new RockPaperScissors(player);
			System.out.print(game.toString() + "\n\n");
			
			out.print("Do you want to play again? [y/n]");
			String condition = keyboard.next().toUpperCase();
			out.print("\n");
			
			if (condition.equals("N")) 
			{
				userChoice = false;
			}
			else if (condition.equals("Y"))
			{
				userChoice = true;
			}
			else
			{
				System.out.println("Invalid Choice");
				userChoice = false;
			}
		}while (userChoice == true);
		keyboard.close();

	}
}