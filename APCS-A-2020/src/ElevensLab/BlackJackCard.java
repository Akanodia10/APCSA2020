package ElevensLab;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class BlackJackCard extends Card
{
  	//constructors
	public BlackJackCard( String s, int f)
  	{
  		super( s, f );
  	}

  	//accessors
	public int getValue()
	{
		if( rankInt() == 1 )
			return 11;
		if( rankInt() >= 10 )
			return 10;
		return rankInt();
	}

  	//toString
  	public String toString()
  	{
  		return super.toString() + " " + getValue();
  	}
 }