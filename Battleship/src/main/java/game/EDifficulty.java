package game;

import gameElement.Dolphin;
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
	
	private int numberOfDolphines;
	private int numberOfIslands;
	private int numberOfLuckyDwarfs;
	private int numberOfMines;
	
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
	
	
	public int createDolphin(int numberOfDolphins) {
	// is this possible? To store the created dolphins in 
	// ArrayList and after that hand them over to GameArea?
		for (int i = 0; i <= numberOfDolphines; i++) {
			Dolphin dolphins = new Dolphin();
		}
		return 1;
	}
	
	public int createIsland(int numberOfIslands) {
		return 2;
	}
	
	public int createLuckyDwarf(int numberOfLuckyDwarfs) {
		return 3;
	}
	
	public int createMine(int numberOfMines) {
		return 4;
	}
	
	
	
}


