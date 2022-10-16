package war;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

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
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
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
