package game;
import java.awt.Point;

/**
 * DifficultyManager for setting the size of the GameArea
 * 
 * <p>
 * This class is managing the different possible sizes of the Game Area
 * due to the setting of the Difficulty of the game.
 * 
 * <p>
 * The Method {@link #setDifficulty} will be called, if the player
 * sets the difficulty of a new game. The GameArea will be as big as
 * it will be chosen.
 * <p>
 * 
 * @author Lea Baumgärtner
 * @version 0.2
 */

public class DifficultyManager {
		

	public Point getDifficulty (EDifficulty difficulty) { 	
	
		switch(difficulty) {
	
			case EASY:
				return new Point(5,5);
			
			case NORMAL:
				return new Point(10,10);
			
			case HARD:
				Point p = new Point(15,15);
				return p;
			
			case SUICIDAL:
				return new Point(20,20);
				
			default:
				return new Point(5,5);
	
	}
}

}
