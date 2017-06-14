package com.hdm_stuttgart.Battleship;

import java.awt.Point;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import battleshipGUI.SetNameScreen;
import game.DifficultyManager;
import game.EDifficulty;
import game.GameArea;
import gameConfigurations.CreatePlayerException;
import gameConfigurations.IPlayer;
import gameConfigurations.Item;
import gameConfigurations.PlayerFactory;

/**
* GameManager
* <p>
* The GameMananger which manages between the Input of the players
* through the Graphical User Interface and the Classes underneath.
* <br>
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
	GameArea gameArea;
	
	IPlayer playerOne;
	IPlayer playerTwo;
	
	
	
	
	public void selectPlayer(int playerNumber) throws CreatePlayerException {
		logger.info("Method selectPlayer has been called!");
		
		GameManager.playerNumber = playerNumber;
		
		
		
		if (playerNumber == 1) {
			// Peter ist hier erstmal der Platzhalter,
			// Wie organisiere ich es, dass hier das eingespeichert wird, 
			// was der Typ eingibt?
			
			// Muss noch zuweißen und später zugreifen können.
			// Wer speichert die Spieler? 
			// Game Manager oder Player?
			IPlayer playerOne = PlayerFactory.getInstance(PlayerFactory.PLAYER_TYPE_HUMAN, SetNameScreen.name);
			
			IPlayer playerTwo = PlayerFactory.getInstance(PlayerFactory.PLAYER_TYPE_AI, "ComputerHans");
			
			this.playerOne = playerOne;
			this.playerTwo = playerTwo;
		}
		
		else if (playerNumber == 2) {
			
			// Peter ist hier erstmal der Platzhalter,
			// Wie organisiere ich es, dass hier das eingespeichert wird, 
			// was der Typ eingibt?
			IPlayer playerOne = PlayerFactory.getInstance("human", SetNameScreen.nameOne);
			IPlayer playerTwo = PlayerFactory.getInstance("human", SetNameScreen.nameTwo);
			
			this.playerOne = playerOne;
			this.playerTwo = playerTwo;
		}
	}
	
	
	
	
	
		// Um die GameArea zu erschaffen benötigt man die größe des Feldes
		// Da durch das Erstellen einer GameArea bereits durch den Aufruf
		// des Konstruktors die Schwierigkeit eingestellt wird, soll diese hier 
		// hier übergeben werden und dementsprechend gleich das Feld erzeugt 
		// und die Anzahl an Items und ihre "Erschaffer-Methode" aufgerufen werden.
		public void createGameArea(int difficultyNumber) {
			
			logger.info("The method getDifficulty has been called!");
			
			GameManager.difficultyNumber = difficultyNumber;
			
			if (difficultyNumber == 1) {
				
				// GameArea nach außen geben.
				GameArea gameA = new GameArea(EDifficulty.EASY);
				gameA = this.gameArea;
				
				// Das erstellen der Items in eine Methode mit
				// setItems auslagern:
				
				// Und das dann für jeden Schwierigkeitsgrad!
				
				
				// Konflikt, numberOfItems gibt 
				// Dadurch dass die Methode getNumberOfItems nichts zurück gibt, 
				// Kann diese deklaration nicht stattfinden.
				
				// String[] Dolphine = gameA.getNumberOfItems(1, DifficultyManager.getNumberOfDolphines(EDifficulty.EASY));
				gameA.getNumberOfItems(2, DifficultyManager.getNumberOfIslands(EDifficulty.EASY));
				gameA.getNumberOfItems(3, DifficultyManager.getNumberOfLuckyDwarf(EDifficulty.EASY));
				gameA.getNumberOfItems(4, DifficultyManager.getNumberOfMines(EDifficulty.EASY));
			}
			else if (difficultyNumber == 2) {
				// return DifficultyManager.getFieldSize(EDifficulty.NORMAL);
			}
			else if (difficultyNumber == 3) {
				// return DifficultyManager.getFieldSize(EDifficulty.HARD);
			}
			else if (difficultyNumber == 4) {
				// return DifficultyManager.getFieldSize(EDifficulty.SUICIDAL);
			}
			logger.debug("No possible difficultyNumber has been recognized!");
			// return DifficultyManager.getFieldSize(EDifficulty.EASY);
			
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

