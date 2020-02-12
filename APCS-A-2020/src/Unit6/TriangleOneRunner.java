package Unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name- Arnav Kanodia


public class TriangleOneRunner
{
	public static void main ( String[] args )
	{
		String[] testCases = new String[] {
				"hippo",
				"abcd",
				"it",
				"a",
				"chicken"
		};
		for (String CASE : testCases) {
			TriangleOne t = new TriangleOne(CASE);
			t.print();
		}
		
	}
}