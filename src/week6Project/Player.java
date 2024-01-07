package week6Project;

import java.util.ArrayList;
import java.util.List;

public class Player {
//Fields
	private List<Card> hand = new ArrayList <Card>();
	private int score;
	private String name; 
	
 public	Player () {
		this.setScore(0);
		this.setName(name);
	}
//Methods
		public void describe () {
			System.out.println("Player has these cards ");
			for (Card card: hand ) {
				card.describe();
			}
		
	}
 public Card flip() {
	 Card card = this.hand.remove(0);
		return card;
}
  
public void setName(String name) {
	this.name = name;
}
public void setHand(List<Card> hand) {
	this.hand = hand;
}
public void setScore(int score) {
	this.score = score;
}
public void draw (Deck deck) {
	hand.add(deck.draw ());
}
 public void incrementScore () {
	 this.score++;
 }
public List<Card> getHand() {
	return hand;
}
public int getScore() {
	return score;
}
public String getName() {
	return name;
}
 
}