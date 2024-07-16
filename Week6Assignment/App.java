package Week6Assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {

	public static void main(String[] args) {
		

	Deck deckOne = new Deck();
	deckOne.deckShuffle();
	Player player1 = new Player("Player 1", 0);
	Player player2 = new Player("Player 2", 0);
	
	
	for(int i  = 0; i < 52; i++) {
		if(i % 2 == 0) {
			player1.addCardToHand(deckOne.drawCard(0));
		} else {
			player2.addCardToHand(deckOne.drawCard(0));
		}
		
	}
	
	for(int i = 0; i < 26; i++) {
		System.out.println("---------------Flip " + i + " ------------------");
		Card playerOne = player1.flip();
		System.out.println("             Player 1 Card:");
		playerOne.cardDescribe();
		Card playerTwo = player2.flip();
		System.out.println("             Player 2 Card:");
				playerTwo.cardDescribe();
		if(playerOne.getValue()> playerTwo.getValue()) {
			player1.incrementScore();
			System.out.println("    Player 1 has a higher card plus 1");
			System.out.println("         Player One score is now " + player1.getScore() );
		}else if (playerOne.getValue()< playerTwo.getValue()) {
			player2.incrementScore();
			System.out.println("    Player 2 has a higher card plus 1");
			System.out.println("       Player Two score is now " + player2.getScore());
		}else if(playerOne.getValue()== playerTwo.getValue()) {
			System.out.println("             it is a tie");		
		
	}
		
		
		
	}
	
	System.out.println("-------------End Of Game-----------------");
	System.out.println("         Player 1 score is " + player1.getScore());
	System.out.println("         Player 2 score is " + player2.getScore());
		if(player1.getScore() > player2.getScore()) {
	System.out.println("        Player 1 is the Winner!");
	System.out.println("         With the score of " + player1.getScore());
		}else if (player1.getScore() < player2.getScore()) {
	System.out.println("        Player 2 is the Winner!");
	System.out.println("         With the score of " + player2.getScore());
		}else if 	(player1.getScore() == player2.getScore()) {
	System.out.println("        With the score " + player1.getScore() + " & " + player2.getScore());
	System.out.println("          The game is a tie!");
	
	}

		
		
		
	}	
	}
	

	
	
	
		
	


