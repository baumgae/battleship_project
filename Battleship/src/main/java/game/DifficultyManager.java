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
 * sets the difficulty of a new game. Over here the number of game
 * Elements will be given. 
 * The Method {@link #getFieldSize(EDifficulty)} is for the GameAreaFactory
 * so it will get the MaxX and MaxY Values. The GameArea will be as big as
 * it will be chosen.
 * <p>
 * 
 * @author Lea Baumgärtner
 * @version 0.2
 */


// In the default case I could return a ChooseDifficultyException or?
// What do you think about this architecture?


// TJ meant that I could use a general method, which means
// the impact of all gameElements. But I choose to use different methodes 
// because every gameElement has another impact.
public class DifficultyManager {
		

	public static Point getFieldSize (EDifficulty difficulty){
		switch(difficulty) {
		
		case EASY:
				return new Point(5,5);
		
		case NORMAL:
				return new Point(10,10);
				
		case HARD:
				return new Point(15,15);
				
		case SUICIDAL:
				return new Point(20,20);
		
		default:
				return new Point(5,5);
		}
	}

	public int getNumberOfDolphines(EDifficulty difficulty) {
		switch(difficulty) {
			
		case EASY:
				return 2;
		
		case NORMAL:
				return 2;
			
		case HARD:
				return 4;
		
		case SUICIDAL:
				return 5;
		default:
			return 1; 
		}
	}

	public int getNumberOfMines(EDifficulty difficulty) {
		switch(difficulty) {
		
		case EASY:
				return 0;
		
		case NORMAL:
				return 1;
			
		case HARD:
				return 2;
		
		case SUICIDAL:
				return 3;
		default:
			return 1; 
		}
	}

	public int getNumberOfIslands(EDifficulty difficulty) {
		switch(difficulty) {
		
		case EASY:
				return 1;
		
		case NORMAL:
				return 2;
			
		case HARD:
				return 3;
		
		case SUICIDAL:
				return 4;
		default:
			return 1; 
		}
	}

	public int getNumberOfLuckyDwarf(EDifficulty difficulty) {
		switch(difficulty) {
		
		case EASY:
				return 0;
		
		case NORMAL:
				return 1;
			
		case HARD:
				return 1;
		
		case SUICIDAL:
				return 2;
		default:
			return 0; 
		}
	}

	public int getNumberOfOneFieldBoat(EDifficulty difficulty) {
		switch(difficulty) {
		
		case EASY:
				return 2;
		
		case NORMAL:
				return 3;
			
		case HARD:
				return 4;
		
		case SUICIDAL:
				return 5;
		default:
			return 1; 
		}
	}

	public int getNumberOfTwoFieldBoat(EDifficulty difficulty) {
		switch(difficulty) {
		
		case EASY:
				return 2;
		
		case NORMAL:
				return 2;
			
		case HARD:
				return 4;
		
		case SUICIDAL:
				return 5;
		default:
			return 1; 
		}
	}

	public int getNumberOfThreeFieldBoat(EDifficulty difficulty) {
		switch(difficulty) {
		
		case EASY:
				return 2;
		
		case NORMAL:
				return 2;
			
		case HARD:
				return 4;
		
		case SUICIDAL:
				return 5;
		default:
			return 1; 
		}
	}

	public int getNumberOfFourFieldBoat(EDifficulty difficulty) {
		switch(difficulty) {
		
		case EASY:
				return 2;
		
		case NORMAL:
				return 2;
			
		case HARD:
				return 4;
		
		case SUICIDAL:
				return 5;
		default:
			return 1; 
		}
	}

	public int getNumberOfQuadrupleFieldBoat(EDifficulty difficulty) {
		switch(difficulty) {
		
		case EASY:
				return 2;
		
		case NORMAL:
				return 2;
			
		case HARD:
				return 4;
		
		case SUICIDAL:
				return 5;
		default:
			return 1; 
		}
	}

}
