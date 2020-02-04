package Unit0;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class Input
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		int intOne, intTwo;
		double doubleOne, doubleTwo;
		float floatOne, floatTwo;
		short shortOne, shortTwo;


		out.print("Enter an integer :: ");
		intOne = keyboard.nextInt();

		out.print("Enter an integer :: ");
		intTwo = keyboard.nextInt();
		
		out.print("Emter a double:: ");
		doubleOne = keyboard.nextDouble();

		out.print("Emter a double:: ");
		doubleTwo = keyboard.nextDouble();

		out.print("Emter a float:: ");
		floatOne = keyboard.nextFloat();
		
		out.print("Emter a float:: ");
		floatTwo = keyboard.nextFloat();
		
		out.print("Emter a short:: ");
		shortOne = keyboard.nextShort();
		
		out.print("Emter a short:: ");
		shortTwo = keyboard.nextShort();


		//add in input for all variables


		System.out.println();
		System.out.println("integer one = " + intOne );
		System.out.println("integer two = " + intTwo );
		System.out.println("double  one = " + doubleOne );
		System.out.println("double  two = " + doubleTwo );
		System.out.println("float one = " + floatOne );
		System.out.println("float two = " + floatTwo );
		System.out.println("short one = " + shortOne );
		System.out.println("short two = " + shortTwo );
		

		//add in output for all variables
		
		keyboard.close();


	}
}