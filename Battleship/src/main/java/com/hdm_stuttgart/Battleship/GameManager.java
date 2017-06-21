package com.hdm_stuttgart.Battleship;

import java.awt.Point;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import battleshipGUI.SetNameScreen;
import game.DifficultyManager;
import game.EDifficulty;
import game.GameArea;
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
	// TJ: Ihr könnt euch einfach zwei GameAreas machen: playerGameArea und enemyGameArea. Dann klappt das mit den zwei Playern.
	GameArea playerOneGameArea;
	GameArea playerTwoGameArea;
	
	IPlayer playerOne;
	IPlayer playerTwo;
	
	private static GameManager instance;
	
	public static GameManager getInstance(){
		if(instance == null){
			instance = new GameManager();
		}
		return instance;
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
	
		// Hier wird eine leere GameArea erstellt.
	
		// Darstellung der GameArea, jeder Point soll dann einen Button bekommen.
	
		// ANGST: Vielleicht gibts hier call by value / call by reference?
		// TJ: Die Angst braucht ihr hier nicht haben ;-)
	
		public void createGameArea(int difficultyNumber) {
			
			logger.info("The method createGameArea has been called!");
			
			GameManager.difficultyNumber = difficultyNumber;
			
			if (difficultyNumber == 1) {
				
				// GameArea nach außen geben.
				GameArea gameA = new GameArea(EDifficulty.EASY);
				
				playerOneGameArea = gameA;
				
				GameArea gameB = new GameArea(EDifficulty.EASY);
				playerTwoGameArea = gameB;
				
			}
			else if (difficultyNumber == 2) {
				// GameArea nach außen geben.
				GameArea gameA = new GameArea(EDifficulty.NORMAL);
				playerOneGameArea = gameA;
				
				GameArea gameB = new GameArea(EDifficulty.NORMAL);
				playerTwoGameArea = gameB;
				
			}
			else if (difficultyNumber == 3) {
				// GameArea nach außen geben.
				GameArea gameA = new GameArea(EDifficulty.HARD);
				playerOneGameArea = gameA;
				
				GameArea gameB = new GameArea(EDifficulty.HARD);
				playerTwoGameArea = gameB;
				
			}
			else if (difficultyNumber == 4) {
				// GameArea nach außen geben.
				GameArea gameA = new GameArea(EDifficulty.SUICIDAL);
				playerOneGameArea = gameA;
				
				GameArea gameB = new GameArea(EDifficulty.SUICIDAL);
				playerTwoGameArea = gameB;
				
			}
			else {
				logger.debug("No possible difficultyNumber has been recognized!");
				GameArea gameA = new GameArea(EDifficulty.EASY);
				playerOneGameArea = gameA;
				
				GameArea gameB = new GameArea(EDifficulty.EASY);
				playerTwoGameArea = gameB;
	
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
		public void setShipsOnArea(int playerNumber, int difficultyNumber){
			
			// hier wird die GameArea des jeweiligen Spielers geholt
			if (playerNumber == 1) {
				getGameAreaPlayerOne();
			}
			else {
				getGameAreaPlayerTwo();
			}
			
			
			if (difficultyNumber == 1) {
				// Schiffe setzen
				// Anzahl der Schiffe erhalten für den Diffculty Mode EASY
				
			}
			else if(difficultyNumber == 2) {
				// Schiffe setzen
				// Anzahl der Schiffe erhalten für den Diffculty Mode NORMAL
			}
			else if(difficultyNumber == 3) {
				// Schiffe setzen
				// Anzahl der Schiffe erhalten für den Diffculty Mode HARD
			}
			else if(difficultyNumber == 4) {
				// Schiffe setzen
				// Anzahl der Schiffe erhalten für den Diffculty Mode SUICIDAL
			}
			else {
				logger.debug("No possible difficultyNumber has been recognized!");
				// Schiffe setzen
				// Anzahl der Schiffe erhalten für den Diffculty Mode EASY
				
			}
		}
		
		// Nachdem GameArea geschaffen und Schiffe gesetzt wurden.
		// Nun werden die Items je nach Schwierigkeitsgrad draufgesetzt.
		public void setItemsOnArea(int difficultyNumber, GameArea playerArea) {
			
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
		
		public void shootOnCoordinate(int playerNumber, Point p){
			int i = 0;
			
			// while-Schleife für das abwechselnde Spielen
			// jeder darf nur ein mal schießen.
			
			while (i <= 1){ 
				GameArea gameArea;
			// Je nachdem auf welche GameArea das gesetzt werden soll...
						if (playerNumber == 1) {
							
							gameArea = getGameAreaPlayerTwo();
							// shootOnCoordinate Methode
							// Felds ID wird verändert.
							// Durch veränderte ID anderes Bild!
							
							// getStatusCoordinate --> damit der Punktestand geändert wird.!
							// Punktestand wird verändert!
							
						}
						else {
							
							gameArea = getGameAreaPlayerOne();
							// shootOnCoordinate Methode
							// Felds ID wird verändert.
							// Durch veränderte ID anderes Bild!
						}
			}
			// Diese Methode wird in der GUI im EventHandler aufgerufen, um
						// Die Auswirkungen des Elements darunter zu bewirken.
						// Also dann mit getImpactDolphine oder sowas...
						// Und dann werden eben die Punkte und die Hits auf dem Player
						// gespeichert.
			// TJ: Ich würde hier noch zwei Parameter (x/y) einfügen. Der Angriff geht dann auf die GameArea des Gegners (enemyGameArea).
		}
		
		public void endOfTheGame() {
			// Reaktion des Spiels, wenn ein Spieler alle Schiffe abgeschossen hat.
		}
		
		public void quitGame() {
			// Reaktion des Spiels, wenn das Spiel komplett beendet wird.
		}
		
		
		
}
	/*
	 * 
	 * 
	 * SetShipsOnField Method --> Name, score and hits of Player will be set, 
	 * ships will be set, after the window will be closed, randomGameElements will
	 * be set.
	 * 
	 * Same Procedure for Multiplayer, second Player or AI (later then)
	 * 
	 * StartGame Method
	 * Game Area of player and Enemy will be on GUI, 
	 * Enemy with hidden stuff
	 * Always if one player shoots, change LayerStatus
	 * Switch Windows for every Player.
	 * 
	 * ONLY IF THERE IS THIME ******
	 * MenuMethod
	 * If Menu will be called, switch to this window,
	 * if special buttons will be pushed, quit or something.
	 * ********
	 * 
	 * EndGame
	 * The first Player, who shot on all ships, wins the game.
	 * Game Ends, Conclusion of all points and hits will be shown.
	 * For every Player a screen of YouLoose or YouWin will be shown.
	 * 
	 * quitGame Method
	 * --> Whole game will be ended.
	 * 
	 * 
	 */

