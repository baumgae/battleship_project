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
 * The Method {@link #setDifficulty} will be called, if the player sets the
 * difficulty of a new game. Over here the number of game Elements will be
 * given. The Method {@link #getFieldSize(EDifficulty)} is for the
 * GameAreaFactory so it will get the MaxX and MaxY Values. The GameArea will be
 * as big as it will be chosen.
 * <p>
 * 
 * @author Lea Baumgärtner
 * @version 0.2
 */

public class DifficultyManager {

	private static final Logger logger = LogManager.getLogger(DifficultyManager.class);

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

	public static int getNumberOfDolphines(EDifficulty difficulty) {
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

	public static int getNumberOfLuckyDwarf(EDifficulty difficulty) {
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

	public static int getNumberOfOneFieldBoat(EDifficulty difficulty) {
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
