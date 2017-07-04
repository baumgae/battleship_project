package com.hdm_stuttgart.Battleship;

import java.awt.Point;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import gameConfigurations.HumanPlayer;
import gameConfigurations.Item;
import battleshipGUI.SelectDifficultyScreen;

import battleshipGUI.SetNameScreen;
import game.AlreadyShotException;
import game.DifficultyManager;
import game.EDifficulty;
import game.GameArea;
import game.NoGameElementException;
import gameConfigurations.ArtificialIntelligence;
import gameConfigurations.CreatePlayerException;
import gameConfigurations.IPlayer;
import gameConfigurations.PlayerFactory;

/**
 * GameManager
 * <p>
 * The GameMananger which manages between the Input of the players through the
 * Graphical User Interface and the Classes underneath.
 * <p>
 * {@link #getInstance()} is for getting an instance of the GameManager to use
 * easily the methods. <br>
 * {@link #setScore(int)} is for setting the score of the players.<br>
 * {@link #getScore()} is for getting the scores. <br>
 * {@link #selectPlayer(int)} is for creating the players depending which mode
 * has been chosen. <br>
 * {@link #getPlayerOne()} returns player one. <br>
 * {@link #getPlayerTwo()} returns player two.<br>
 * {@link #createGameArea(int, int)} creates game Area depending on the
 * difficulty chosen.<br>
 * {@link #getGameAreaPlayerOne()} returns the game Area of player One.<br>
 * {@link #getGameAreaPlayerTwo()} returns the game Area of player Two.<br>
 * {@link #setShipsOnArea(int, Point)} is for setting the ships on the area
 * through a human user / player. <br>
 * {@link #setItemsOnArea(int, int)} is for setting randomly the special items
 * on the areas of human player.<br>
 * {@link #setItemsOnAreaPC(int, int)} is for setting randomly all items
 * including ships for the computer player.<br>
 * {@link #shootOnCoordinate(int, Point)} is for shooting on coordinates.<br>
 * {@link #generateRandomShoots()} is for generating random coordinates for the
 * shoots of the computer player. <br>
 * {@link #shootOnCoordinatePC(Point)} is for shooting random on the game
 * area.<br>
 * {@link #startThreadPrintItems()} is for starting the ThreadPrintItems. <br>
 * {@link #getThreadPrintItems()} is for getting the ThreadPrintItems.
 * 
 * 
 * <p>
 * 
 * @author Lea Baumgärtner
 * @author Celine Wichmann
 * @version 1.0
 */

public class GameManager {

	private static final Logger logger = LogManager.getLogger(GameManager.class);

	public static int playerNumber;
	public static int difficultyNumber;

	GameArea playerOneGameArea;
	GameArea playerTwoGameArea;

	IPlayer playerOne;
	IPlayer playerTwo;

	public PrintItemThread thread;
	private static GameManager instance;

	private int score;

	/**
	 * This method is for getting an instance of the GameManager to use easily
	 * the methods.
	 * 
	 * @return GameManager
	 */
	public static GameManager getInstance() {
		if (instance == null) {
			instance = new GameManager();
		}
		return instance;
	}

	/**
	 * This method is for setting the score of the players.
	 * 
	 * @param score
	 */
	public void setScore(int score) {
		this.score = this.score + score;
		logger.info("Current score: " + score);
	}

	/**
	 * This method is for getting the score of the players.
	 * 
	 * @return score;
	 */
	public int getScore() {
		return score;
	}

	/**
	 * This method is for creating the players depending which mode has been
	 * chosen.
	 * 
	 * @param playerNumber
	 * @throws CreatePlayerException
	 */
	public void selectPlayer(int playerNumber) throws CreatePlayerException {
		logger.info("Method selectPlayer has been called!");

		GameManager.playerNumber = playerNumber;

		if (playerNumber == 1) {

			IPlayer playerOne = PlayerFactory.getInstance(PlayerFactory.PLAYER_TYPE_HUMAN, SetNameScreen.name);

			IPlayer playerTwo = PlayerFactory.getInstance(PlayerFactory.PLAYER_TYPE_AI, "ComputerHans");

			this.playerOne = playerOne;
			this.playerTwo = playerTwo;
		}

		else if (playerNumber == 2) {

			IPlayer playerOne = PlayerFactory.getInstance("human", SetNameScreen.nameOne);
			IPlayer playerTwo = PlayerFactory.getInstance("human", SetNameScreen.nameTwo);

			this.playerOne = playerOne;
			this.playerTwo = playerTwo;
		}
	}

	/**
	 * This method returns player One
	 * 
	 * @return playerOne
	 */
	public IPlayer getPlayerOne() {
		return playerOne;
	}

	/**
	 * This method returns player Two
	 * 
	 * @return playerTwo
	 */
	public IPlayer getPlayerTwo() {
		return playerTwo;
	}

	/**
	 * Method which creates the game Area depending on the difficulty chosen.
	 * 
	 * @param difficultyNumber
	 * @param playerNr
	 */
	public void createGameArea(int difficultyNumber, int playerNr) {

		logger.info("The method createGameArea has been called!");

		GameManager.difficultyNumber = difficultyNumber;

		if (playerNr == 1) {
			if (difficultyNumber == 1) {

				GameArea gameA = new GameArea(EDifficulty.EASY);
				playerOneGameArea = gameA;

			} else if (difficultyNumber == 2) {

				GameArea gameA = new GameArea(EDifficulty.NORMAL);
				playerOneGameArea = gameA;

			} else if (difficultyNumber == 3) {

				GameArea gameA = new GameArea(EDifficulty.HARD);
				playerOneGameArea = gameA;

			} else if (difficultyNumber == 4) {

				GameArea gameA = new GameArea(EDifficulty.SUICIDAL);
				playerOneGameArea = gameA;

			} else {
				logger.debug("No possible difficultyNumber has been recognized!");
				GameArea gameA = new GameArea(EDifficulty.EASY);
				playerOneGameArea = gameA;

			}

		} else {
			if (difficultyNumber == 1) {

				GameArea gameB = new GameArea(EDifficulty.EASY);
				playerTwoGameArea = gameB;

			} else if (difficultyNumber == 2) {

				GameArea gameB = new GameArea(EDifficulty.NORMAL);
				playerTwoGameArea = gameB;

			} else if (difficultyNumber == 3) {

				GameArea gameB = new GameArea(EDifficulty.HARD);
				playerTwoGameArea = gameB;

			} else if (difficultyNumber == 4) {

				GameArea gameB = new GameArea(EDifficulty.SUICIDAL);
				playerTwoGameArea = gameB;

			} else {
				logger.debug("No possible difficultyNumber has been recognized!");

				GameArea gameB = new GameArea(EDifficulty.EASY);
				playerTwoGameArea = gameB;

			}
		}
	}

	/**
	 * 
	 * @return GameArea of playerOne
	 */
	public GameArea getGameAreaPlayerOne() {
		return playerOneGameArea;
	}

	/**
	 * 
	 * @return GameArea of playerTwo
	 */
	public GameArea getGameAreaPlayerTwo() {
		return playerTwoGameArea;
	}

	/**
	 * This method is for setting the ships on the area through a human user /
	 * player.
	 * 
	 * @param playerNumber
	 * @param shipPosition
	 */
	public void setShipsOnArea(int playerNumber, Point shipPosition) {

		GameArea gameArea;

		if (playerNumber == 1) {
			gameArea = getGameAreaPlayerOne();
		} else {
			gameArea = getGameAreaPlayerTwo();
		}

		gameArea.setShipPosition(shipPosition);

	}

	/**
	 * This method is for setting randomly the special items on the areas of
	 * human player.
	 * 
	 * @param difficultyNumber
	 * @param playerNumber
	 */
	public void setItemsOnArea(int difficultyNumber, int playerNumber) {

		GameArea gameArea;

		if (playerNumber == 1) {
			gameArea = getGameAreaPlayerOne();

		} else {
			gameArea = getGameAreaPlayerTwo();
		}

		if (difficultyNumber == 1) {

			gameArea.setNumberOfItems(1, DifficultyManager.getNumberOfDolphins(EDifficulty.EASY));
			gameArea.setNumberOfItems(2, DifficultyManager.getNumberOfIslands(EDifficulty.EASY));
			gameArea.setNumberOfItems(3, DifficultyManager.getNumberOfLuckyDwarfs(EDifficulty.EASY));
			gameArea.setNumberOfItems(4, DifficultyManager.getNumberOfMines(EDifficulty.EASY));
		} else if (difficultyNumber == 2) {

			gameArea.setNumberOfItems(1, DifficultyManager.getNumberOfDolphins(EDifficulty.NORMAL));
			gameArea.setNumberOfItems(2, DifficultyManager.getNumberOfIslands(EDifficulty.NORMAL));
			gameArea.setNumberOfItems(3, DifficultyManager.getNumberOfLuckyDwarfs(EDifficulty.NORMAL));
			gameArea.setNumberOfItems(4, DifficultyManager.getNumberOfMines(EDifficulty.NORMAL));
		} else if (difficultyNumber == 3) {

			gameArea.setNumberOfItems(1, DifficultyManager.getNumberOfDolphins(EDifficulty.HARD));
			gameArea.setNumberOfItems(2, DifficultyManager.getNumberOfIslands(EDifficulty.HARD));
			gameArea.setNumberOfItems(3, DifficultyManager.getNumberOfLuckyDwarfs(EDifficulty.HARD));
			gameArea.setNumberOfItems(4, DifficultyManager.getNumberOfMines(EDifficulty.HARD));
		} else if (difficultyNumber == 4) {

			gameArea.setNumberOfItems(1, DifficultyManager.getNumberOfDolphins(EDifficulty.SUICIDAL));
			gameArea.setNumberOfItems(2, DifficultyManager.getNumberOfIslands(EDifficulty.SUICIDAL));
			gameArea.setNumberOfItems(3, DifficultyManager.getNumberOfLuckyDwarfs(EDifficulty.SUICIDAL));
			gameArea.setNumberOfItems(4, DifficultyManager.getNumberOfMines(EDifficulty.SUICIDAL));
		} else {
			logger.debug("No possible difficultyNumber has been recognized!");
		}

	}

	/**
	 * This is for setting randomly all items including ships for the computer
	 * player.
	 * 
	 * @param difficultyNumber
	 * @param playerNumber
	 */
	public void setItemsOnAreaPC(int difficultyNumber, int playerNumber) {

		GameArea gameArea;

		if (playerNumber == 1) {
			gameArea = getGameAreaPlayerOne();

		} else {
			gameArea = getGameAreaPlayerTwo();
		}

		if (difficultyNumber == 1) {

			gameArea.setNumberOfItems(1, DifficultyManager.getNumberOfDolphins(EDifficulty.EASY));
			gameArea.setNumberOfItems(2, DifficultyManager.getNumberOfIslands(EDifficulty.EASY));
			gameArea.setNumberOfItems(3, DifficultyManager.getNumberOfLuckyDwarfs(EDifficulty.EASY));
			gameArea.setNumberOfItems(4, DifficultyManager.getNumberOfMines(EDifficulty.EASY));
			gameArea.setNumberOfItems(5, DifficultyManager.getNumberOfOneFieldBoats(EDifficulty.EASY));
		} else if (difficultyNumber == 2) {

			gameArea.setNumberOfItems(1, DifficultyManager.getNumberOfDolphins(EDifficulty.NORMAL));
			gameArea.setNumberOfItems(2, DifficultyManager.getNumberOfIslands(EDifficulty.NORMAL));
			gameArea.setNumberOfItems(3, DifficultyManager.getNumberOfLuckyDwarfs(EDifficulty.NORMAL));
			gameArea.setNumberOfItems(4, DifficultyManager.getNumberOfMines(EDifficulty.NORMAL));
			gameArea.setNumberOfItems(5, DifficultyManager.getNumberOfOneFieldBoats(EDifficulty.NORMAL));
		} else if (difficultyNumber == 3) {

			gameArea.setNumberOfItems(1, DifficultyManager.getNumberOfDolphins(EDifficulty.HARD));
			gameArea.setNumberOfItems(2, DifficultyManager.getNumberOfIslands(EDifficulty.HARD));
			gameArea.setNumberOfItems(3, DifficultyManager.getNumberOfLuckyDwarfs(EDifficulty.HARD));
			gameArea.setNumberOfItems(4, DifficultyManager.getNumberOfMines(EDifficulty.HARD));
			gameArea.setNumberOfItems(5, DifficultyManager.getNumberOfOneFieldBoats(EDifficulty.HARD));
		} else if (difficultyNumber == 4) {

			gameArea.setNumberOfItems(1, DifficultyManager.getNumberOfDolphins(EDifficulty.SUICIDAL));
			gameArea.setNumberOfItems(2, DifficultyManager.getNumberOfIslands(EDifficulty.SUICIDAL));
			gameArea.setNumberOfItems(3, DifficultyManager.getNumberOfLuckyDwarfs(EDifficulty.SUICIDAL));
			gameArea.setNumberOfItems(4, DifficultyManager.getNumberOfMines(EDifficulty.SUICIDAL));
			gameArea.setNumberOfItems(5, DifficultyManager.getNumberOfOneFieldBoats(EDifficulty.SUICIDAL));
		} else {
			logger.debug("No possible difficultyNumber has been recognized!");
		}

	}

	/**
	 * This method is for shooting on coordinates.
	 * 
	 * @param playerNumber
	 * @param p
	 * @return
	 */
	public int shootOnCoordinate(int playerNumber, Point p) {

		GameArea gameArea;
		// First Player shoots on GameArea second Player
		if (playerNumber == 1) {

			gameArea = getGameAreaPlayerTwo();
			int ID = gameArea.getIDCoordinate(p);

			try {

				int points = gameArea.getPointsCoordinate(ID, p);
				getPlayerOne().countPoints(points);
				getPlayerOne().countHits(1);
				logger.info("Points: " + getPlayerOne().getCountedHits());

			} catch (NoGameElementException e) {
				logger.error("There is no Game Element");
			}

			try {
				gameArea.shootOnCoordinate(p);
			} catch (Exception f) {
				f.getMessage();
			}
			return ID;

		} else {
			// Second Player shoots on GameArea of first Player
			gameArea = getGameAreaPlayerOne();
			int ID = gameArea.getIDCoordinate(p);

			try {
				int points = gameArea.getPointsCoordinate(ID, p);
				getPlayerTwo().countPoints(points);
				getPlayerTwo().countHits(1);

			} catch (NoGameElementException e) {
				logger.error("There is no Game Element");
			}

			try {
				gameArea.shootOnCoordinate(p);
			} catch (Exception f) {
				f.getMessage();
			}

			return ID;
		}
	}

	/**
	 * This is for generating random coordinates for the shoots of the computer
	 * player.
	 * 
	 * @return Point p
	 */
	public Point generateRandomShoots() {
		Point p = new Point();
		int maxX = p.x;
		int maxY = p.y;

		int x = ArtificialIntelligence.randomCoordinateX(maxX);
		int y = ArtificialIntelligence.randomCoordinateY(maxY);

		Point shoot = new Point(x, y);

		return shoot;

	}

	/**
	 * This is for shooting random on the game area.
	 * 
	 * @param p
	 * @return ID
	 * @throws Exception
	 */
	public int shootOnCoordinatePC(Point p) throws Exception {
		p = generateRandomShoots();

		GameArea gameArea;

		gameArea = getGameAreaPlayerOne();
		int ID = gameArea.getIDCoordinate(p);

		try {

			int points = gameArea.getPointsCoordinate(ID, p);
			// ComputerPlayer
			getPlayerTwo().countPoints(points);
			getPlayerTwo().countHits(1);

		} catch (NoGameElementException e) {
			logger.error("There is no Game Element");
		}

		try {
			gameArea.shootOnCoordinate(p);
		} catch (AlreadyShotException f) {
			f.getMessage();
		}
		return ID;

	}

	/**
	 * This is for starting the ThreadPrintItems.
	 * 
	 */
	public void startThreadPrintItems() {
		PrintItemThread thread = new PrintItemThread();
		thread.start();
		this.thread = thread;

	}

	/**
	 * This is for getting the ThreadPrintItems.
	 * 
	 * @return thread
	 */
	public PrintItemThread getThreadPrintItems() {
		return thread;
	}

}
