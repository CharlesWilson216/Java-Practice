import java.util.*;
public class Cards {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		playingCard(console);
	}
	public static void playingCard(Scanner console) {
		System.out.print("Enter a card: ");
		String rank = console.next();
		String suit = console.next();
		
		if (rank.equals("9")) {
				rank = "Nine";
		} else if (rank.equals("8")) {
			rank = "Eight";
		} else if (rank.equals("7")) {
			rank = "Seven";
		} else if (rank.equals("6")) {
			rank = "Six";
		} else if (rank.equals("5")) {
			rank = "Five";
		} else if (rank.equals("4")) {
			rank = "Four";
		} else if (rank.equals("3")) {
			rank = "Three";
		} else if (rank.equals("2")) {
			rank = "Two";
		} else if (rank.equals("J")) {
			rank = "Jack";
		} else if (rank.equals("Q")) {
			rank = "Queen";
		} else if (rank.equals("K")) {
			rank = "King";
		} else if (rank.equals("10")) {
			rank = "Ten";
		} else if (rank.equals("A")) {
			rank = "Ace";
		}
		if (suit.equals("C")) {
			suit = "Clubs";
		} else if (suit.equals("D")) {
			suit = "Diamonds";
		} else if (suit.equals("S")) {
			suit = "Spades";
		} else if (suit.equals("H")) {
			suit = "Hearts";
		}
		System.out.println(rank + " of " + suit);
	}
}
