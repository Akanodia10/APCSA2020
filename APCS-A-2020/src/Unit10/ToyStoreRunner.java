package Unit10;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -Arnav Kanodia



public class ToyStoreRunner
{
	public static void main( String args[] )
	{
		ToyStore2 sto = new ToyStore2();
		System.out.println( sto );
		sto.loadToys("sorry bat sorry sorry sorry train train teddy teddy ball ball" );
		System.out.println( sto );	
		System.out.println( "max == " + sto.getMostFrequentToy() );	
	}
}