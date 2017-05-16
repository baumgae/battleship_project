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
		
	int numberOfDolphines;
	int numberOfMines;
	int numberOfIslands;
	int numberOfLuckyDwarf;
	
	int numberOfOneFieldBoat;
	int numberOfTwoFieldBoat;
	int numberOfThreeFieldBoat;
	int numberOfFourFieldBoat;
	int numberOfQuadrupleFieldBoat;

	public void setDifficulty (EDifficulty difficulty) { 	
	
		switch(difficulty) {
	
			case EASY:
				
				numberOfDolphines = 2;
				numberOfOneFieldBoat = 2;
				// numberOfTwoFieldBoat = 2;
				// numberOfThreeFieldBoat = 1;
				
			
			case NORMAL:
				
				numberOfDolphines = 2;
				numberOfIslands = 1;
				numberOfOneFieldBoat = 3;
				numberOfTwoFieldBoat = 1;
				numberOfThreeFieldBoat = 2;
				numberOfFourFieldBoat = 1;
				numberOfQuadrupleFieldBoat = 1;
			
			case HARD:
				
				numberOfDolphines = 4;
				numberOfIslands = 2;
				numberOfLuckyDwarf = 1;
				
				numberOfOneFieldBoat = 4;
				// numberOfTwoFieldBoat = 3;
				// numberOfThreeFieldBoat = 1;
				// numberOfFourFieldBoat = 2;
				// numberOfQuadrupleFieldBoat = 2;
				
			
			case SUICIDAL:
				
				numberOfDolphines = 5;
				numberOfIslands = 4;
				numberOfLuckyDwarf = 1;
				numberOfMines = 4;
				
				numberOfOneFieldBoat = 5;
				//numberOfTwoFieldBoat = 3;
				//numberOfThreeFieldBoat = 3;
				//numberOfFourFieldBoat = 1;
				//numberOfQuadrupleFieldBoat = 3;
				
				
				
			default:
	
	}
	
	
}
	public Point getFieldSize (EDifficulty difficulty){
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

	public int getNumberOfDolphines() {
		return this.numberOfDolphines;
	}

	public int getNumberOfMines(EDifficulty difficulty) {
		return this.numberOfMines;
	}

	public int getNumberOfIslands(EDifficulty difficulty) {
		return this.numberOfIslands;
	}

	public int getNumberOfLuckyDwarf(EDifficulty difficulty) {
		return this.numberOfLuckyDwarf;
	}

	public int getNumberOfOneFieldBoat(EDifficulty difficulty) {
		return this.numberOfOneFieldBoat;
	}

	public int getNumberOfTwoFieldBoat(EDifficulty difficulty) {
		return this.numberOfTwoFieldBoat;
	}

	public int getNumberOfThreeFieldBoat(EDifficulty difficulty) {
		return this.numberOfThreeFieldBoat;
	}

	public int getNumberOfFourFieldBoat(EDifficulty difficulty) {
		return this.numberOfFourFieldBoat;
	}

	public int getNumberOfQuadrupleFieldBoat(EDifficulty difficulty) {
		return this.numberOfQuadrupleFieldBoat;
	}

}
