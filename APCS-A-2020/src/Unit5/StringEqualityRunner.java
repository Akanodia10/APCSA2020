package Unit5;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Arnav Kanodia 
//Date - 2/11/2020
//Class - Period 2
//Lab  - 


public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		 StringEquality test = new StringEquality("hello", "goodbye");
		  test.checkEquality();
		  System.out.println(test);
		  test.setWords("one", "two");
		  test.checkEquality();
		  System.out.println(test);
		  test.setWords("three", "four");
		  test.checkEquality();
		  System.out.println(test);
		  test.setWords("TCEA", "UIL");
		  test.checkEquality();
		  System.out.println(test);
		  test.setWords("State", "Champions");
		  test.checkEquality();
		  System.out.println(test);
		  test.setWords("ABC", "CBA");
		  test.checkEquality();
		  System.out.println(test);
		  test.setWords("ABC", "ABC");
		  test.checkEquality();
		  System.out.println(test);
		  test.setWords("Same", "Same");
		  test.checkEquality();
		  System.out.println(test);
		  
	}
}