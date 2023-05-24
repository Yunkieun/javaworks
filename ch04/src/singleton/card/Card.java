package singleton.card;

public class Card {
	private static int serialNum = 101;
	private int CardNum;
	
	public Card() {
		serialNum++;
		CardNum = serialNum;
	}
	
	
	public int getCardNum() {
		return CardNum;
	}

}
