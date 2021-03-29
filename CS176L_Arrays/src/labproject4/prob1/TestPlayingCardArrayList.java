package labproject4.prob1;

import java.util.ArrayList;

public class TestPlayingCardArrayList {

	public static void main(String[] args) {
        // 1 - Construct an array of 52 PlayingCard objects called deck.
    	
    	ArrayList <PlayingCard> deck = new ArrayList <PlayingCard>();

        // 2 - Construct the 52 PlayingCards in a standard deck of cards
        //     (https://en.wikipedia.org/wiki/Standard_52-card_deck)
        //     and add them to the deck. You must use a loop (or
        //     nested loops).

 
        for (int value = 1; value <= 13; value++) {
        	for (int suit = 1; suit <=4; suit++) {
        		PlayingCard card = new PlayingCard(value, suit);
        		deck.add(card);
        	}
        	
        			
        }



        // 3 - Display the value and suit of every PlayingCard in the deck.
        //     You must use a loop.
        
        for (PlayingCard card: deck) {
        	System.out.println(card.toString());
        }
        

    }
}
