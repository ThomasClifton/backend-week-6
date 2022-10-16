package war;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

// has-a List of Cards
// default constructor instantiates a deck of cards with all 52 basic playing cards
public class Deck {
	private List<Card> cards;
	
	public Deck() {
		this.cards = new ArrayList<Card>();
		for(int num = 2; num <= 14; num++) {
			for(int suit = 1; suit <= 4; suit++) {
				cards.add(new Card(num, suit));
			}
		}
	}
	
	// Shuffles deck
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	// Removes and returns a Card in the Deck so the same cad is not drawn twice
	public Card draw() {
		return cards.remove(0);
	}
	
	public void describe() {
		System.out.println("Deck:");
		for(Card card : cards) {
			System.out.print("   ");
			card.describe();
		}
	}
}
