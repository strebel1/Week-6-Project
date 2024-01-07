package week6Project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	List<Card> cards = new ArrayList<Card>();
	// Fields
	// 1. Cards
	List<Card> deck = new ArrayList<Card>();
	String[] numbers = { "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen",
			"King", "Ace" };

	String[] suits = { "Clubs", "Diamonds", "Spades", "Hearts" };

	public Deck() {
		for (String suit : suits) {
			int count = 2;
			for (String numberName : numbers) {
				cards.add(new Card(numberName, suit, count));
				count++;
			}
		}
	}

	// Methods
	public void shuffle() {
		Collections.shuffle(this.cards);
	}

	public Card draw() {

		Card card = this.cards.remove(0);
		return card;
	}

}
