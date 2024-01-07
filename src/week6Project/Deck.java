package week6Project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	// List<Card> cards = new ArrayList<Card>();
	// Fields
	// 1. Cards
	List<Card> deck = new ArrayList<Card>();

	Deck() {
		String[] numbers = { "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen",
				"King", "Ace" };

		String[] suits = { "Clubs", "Diamonds", "Spades", "Hearts" };

		for (String suit : suits) {
			int count = 2;
			for (String numberName : numbers) {
				Card card = new Card(numberName, suit, count);
				deck.add(card);
				count++;
			}
		}
	}

	// Methods
	public void shuffle() {
		Collections.shuffle(this.deck);
	}

	public Card draw() {

		Card card = this.deck.remove(0);
		return card;
	}

}
