package week6Project;

public class Card {
	// Fields
	private int value;
	private String name;
	private String suit;

	public Card(String name, String suit, int value) {
		this.value = value;
		this.name = name;
		this.suit = suit;
	}
//public Card() {
//	}
	// Methods
// 1. Getters and Setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	// Methods
//Describe (prints out information about a card) 

	public void describe() {
		System.out.println(this.name + " of " + this.suit);
	}
}