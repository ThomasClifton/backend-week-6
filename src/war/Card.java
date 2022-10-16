package war;

public class Card {
	private int value;
	private String name;
	
	//Initialize instance variables
	//num 2-14 -> 2-Ace
	//suit 1-4 -> Spade,Club,Heart,Diamond
	public Card(int num, int suit) {
		this.value = num;
		switch(suit) {
			case 1:
				this.name = getCardName(num) + " of Spades";
				break;
			case 2:
				this.name = getCardName(num) + " of Clubs";
				break;
			case 3:
				this.name = getCardName(num) + " of Hearts";
				break;
			case 4:
				this.name = getCardName(num) + " of Diamonds";
				break;
		}
	}
	
	private String getCardName(int num) {
		switch(num) {
			case 2:
				return "Two";
			case 3:
				return "Three";
			case 4:
				return "Four";
			case 5:
				return "Five";
			case 6:
				return "Six";
			case 7:
				return "Seven";
			case 8:
				return "Eight";
			case 9:
				return "Nine";
			case 10:
				return "Ten";
			case 11:
				return "Jack";
			case 12:
				return "Queen";
			case 13:
				return "King";
			case 14:
				return "Ace";
			default:
				return "";
		}
	}
	
	public void setValue(int num) {
		this.value = num;
	}
	
	public int getValue() {
		return value;
	}
	
	public void setName(String str) {
		this.name = str;
	}
	
	public String getName() {
		return name;
	}
	
	public void describe() {
		System.out.print(this.name);
	}
}
