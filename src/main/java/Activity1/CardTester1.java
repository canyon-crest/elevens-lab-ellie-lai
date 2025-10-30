package Activity1;
/**
 * This is a class that tests the Card class.
 */
public class CardTester1 {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card1 card = new Card1("3", "spades", 3);
		Card1 card2 = new Card1("4", "diamond", 4);
		Card1 card3 = new Card1("5", "clubs", 5);
		
		System.out.println(card.rank());
		System.out.println(card2.suit());
		System.out.println(card3.pointValue());
		System.out.println(card2.matches(card3));
		System.out.println(card3.toString());


		
	}
}
