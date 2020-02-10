package Unit4;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Arnav Kanodia 
//Date - 2/10/2020
//Class - Period 2
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class DiscountRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Enter the original bill amount :: ");
		double bill = keyboard.nextDouble();
		out.print("New Bill Amount ::" + Discount.getDiscountedBill(bill));
        
		keyboard.close();

	}
}