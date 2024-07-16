package Week6Assignment;

import java.util.ArrayList;
import java.util.List;

public class Player {

	
	private List<Card> hand = new ArrayList<Card>(); 
	private int score;
	private String name;
	
		
	Player(String name, int score) {
	
	this.score = score - score;	
	this.name = name;
	
	
	
}
	public void describe() {
		System.out.println(name + " " + score + " Hand :");
		for(Card card : hand) {
			card.cardDescribe();
			}
	}
	public void incrementScore() {
		this.score++;
	}	
	public Card flip() {
	Card flip = hand.remove(0);	
	return flip;
	
	}
	public int getScore() {
	return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getName() {
		return name;
	}	
	public void setScore(String name) {
		this.name = name;
		
	}
	public void addCardToHand(Card card) {
		this.hand.add(card);
		
		
		
		
	}	
	public List<Card> getHand() {
		return hand;
	}
	public void setHand(List<Card> hand) {
		this.hand = hand;
		
	}
}
