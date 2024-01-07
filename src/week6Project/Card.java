package week6Project;

public class Card {
	//Fields
	int value;
	String name;
	String suit; 
	
	public Card (String suit, String name, int value) {
		this.value = value;
		this.name = name;
		this.suit= suit;
	}
// Methods
// 1. Getters and Setters
	public String getSuit() {
		return suit;
	}
	public void setSuit(String suit) {
		this.suit = suit;
	}
	public int getValue(int value) {
		int i = this.value = value;
		return i;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	//Methods
	public void describe () {
		System.out.println(this.name + " of " + this.suit);
	}
	public int getValue() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	// Describe (prints out information about a card) 
}
