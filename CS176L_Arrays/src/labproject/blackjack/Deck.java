package labproject.blackjack;

/**
 * A standard deck of 52 PlayingCards
 */

import java.util.ArrayList;
import java.util.Collections;

public class Deck {

	//Data about a deck
	private ArrayList <PlayingCard> deck;
	
	//Constructors:
	/**
	 * Constructor to create a deck of PlayingCards with optional shuffle
	 * @param shuffled
	 */
	public Deck (boolean shuffled) {
		deck = new ArrayList<PlayingCard>(); //Initialize or construct the deck in constructor
		
		for (int value = 1; value <= 13; value++) {
        	for (int suit = 1; suit <=4; suit++) {
        		PlayingCard card = new PlayingCard(value, suit);
        		deck.add(card);
        	}		
        }
		
		if (shuffled) {
			Collections.shuffle(deck);
		}
	}
	
	//Methods:
	/**
	 * Shuffle the deck
	 */
	
	public void shuffle() {
		
		Collections.shuffle(deck);
	}
	
	/**
	 * Sort the deck (values are grouped by suit)
	 */
	
	/**
	 * Get card from top of deck, where "top of deck" is first PlayingCard in deck
	 * (first in, first out = FIFO)
	 * @return PlayingCard object
	 */
	public PlayingCard getTopCard() {
		return deck.get(0);
	}
	
	/**
	 * Deal card from top of deck
	 * @return PlayingCard object
	 */
	public PlayingCard dealTopCard() {
		PlayingCard card = deck.get(0);
		deck.remove(0);
		return card;
	}
	
	/**
	 * Get card from bottom of deck, where "bottom" of deck is last PlayingCard in deck
	 * @return PlayingCard object
	 */
	//public PlayingCard getBottomCard() {
		
	//}
	
	/**
	 * Deal card from bottom of deck
	 */
	//public PlayingCard dealBottomCard() {
		
	//}
	
	/**
	 * Get card from middle of the deck (depends on how many cards are left in the deck)
	 * @return PlayingCard object
	 */
	
	/**
	 * Show the entire deck
	 */
	
	/**
	 * Get number of cards in deck
	 */
	public int getRemainingCards() {
		return deck.size();
	}
	public void showDeck () {
		for (PlayingCard card: deck) {
        	System.out.println(card.toString());
		}
	}
	public static void main (String[] args) {
		//Test the methods here:
		Deck deck = new Deck(true);
		deck.showDeck();
		System.out.println("Top card in deck: " + deck.getTopCard());
		System.out.println("Top card from: " + deck.dealTopCard());
		System.out.println("Number of remaining cards: " + deck.getRemainingCards());
	}
}
