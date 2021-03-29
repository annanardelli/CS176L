/**
 * Play Blackjack
 * Dealer vs. 1 player
 */

package labproject.blackjack;

import java.util.ArrayList;

public class Blackjack {
	public static void main (String[] args) {
	
		Deck deck = new Deck(true);
		
		ArrayList<PlayingCard> dealerHand = new ArrayList<PlayingCard>();
		ArrayList<PlayingCard> playerHand = new ArrayList<PlayingCard>();
		
		dealerHand.add(deck.dealTopCard());
		dealerHand.add(deck.dealTopCard());
		
		playerHand.add(deck.dealTopCard());
		playerHand.add(deck.dealTopCard());
		
		System.out.println("Dealer has:");
		for (PlayingCard card : dealerHand) {
			System.out.println(card);
		}
		
		System.out.println("Player has:");
		for (PlayingCard card : playerHand) {
			System.out.println(card);
		}
	}
}
