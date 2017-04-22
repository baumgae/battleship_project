package game;


/**
 * Enum for setting the difficulty
 * 
 * <p>
 * This enum has the different values which correspond to the 
 * different possible difficulties for the game.
 * <p>
 * 
 * @author Lea Baumgärtner
 * @version 0.1
 */
public enum EDifficulty {
			EASY(5,5), 
			NORMAL(10,10), 
			HARD(15,15), 
			SUICIDAL(20,20);

	private int maxX;
	private int maxY;
	
	
	EDifficulty (int maxX, int maxY) {
		this.maxX = maxX;
		this.maxY = maxY;
	}
	
	public int getMaxX() {
		return this.maxX;
	}
	
	public int getMaxY() {
		return this.maxY;
	}
	
	
}


