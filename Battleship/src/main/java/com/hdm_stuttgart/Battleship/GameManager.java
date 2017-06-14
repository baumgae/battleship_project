package com.hdm_stuttgart.Battleship;

import game.EDifficulty;
import gameConfigurations.CreatePlayerException;
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
	
	
	private EDifficulty gameDifficulty;
	public static int playerNumber;
	
	
	public static String playerOne;
	public static String playerTwo;
	
	
	public static void selectPlayer(int playerNumber) throws CreatePlayerException {
		
		String name = null;
		
		GameManager.playerNumber = playerNumber;
		
		if (playerNumber == 1) {
			// Peter ist hier erstmal der Platzhalter,
			// Wie organisiere ich es, dass hier das eingespeichert wird, 
			// was der Typ eingibt?
			
			// Muss noch zuweißen und später zugreifen können.
			// Wer speichert die Spieler? 
			// Game Manager oder Player?
			PlayerFactory.getInstance(PlayerFactory.PLAYER_TYPE_HUMAN, name);
			
			PlayerFactory.getInstance(PlayerFactory.PLAYER_TYPE_AI, "ComputerHans");
		}
		
		else if (playerNumber == 2) {
			
			// Peter ist hier erstmal der Platzhalter,
			// Wie organisiere ich es, dass hier das eingespeichert wird, 
			// was der Typ eingibt?
			PlayerFactory.getInstance("human", "Peter"/*this.name*/);
			PlayerFactory.getInstance("human", "Wilhelm");
			
		}
	}
	
		
		void getDifficulty(EDifficulty difficulty) {
			
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
	
	
	
	
}
