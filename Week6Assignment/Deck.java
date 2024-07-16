package Week6Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class Deck {

 private	List<Card> cards = new ArrayList<Card>();

 Deck() {
	Integer[] values = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
	String[] suits = {"Hearts", "Diamonds", "Spades", "Clubs"};
	String[] numbers = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
	
	for(String suit: suits) {
		int count = 2;
		
		for(String number : numbers) {
			StringBuilder sb = new StringBuilder();
			sb.append(number + " of " + suit ); 
			String cardName = new String();
			cardName += sb;
			Card card = new Card(count, cardName);
			this.cards.add(card);
			count++;
		
		}		
						
	}	
	}	
public Card drawCard(int x) {
	Card drawedCard = this.cards.remove(x);
	return drawedCard;	
}
public void describeDeck() {
	for(Card card : cards) {
		card.cardDescribe();
	}
}
 public void deckShuffle() {
	 Collections.shuffle(cards);
}
public List<Card> getCards() {
	return cards;
}

public void setCards(List<Card> cards) {
	this.cards = cards;
}


 
 

 
 
 
 
 
 
	
	
	
	
	
	
	
	
	
}
