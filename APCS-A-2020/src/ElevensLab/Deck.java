package ElevensLab;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -Arnav Kanodia

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


 class Deck {	
    public static final int NUMCARDS = 52;
	public static String[] SUITS = "CLUBS HEARTS DIAMONDS SPADES".split(" ");
	
	private List<Card> cards;
	private int top;
	private int size;
	
	public Deck() { 
		
		cards = new ArrayList<Card>();
		top = 51;
		
		for (int s = 0; s<SUITS.length; s++) {
			for (int f = 1; f<=13; f++) {
				cards.add(new Card(SUITS[s], f));
			}
		}
	}
	
	public Deck(String[]ranks, String[]suits, int[] pointValues) {
		cards = new ArrayList<Card>();
		for(int s = 0; s<suits.length; s++) {
			for ( int r = 0; r<ranks.length;r++) {
				cards.add(new Card(ranks[r],suits[s], pointValues[r]));
			}
		}
		size = cards.size();
		top = size-1;
		shuffle();
	}
	
	public Card dealCard() {
		Card output = null;
		if (size==0) {
			return output;
		}
		if (top<0) {
			resetTop();
			top = size -1;
		}
		if(top>=0) {
		output = cards.get(top);
		top--;
		size--;
		}
		return output;
	}
	
	public boolean isEmpty() {
		return size()==0;
	}

	public int size() {
		return size;
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	public void resetTop() {
		size = cards.size();
		top = size-1;
	}
	
	public String toString() {
		String output = "size = " + size + "\nUndealt cards: \n";
		for (int i = size-1; i>=0;i--) {
			if (i>0) {
				output += cards.get(i) + ", ";
			}
			else 
				output += cards.get(i) + "\n";
		}
		output += "\nDealt cards: \n";
		for (int k = cards.size()-1;k>=size;k--) {
			if (k>size) {
				output += cards.get(k) + ", ";
			}
			else 
				output += cards.get(k) + "\n";

		}
		return output;
	}
	
	
 }

   
   
