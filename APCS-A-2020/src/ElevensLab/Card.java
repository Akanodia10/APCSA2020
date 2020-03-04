package ElevensLab;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Arnav Kanodia

public class Card
{
	public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR",
			"FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};

	
	private String cardSuit;
	private String value;
	private int point;
	
  	public Card(String faceValue, String suit, int points) {
		cardSuit = suit;
		value = faceValue;
		point = points;
	}
  	
  	public Card(String suit, int faceValue) {
		setSuit(suit);
		setFace(faceValue);
	}

	
	public void setFace(int faceValue) {
		value = FACES[faceValue];
	}
	public void setSuit(String suit) {
		cardSuit = suit;
	}
	public void setPoints(int points) {
		point = points;
	}


	public String getFace() {
		return value;
	}
	public String getSuit() {
		return cardSuit;
	}
	public int getPoints() {
		return point;
	}
	public boolean equal(Card other) {
		if ((this.cardSuit == other.cardSuit) && (this.value == other.value) && (this.point == other.point)) {
			return true;
		}
		return false;
	}


	public String toString() {
		if (point==0) {
			return value + "of" + cardSuit;
		}
		else {
		return value + " of " + cardSuit + " Point value: " + point;
	}
	}
 }