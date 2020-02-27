package ElevensLab;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -Arnav Kanodia

import static java.lang.System.*;

public class CardRunner
{
	public static void main( String args[] )
	{
		
		Card one = new Card("Nine", "SPADES", 9);
		out.println(one.getSuit());
		out.println(one.getFace());

		

		Card two = new Card("ACE", "DIAMONDS", 1);
		out.println(two);
		two.setFace(3);
		out.println(two);

		Card three = new Card("Four", "CLUBS", 4);
		out.println(three);

		Card four = new Card("Queen", "SPADES", 12);
		out.println(four);

		Card five = new Card("Queen", "HEARTS", 12);
		out.println(five);
		
	}
}