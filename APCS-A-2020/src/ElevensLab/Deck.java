package ElevensLab;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -Arnav Kanodia

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


 class Deck {	
    public static final int NUMCARDS = 52;
	public static String[] SUITS = "CLUBS HEARTS DIAMONDS SPADES".split(" ");
	
	private List<Card> cards;
	private int top;
	
	public Deck() { 
		
		cards = new ArrayList<Card>();
		top = 51;
		
		for (int s = 0; s<SUITS.length; s++) {
			for (int f = 1; f<=13; f++) {
				cards.add(new Card(SUITS[s], f));
			}
		}
	}
 }


   
   //make a dealCard() method that returns the top card
   
   //write a shuffle() method
   	//use Colletions.shuffle
   	//reset the top card 
