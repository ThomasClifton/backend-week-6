package war;

import java.util.ArrayList;
import java.util.List;

public class Player {
	private List<Card> hand;
	private int score;
	private String name;
	
	public Player(String s) {
		this.name = s;
		this.hand = new ArrayList<Card>();
	}
	
	public void setName(String str) {
		this.name = str;
	}
	
	public String getName() {
		return name;
	}
	
	public int getScore() {
		return score;
	}
	
	public List<Card> getHand(){
		return hand;
	}
	
	public void describe() {
		System.out.println(name + "'s hand:");
		for(Card card : hand) {
			System.out.print("   ");
			card.describe();
		}
		System.out.println();
	}
	
	public Card flip() {
		return hand.remove(0);
	}
	
	public void draw(Deck deck) {
		hand.add(deck.draw());
	}
	
	public void incrementScore() {
		this.score = score + 1;
	}
	
	public String toString() {
		return this.name;
	}
}
