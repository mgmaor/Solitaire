package il.mgmaor.solitaire;

public class Card {

	private char	rank;

	private char	suit;

	private int	lastX;

	private int	lastY;

	private int	currentX;

	private int	currentY;

	private int	tableauPileIndex;

	private int	tableauCardIndex;

	private boolean	shown;

	private boolean	heading;

	private Pile	pile;

	public Card(char rank, char suit) {
		this.rank = rank;
		this.suit = suit;
	}

	public char getRank() {
		return rank;
	}

	public void setRank(char rank) {
		this.rank = rank;
	}

	public char getSuit() {
		return suit;
	}

	public void setSuit(char suit) {
		this.suit = suit;
	}

	public int getLastX() {
		return lastX;
	}

	public void setLastX(int lastX) {
		this.lastX = lastX;
		this.currentX = lastX;
	}

	public int getLastY() {
		return lastY;
	}

	public void setLastY(int lastY) {
		this.lastY = lastY;
		this.currentY = lastY;
	}

	public int getCurrentX() {
		return currentX;
	}

	public void setCurrentX(int currentX) {
		this.currentX = currentX;
	}

	public int getCurrentY() {
		return currentY;
	}

	public void setCurrentY(int currentY) {
		this.currentY = currentY;
	}

	public int getTableauPileIndex() {
		return tableauPileIndex;
	}

	public void setTableauPileIndex(int tableauPileIndex) {
		this.tableauPileIndex = tableauPileIndex;
	}

	public int getTableauCardIndex() {
		return tableauCardIndex;
	}

	public void setTableauCardIndex(int tableauCardIndex) {
		this.tableauCardIndex = tableauCardIndex;
	}

	public boolean isShown() {
		return shown;
	}

	public void setShown(boolean shown) {
		this.shown = shown;
	}

	public boolean isHeading() {
		return heading;
	}

	public void setHeading(boolean heading) {
		this.heading = heading;
	}

	public Pile getPile() {
		return pile;
	}

	public void setPile(Pile pile) {
		this.pile = pile;
	}

}