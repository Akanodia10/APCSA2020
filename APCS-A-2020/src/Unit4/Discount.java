package Unit4;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Arnav Kanodia 
//Date - 2/10/20
//Class - Period 2
//Lab  -


public class Discount
{
	
	public static double getDiscountedBill(double bill)
	{
		if (bill > 2000) {
			return (bill = (0.85 * bill));
		}
		else 
			return (bill);
	}
}