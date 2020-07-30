import java.util.Random;
public class Card {
	
	public static void main(String[] args) {
		String[] suits = {"Clubs","Diamonds","Hearts", "Spades"}; //creates a string of our cards suits

		String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
		//creates a string of our cards values
		for (int i = 1; i <= 5; i++) {
			Random rand = new Random();
            String suit = suits[rand.nextInt(suits.length)]; //picks a suit at random
            String rank = ranks[rand.nextInt(ranks.length)]; //picks a card at random
            System.out.println(rank + " of " + suit); //prints out 5 cards at random
		}
	}	
}
