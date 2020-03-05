package ElevensLab;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Arnav Kanodia

public class Card
{
	public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR",
			"FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};

	//instance variables
		//String suit
		//int face
	private String cardSuit;
	private String value;
	private int intValue;
	private int point;
	
  	//constructors
	public Card(String faceValue, String suit, int points) {
		cardSuit = suit;
		value = faceValue;
		point = points;
	}
	public Card(String suit, int faceValue) {
		cardSuit = suit;
		intValue = faceValue;
	}

	// modifiers
		//set methods
	public void setFace(int faceValue) {
		intValue = faceValue;
		value = FACES[faceValue];
	}
	public void setSuit(String suit) {
		cardSuit = suit;
	}
	public void setPoints(int points) {
		point = points;
	}


  	//accessors
		//get methods
	public String rank() {
		return value;
	}
	public int rankInt() {
		return intValue;
	}
	public String suit() {
		return cardSuit;
	}
	public int pointValue() {
		return point;
	}
	
	public boolean matches(Card other) {
		if ((this.cardSuit == other.cardSuit) && (this.value == other.value) && (this.point == other.point)) {
			return true;
		}
		return false;
	}


  	//toString
	public String toString() {
		return value + " of " + cardSuit + " Point value: " + point;
	}

 }