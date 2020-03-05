package ElevensLab;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -Arnav Kanodia

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


public class Deck {
	public static final int NUMCARDS = 52;
	public static String[] SUITS = "CLUBS HEARTS DIAMONDS SPADES".split(" ");
	public static String[] FACE = "ACE TWO THREE FOUR FIVE SIX SEVEN EIGHT NINE TEN JACK QUEEN KING".split(" ");
	private List<Card> cards;
	private Card top;
	private int size;
	//make a Deck constructor
	public Deck () {
		//refer cards to new ArrayList
		cards = new ArrayList<Card>();
		//loop through all suits
		for (int i = 0; i <= 3; i++) {
			//loop through all faces 1 to 13
			for (int j = 0; j <= 12; j ++) {
				int point = j+1;
				if (point > 10)
					point = 10;
				cards.add(new Card (FACE[j], SUITS[i], point));
			}
		}
		//add a new TwentyOneCard to the deck
		
		//set top to the top of the deck 51
		size = cards.size();
		top = cards.get(size-1);
	}
	public Deck (String [] r, String [] s, int [] pv) {
		cards = new ArrayList<Card>();
		for (int i =0; i<= s.length -1; i++) {
			for (int j = 0; j <= r.length -1; j++) {
				cards.add(new Card (r[j], s[i], pv[j]));
			}
		}
		size = cards.size();
		top = cards.get(size-1);
	}
	public boolean isEmpty() {
		if (size == 0)
			return true;
		return false;
	}
	//make a dealCard() method that returns the top card
   //this is not used in shuffle, but kept for later use
   public void resetTop() {
	   size = cards.size();
	   top = cards.get(size -1);
   }
   
   public Card dealCard() {
		if (isEmpty()) {
			resetTop();
		}
		top = cards.get(size-1);
		size --;
		return top;
   }
   
   public int size() {
	   return size;
   }
   
   //write a shuffle() method
	public List<Card> shuffle() {
	   	//use Colletions.shuffle
		Collections.shuffle(cards);
	   	//reset the top card
		size = cards.size();
		return cards;
	}
	
	public String toString() {
		String str = "";
		str += "size = " + size;
		if (isEmpty()) {
			str+="\nDealt cards:\n";
			for (int i = 0; i <= cards.size()-1; i++) {
				str += cards.get(i) + ", ";
			}
		}else {
			str +="\nUndealt cards:\n";
			for (int i = 0; i <= size-1; i++) {
				str += cards.get(i) + ", ";
			}
		}
		return str;
	}
}
   
   
