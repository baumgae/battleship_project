package game;

import java.awt.Point;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * DifficultyManager for setting the size of the GameArea
 * 
 * <p>
 * This class is managing the different possible sizes of the Game Area due to
 * the setting of the Difficulty of the game.
 * 
 * <p>
 * The Method {@link #getFieldSize(EDifficulty)} is for the
 * GameAreaFactory so it will get the MaxX and MaxY Values. The GameArea will be
 * as big as it will be chosen.
 * {@link #getNumberOfDolphins(EDifficulty)} returns the number of dolphins depending on the chosen difficulty. <br>
 * {@link #getNumberOfIslands(EDifficulty)} returns the number of islands depending on the chosen difficulty. <br>
 * {@link #getNumberOfLuckyDwarfs(EDifficulty)} returns the number of lucky dwarfs depending on the chosen difficulty. <br>
 * {@link #getNumberOfMines(EDifficulty)} returns the number of mines depending on the chosen difficulty. <br>
 * {@link #getNumberOfOneFieldBoats(EDifficulty)} returns the number of one field boats depending on the chosen difficulty. <br>
 * <p>
 * 
 * @author Lea Baumgärtner
 * @version 1.0
 */

public class DifficultyManager {

	private static final Logger logger = LogManager.getLogger(DifficultyManager.class);
	/**
	 * Method for getting the size of the created Game Area
	 * 
	 * @param difficulty
	 * @return Point
	 */
	public static Point getFieldSize(EDifficulty difficulty) {
		logger.info("The method getFieldSize has been called!");
		switch (difficulty) {

		case EASY:
			logger.info("The size of EASY has been used!");
			return new Point(5, 5);

		case NORMAL:
			logger.info("The size of NORMAL has been used!");
			return new Point(8, 8);

		case HARD:
			logger.info("The size of HARD has been used!");
			return new Point(10, 10);

		case SUICIDAL:
			logger.info("The size of SUICIDAL has been used!");
			return new Point(13, 13);

		default:
			logger.debug("The size of the default case has been taken!");
			return new Point(5, 5);
		}
	}
	
	/**
	 * Method for getting the number of dolphins depending on the chosen difficulty
	 * 
	 * @param difficulty
	 * @return number of dolphins
	 */
	public static int getNumberOfDolphins(EDifficulty difficulty) {
		logger.info("The method getNumberOfDolphines has been called!");
		switch (difficulty) {

		case EASY:
			logger.info("The number of EASY has been choosen!");
			return 2;

		case NORMAL:
			logger.info("The number of NORMAL has been choosen!");
			return 2;

		case HARD:
			logger.info("The number of HARD has been choosen!");
			return 4;

		case SUICIDAL:
			logger.info("The number of SUICIDAL has been choosen!");
			return 5;
		default:
			logger.debug("The number of the default case has been taken!");
			return 1;
		}
	}
	
	/**
	 * Method for getting the number of mines depending on the chosen difficulty
	 * 
	 * @param difficulty
	 * @return number of mines
	 */
	public static int getNumberOfMines(EDifficulty difficulty) {
		logger.info("The method getNumberOfMines has been called!");
		switch (difficulty) {

		case EASY:
			logger.info("The number of EASY has been choosen!");
			return 0;

		case NORMAL:
			logger.info("The number of NORMAL has been choosen!");
			return 1;

		case HARD:
			logger.info("The number of HARD has been choosen!");
			return 2;

		case SUICIDAL:
			logger.info("The number of SUICIDAL has been choosen!");
			return 3;
			
		default:
			logger.debug("The number of the default case has been taken!");
			return 1;
		}
	}

	/**
	 * Method for getting the number of islands depending on the chosen difficulty
	 * 
	 * @param difficulty
	 * @return number of islands
	 */
	public static int getNumberOfIslands(EDifficulty difficulty) {
		logger.info("The method getNumberOfIsland has been called!");
		switch (difficulty) {

		case EASY:
			logger.info("The number of EASY has been choosen!");
			return 1;

		case NORMAL:
			logger.info("The number of NORMAL has been choosen!");
			return 2;

		case HARD:
			logger.info("The number of HARD has been choosen!");
			return 3;

		case SUICIDAL:
			logger.info("The number of SUICIDAL has been choosen!");
			return 4;
			
		default:
			logger.debug("The number of the default case has been taken!");
			return 1;
		}
	}
	
	/**
	 * Method for getting the number of lucky dwarfs depending on the chosen difficulty
	 * @param difficulty
	 * @return number of lucky dwarfs
	 */
	public static int getNumberOfLuckyDwarfs(EDifficulty difficulty) {
		logger.info("The method getNumberOfLuckyDwarf has been called!");
		switch (difficulty) {

		case EASY:
			logger.info("The number of EASY has been choosen!");
			return 0;

		case NORMAL:
			logger.info("The number of NORMAL has been choosen!");
			return 1;

		case HARD:
			logger.info("The number of HARD has been choosen!");
			return 1;

		case SUICIDAL:
			logger.info("The number of SUICIDAL has been choosen!");
			return 2;
			
		default:
			logger.debug("The number of the default case has been taken!");
			return 0;
		}
	}
	
	/**
	 * Method for getting the number of one field boats depending on the chosen difficulty
	 * @param difficulty
	 * @return number of one field boats
	 */
	public static int getNumberOfOneFieldBoats(EDifficulty difficulty) {
		logger.info("The method getNumberOfOneFieldBoat has been called!");
		switch (difficulty) {

		case EASY:
			logger.info("The number of EASY has been choosen!");
			return 5;

		case NORMAL:
			logger.info("The number of NORMAL has been choosen!");
			return 8;

		case HARD:
			logger.info("The number of HARD has been choosen!");
			return 10;

		case SUICIDAL:
			logger.info("The number of SUICIDAL has been choosen!");
			return 15;
			
		default:
			logger.debug("The number of the default case has been taken!");
			return 20;
		}
	}

	/*
	 * THESE METHODS AREN'T ACTIVE!
	 * 
	 * 
	 * 
	public int getNumberOfTwoFieldBoat(EDifficulty difficulty) {
		
		logger.info("The method getNumberOfTwoFieldBoat has been called!");
		switch (difficulty) {

		case EASY:
			logger.info("The number of EASY has been choosen!");
			return 2;

		case NORMAL:
			logger.info("The number of NORMAL has been choosen!");
			return 2;

		case HARD:
			logger.info("The number of HARD has been choosen!");
			return 4;

		case SUICIDAL:
			logger.info("The number of SUICIDAL has been choosen!");
			return 5;
			
		default:
			logger.debug("The number of the default case has been taken!");
			return 1;
		}
	}

	public int getNumberOfThreeFieldBoat(EDifficulty difficulty) {
		logger.info("The method getNumberOfThreeFieldBoat has been called!");
		switch (difficulty) {

		case EASY:
			logger.info("The number of EASY has been choosen!");
			return 2;

		case NORMAL:
			logger.info("The number of NORMAL has been choosen!");
			return 2;

		case HARD:
			logger.info("The number of HARD has been choosen!");
			return 4;

		case SUICIDAL:
			logger.info("The number of SUICIDAL has been choosen!");
			return 5;
			
		default:
			logger.info("The number of the default case has been taken!");
			return 1;
		}
	}

	public int getNumberOfFourFieldBoat(EDifficulty difficulty) {
		logger.info("The method getNumberOfFourFieldBoat has been called!");
		switch (difficulty) {

		case EASY:
			logger.info("The number of EASY has been choosen!");
			return 2;

		case NORMAL:
			logger.info("The number of NORMAL has been choosen!");
			return 2;

		case HARD:
			logger.info("The number of HARD has been choosen!");
			return 4;

		case SUICIDAL:
			logger.info("The number of SUICIDAL has been choosen!");
			return 5;
			
		default:
			logger.debug("The number of the default case has been taken!");
			return 1;
		}
	}

	public int getNumberOfQuadrupleFieldBoat(EDifficulty difficulty) {
		logger.info("The method getNumberOfQuadrupleFieldBoat has been called!");
		switch (difficulty) {

		case EASY:
			logger.info("The number of EASY has been choosen!");
			return 2;

		case NORMAL:
			logger.info("The number of NORMAL has been choosen!");
			return 2;

		case HARD:
			logger.info("The number of HARD has been choosen!");
			return 4;

		case SUICIDAL:
			logger.info("The number of SUICIDAL has been choosen!");
			return 5;
			
		default:
			logger.debug("The number of the default case has been taken!");
			return 1;
		}
	}
	*/
}
