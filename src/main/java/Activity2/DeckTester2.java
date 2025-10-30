package Activity2;
/**
 * This is a class that tests the Deck class.
 */
public class DeckTester2 {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] ranks = {"diamond", "clubs", "spades", "hearts"};
		String[] suits = {"3", "4", "5", "6"};
		int[] value = {3, 4, 5, 6};
		Deck2 deck = new Deck2(ranks, suits, value);
		System.out.println(deck.size());
		System.out.println(deck.deal());
		System.out.println(deck.isEmpty());
		System.out.println(deck);


		
		
	}
}
