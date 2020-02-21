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
		String response;
		
		do {
		
			out.print("Rock-Paper-Scissors - pick your weapon[R,P,S]:: ");
			
			response = keyboard.nextLine();
			RockPaperScissors game = new RockPaperScissors();
			game.setPlayers(response);
			System.out.println(game);
			
			System.out.println("Do you want to play again? [y/n]");
		} 
		while (keyboard.nextLine().equals("y"));
		keyboard.close();

	}
}

