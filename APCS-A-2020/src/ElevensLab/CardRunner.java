package ElevensLab;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -Arnav Kanodia

import static java.lang.System.*;

public class CardRunner
{
	public static void main( String args[] )
	{
		Card one = new Card("NINE","SPADES", 9);
		out.println(one.suit());
		out.println(one.rank());

		Card two = new Card("ACE","DIAMONDS", 1);
		out.println(two);
		two.setFace(3);
		two.setPoints(3);
		out.println(two);

		Card three = new Card("FOUR","CLUBS", 4);
		out.println(three);

		Card four = new Card("QUEEN","SPADES", 12);
		out.println(four);

		Card five = new Card("QUEEN","HEARTS", 12);
		out.println(five);
	}
}