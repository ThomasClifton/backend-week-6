package war;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Deck deck = new Deck();
		deck.shuffle();
		
		// Get names of players
		System.out.print("Enter Player One Name: ");
		String name1 = sc.nextLine();
		System.out.print("Enter Player Two Name: ");
		String name2 = sc.nextLine();
		System.out.println();
		
		Player player1 = new Player(name1);
		Player player2 = new Player(name2);
		
		// Instantiates both players' hands
		for(int i = 1; i <= 52; i++) {
			if(i % 2 == 0) {
				player2.draw(deck);
			}
			else {
				player1.draw(deck);
			}
		}
		
		// Each player plays a Card and removes it from their hand
		// PLayer with higher value Card get a point
		for(int i = 1; i <= 26; i++) {
			Card card1 = player1.flip();
			Card card2 = player2.flip();
			int val1 = card1.getValue();
			int val2 = card2.getValue();
			System.out.println("Round " + i + "!");
			System.out.print(player1 + " drew: ");
			card1.describe();
			System.out.print("\n" + player2 + " drew: ");
			card2.describe();
			System.out.println();
			
			if(val1 > val2) {
				player1.incrementScore();
				System.out.println(player1 + " wins!");
			}
			else if(val1 < val2) {
				player2.incrementScore();
				System.out.println(player2 + " wins!");
			}
			else {
				System.out.println("Draw!");
			}
			System.out.println();
		}
		System.out.println();
		
		// Prints winner
		if(player1.getScore() > player2.getScore()) {
			System.out.println(player1 + " beat " + player2 + " " + player1.getScore() + " to " + player2.getScore());
		}
		else if (player1.getScore() < player2.getScore()) {
			System.out.println(player2 + " beat " + player1 + " " + player2.getScore() + " to " + player1.getScore());
		}
		else {
			System.out.println(player1 + " and " + player2 + " are tied with " + player1.getScore() + " points!");
		}
		
		sc.close();
	}

}
