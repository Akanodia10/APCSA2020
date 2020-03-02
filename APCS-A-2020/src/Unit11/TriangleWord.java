package Unit11;



public class TriangleWord
{
		
	public static void printTriangle(String word)
	{
		for (int i=0; i<word.length()+1; i++) {
			for (int j=0; j<i; j++) {
				
					System.out.print(word.substring(0,i));
			}
			System.out.println();

		}
		
	}
}