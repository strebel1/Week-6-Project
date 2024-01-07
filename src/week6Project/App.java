package week6Project;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//a.      Instantiate a Deck and two Players, 
		
		Deck deck = new Deck();
		Player player1 = new Player ();
		Player player2 = new Player ();
		
	
	//	call the shuffle method on the deck. 	
		deck.shuffle();
	 
		for (int i = 0; i < 52; i++); { 
		 
		 player1.draw(deck);
		 player2.draw(deck);
		 
		}
		
		for (int i = 0; i < 26; i++) {
			Card card1 = player1.flip();
			Card card2 = player2.flip();
		
	 }
		 /* b. Using a traditional for loop, iterate 52 times calling the 
			 * Draw method on the other player each iteration using the Deck you instantiated. 	
			 */
		deck.draw();
		{
		
	 for (int i = 0; i < 52; i++)
		
		
		System.out.println(deck);
	
		//c. Using a traditional for loop, iterate 26 times and call the flip method for each player. 

	for (int i = 0; i < 26; i++) {

		Card card1 = player1.flip();
        Card card2 = player2.flip();
        
        System.out.println("Player 1's card: " + card1.getName());
        System.out.println("Player 2's card: " + card2.getName());

        /*Compare the value of each card returned by the two player’s flip methods.
         *  Call the incrementScore method on the player whose card has the higher value. 
         *   Print a message to say which player received a point.
         */

       if (card1.getValue () > card2.getValue ()) {
            player1.incrementScore();
            System.out.println("Player 1 gets a point!");
        } else if (card1.getValue () < card2.getValue()) {
            player2.incrementScore();
            System.out.println("Player 2 gets a point!");
       } else {
            System.out.println("It's a tie! No point awarded.");
        }

        System.out.println("Player 1 score: " + player1.getScore());
        System.out.println("Player 2 score: " + player2.getScore());
        System.out.println();
    }

    System.out.println("Final score:");
    System.out.println("Player 1: " + player1.getScore());
    System.out.println("Player 2: " + player2.getScore());

    if (player1.getScore() > player2.getScore()) {
        System.out.println("Player 1 wins!");
    } else if (player1.getScore() < player2.getScore()) {
        System.out.println("Player 2 wins!");
    } else {
        System.out.println("It's a draw!");
    }
		}
}
	



	

	
	}
