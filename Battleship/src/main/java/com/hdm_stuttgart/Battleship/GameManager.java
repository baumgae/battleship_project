package com.hdm_stuttgart.Battleship;

import java.awt.Point;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import battleshipGUI.SelectDifficultyScreen;
import battleshipGUI.SetNameScreen;
import game.AlreadyShotException;
import game.DifficultyManager;
import game.EDifficulty;
import game.GameArea;
import game.NoGameElementException;
import gameConfigurations.ArtificialIntelligence;
import gameConfigurations.CreatePlayerException;
import gameConfigurations.HumanPlayer;
import gameConfigurations.IPlayer;
import gameConfigurations.Item;
import gameConfigurations.PlayerFactory;

/**
* GameManager
* <p>
* The GameMananger which manages between the Input of the players
* through the Graphical User Interface and the Classes underneath.
* <p>
* 
* 
* <p>
* @author Lea Baumgärtner
* @author Celine Wichmann
* @version 0.1 
*/

public class GameManager {
	
	private static final Logger logger = LogManager.getLogger(GameManager.class);
	
	
	public static int playerNumber;
	public static int difficultyNumber;
	
	GameArea playerOneGameArea;
	GameArea playerTwoGameArea;
	
	IPlayer playerOne;
	IPlayer playerTwo;
	
	private static GameManager instance;
	
	private int score;
	
	public static GameManager getInstance(){
		if(instance == null){
			instance = new GameManager();
		}
		return instance;
	}
	
	public void setScore(int score) {
		this.score = this.score + score;
		logger.info("Current score: " + score);
	}
	
	
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
	
	public IPlayer getPlayerOne() {
		return playerOne;
	}
	
	public IPlayer getPlayerTwo() {
		return playerTwo;
	}
	
		
	
		// TJ: Ich glaube, dass das eine sehr wichtige Methode ist. Im Moment wird diese aber noch nicht
		// aufgerufen
		public void createGameArea(int difficultyNumber, int playerNr) {
			
			logger.info("The method createGameArea has been called!");
			
			GameManager.difficultyNumber = difficultyNumber;
			
			if (playerNr == 1) {
			if (difficultyNumber == 1) {
				
				// GameArea nach außen geben.
				GameArea gameA = new GameArea(EDifficulty.EASY);
				playerOneGameArea = gameA;
				
			}
			else if (difficultyNumber == 2) {
				// GameArea nach außen geben.
				GameArea gameA = new GameArea(EDifficulty.NORMAL);
				playerOneGameArea = gameA;
				
			}
			else if (difficultyNumber == 3) {
				// GameArea nach außen geben.
				GameArea gameA = new GameArea(EDifficulty.HARD);
				playerOneGameArea = gameA;
				
			}
			else if (difficultyNumber == 4) {
				// GameArea nach außen geben.
				GameArea gameA = new GameArea(EDifficulty.SUICIDAL);
				playerOneGameArea = gameA;
				
			}
			else {
				logger.debug("No possible difficultyNumber has been recognized!");
				GameArea gameA = new GameArea(EDifficulty.EASY);
				playerOneGameArea = gameA;
	
			}
			
			} else {
				if (difficultyNumber == 1) {
					
					GameArea gameB = new GameArea(EDifficulty.EASY);
					playerTwoGameArea = gameB;
					
				}
				else if (difficultyNumber == 2) {
					
					GameArea gameB = new GameArea(EDifficulty.NORMAL);
					playerTwoGameArea = gameB;
					
				}
				else if (difficultyNumber == 3) {

					GameArea gameB = new GameArea(EDifficulty.HARD);
					playerTwoGameArea = gameB;
					
				}
				else if (difficultyNumber == 4) {
					
					GameArea gameB = new GameArea(EDifficulty.SUICIDAL);
					playerTwoGameArea = gameB;
					
				}
				else {
					logger.debug("No possible difficultyNumber has been recognized!");
					
					GameArea gameB = new GameArea(EDifficulty.EASY);
					playerTwoGameArea = gameB;
		
				}
			}
		}
		
		
		public GameArea getGameAreaPlayerOne() {
			return playerOneGameArea;
		}
		
		public GameArea getGameAreaPlayerTwo() {
			return playerTwoGameArea;
		}
		
		public void initWater(){
			
		}
		
		// Damit werden die Schiffe auf die GameArea gesetzt
		public void setShipsOnArea(int playerNumber, Point shipPosition){
			
			// hier wird die GameArea des jeweiligen Spielers geholt
			GameArea gameArea;
			
			if (playerNumber == 1) {
				gameArea = getGameAreaPlayerOne();
			}
			else {
				gameArea = getGameAreaPlayerTwo();
			}
			
			gameArea.setShipPosition(shipPosition);
			
		}
		
		// Nachdem GameArea geschaffen und Schiffe gesetzt wurden.
		// Nun werden die Items je nach Schwierigkeitsgrad draufgesetzt.
		public void setItemsOnArea(int difficultyNumber, int playerNumber) {
			
			GameArea gameArea;
			
			// Je nachdem auf welche GameArea das gesetzt werden soll...
			if (playerNumber == 1) {
				gameArea = getGameAreaPlayerOne();
				
			}
			else {
				gameArea = getGameAreaPlayerTwo();
			}
			
			
			if (difficultyNumber == 1) {
				
			
				// Generate Items
				gameArea.setNumberOfItems(1, DifficultyManager.getNumberOfDolphines(EDifficulty.EASY));
				gameArea.setNumberOfItems(2, DifficultyManager.getNumberOfIslands(EDifficulty.EASY));
				gameArea.setNumberOfItems(3, DifficultyManager.getNumberOfLuckyDwarf(EDifficulty.EASY));
				gameArea.setNumberOfItems(4, DifficultyManager.getNumberOfMines(EDifficulty.EASY));
			}
			else if (difficultyNumber == 2) {
				
				// Generate Items
				gameArea.setNumberOfItems(1, DifficultyManager.getNumberOfDolphines(EDifficulty.NORMAL));
				gameArea.setNumberOfItems(2, DifficultyManager.getNumberOfIslands(EDifficulty.NORMAL));
				gameArea.setNumberOfItems(3, DifficultyManager.getNumberOfLuckyDwarf(EDifficulty.NORMAL));
				gameArea.setNumberOfItems(4, DifficultyManager.getNumberOfMines(EDifficulty.NORMAL));
			}
			else if (difficultyNumber == 3) {
				
				// Generate Items
				gameArea.setNumberOfItems(1, DifficultyManager.getNumberOfDolphines(EDifficulty.HARD));
				gameArea.setNumberOfItems(2, DifficultyManager.getNumberOfIslands(EDifficulty.HARD));
				gameArea.setNumberOfItems(3, DifficultyManager.getNumberOfLuckyDwarf(EDifficulty.HARD));
				gameArea.setNumberOfItems(4, DifficultyManager.getNumberOfMines(EDifficulty.HARD));
			}
			else if (difficultyNumber == 4) {
				
				// Generate Items
				gameArea.setNumberOfItems(1, DifficultyManager.getNumberOfDolphines(EDifficulty.SUICIDAL));
				gameArea.setNumberOfItems(2, DifficultyManager.getNumberOfIslands(EDifficulty.SUICIDAL));
				gameArea.setNumberOfItems(3, DifficultyManager.getNumberOfLuckyDwarf(EDifficulty.SUICIDAL));
				gameArea.setNumberOfItems(4, DifficultyManager.getNumberOfMines(EDifficulty.SUICIDAL));
			}
			else { 
			logger.debug("No possible difficultyNumber has been recognized!");
			}
			
		}
		
public void setItemsOnAreaPC(int difficultyNumber, int playerNumber) {
			
			GameArea gameArea;
			
			// Je nachdem auf welche GameArea das gesetzt werden soll...
			if (playerNumber == 1) {
				gameArea = getGameAreaPlayerOne();
				
			}
			else {
				gameArea = getGameAreaPlayerTwo();
			}
			
			
			if (difficultyNumber == 1) {
				
			
				// Generate Items inclusive ships
				gameArea.setNumberOfItems(1, DifficultyManager.getNumberOfDolphines(EDifficulty.EASY));
				gameArea.setNumberOfItems(2, DifficultyManager.getNumberOfIslands(EDifficulty.EASY));
				gameArea.setNumberOfItems(3, DifficultyManager.getNumberOfLuckyDwarf(EDifficulty.EASY));
				gameArea.setNumberOfItems(4, DifficultyManager.getNumberOfMines(EDifficulty.EASY));
				gameArea.setNumberOfItems(5, DifficultyManager.getNumberOfOneFieldBoat(EDifficulty.EASY));
			}
			else if (difficultyNumber == 2) {
				
				// Generate Items inklusive ships
				gameArea.setNumberOfItems(1, DifficultyManager.getNumberOfDolphines(EDifficulty.NORMAL));
				gameArea.setNumberOfItems(2, DifficultyManager.getNumberOfIslands(EDifficulty.NORMAL));
				gameArea.setNumberOfItems(3, DifficultyManager.getNumberOfLuckyDwarf(EDifficulty.NORMAL));
				gameArea.setNumberOfItems(4, DifficultyManager.getNumberOfMines(EDifficulty.NORMAL));
				gameArea.setNumberOfItems(5, DifficultyManager.getNumberOfOneFieldBoat(EDifficulty.NORMAL));
			}
			else if (difficultyNumber == 3) {
				
				// Generate Items inclusive ships.
				gameArea.setNumberOfItems(1, DifficultyManager.getNumberOfDolphines(EDifficulty.HARD));
				gameArea.setNumberOfItems(2, DifficultyManager.getNumberOfIslands(EDifficulty.HARD));
				gameArea.setNumberOfItems(3, DifficultyManager.getNumberOfLuckyDwarf(EDifficulty.HARD));
				gameArea.setNumberOfItems(4, DifficultyManager.getNumberOfMines(EDifficulty.HARD));
				gameArea.setNumberOfItems(5, DifficultyManager.getNumberOfOneFieldBoat(EDifficulty.HARD));
			}
			else if (difficultyNumber == 4) {
				
				// Generate Items
				gameArea.setNumberOfItems(1, DifficultyManager.getNumberOfDolphines(EDifficulty.SUICIDAL));
				gameArea.setNumberOfItems(2, DifficultyManager.getNumberOfIslands(EDifficulty.SUICIDAL));
				gameArea.setNumberOfItems(3, DifficultyManager.getNumberOfLuckyDwarf(EDifficulty.SUICIDAL));
				gameArea.setNumberOfItems(4, DifficultyManager.getNumberOfMines(EDifficulty.SUICIDAL));
				gameArea.setNumberOfItems(5, DifficultyManager.getNumberOfOneFieldBoat(EDifficulty.SUICIDAL));
			}
			else { 
			logger.debug("No possible difficultyNumber has been recognized!");
			}
			
		}
		
		
		
		public int shootOnCoordinate(int playerNumber, Point p){
	
				GameArea gameArea;
						// First Player shoots on second Player
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
							}
							catch(Exception f) {
								f.getMessage();
							}
							return ID;
							
						}
						else {
							// Second Player shoots on first Player
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
							}
							catch(Exception f) {
								f.getMessage();
							}
							
							return ID;
						}
		}
		
		
		public Point generateRandomShoots() {
			Point p = new Point();
			int maxX = p.x;
			int maxY = p.y;
			
			int x = ArtificialIntelligence.randomCoordinateX(maxX);
			int y = ArtificialIntelligence.randomCoordinateY(maxY);
			
			Point shoot = new Point(x,y);
			
			return shoot;
			
		}
		
		
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
				}
				catch(AlreadyShotException f) {
					f.getMessage();
				}
				return ID;
				
		}
		
		public void endOfTheGame() {
			// Reaktion des Spiels, wenn ein Spieler alle Schiffe abgeschossen hat.
		}
		
		public void quitGame() {
			// Reaktion des Spiels, wenn das Spiel komplett beendet wird.
		}
		
		
		
}
	