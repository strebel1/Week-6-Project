package week6Project;

import java.util.List;

public class Player {
//Fields
	public List<Card> hand;
	public int score;
	public String name; 
	
 public	Player () {
		List<Card> list = this.hand = hand;
		this.score = 0;
		String string = this.name = name;
	}
//Methods
		public void describe () {
			System.out.println("Player has these cards ");
			for (Card card: hand ) {
				card.describe();
			}
		
	}
 public Card flip() {
	 Card hand = this.hand.remove(0);
		return hand;
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