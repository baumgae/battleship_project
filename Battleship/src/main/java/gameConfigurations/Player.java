package gameConfigurations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Abstract Class for Player
 * <p>
 * This is the abstract class for Players.
 * If a new Game Area will be created, 
 * two Players per Game will be created too. <br>
 * This class is only a information storer.
 * This should be somehow the layer between Logic and UI.
 * 
 * <p>
 * Subclasses use constructor {@link #Player} to set name, points and hits.<br>
 * Use {@link #countPoints} to count on the Points, when something is shot on the GameArea.<br>
 * Use {@link #getCountedPoints} to get the counted points of a player.<br>
 * Use {@link #countHits} to count on the hits, when the player shots.<br>
 * Use {@link #getCountedHits} to get the counted hits of a player.
 * 
 * <p> 
 *
 * @author Lea Baumgärtner
 * @version 1.0 
 */


abstract class Player implements IPlayer {
		
	String name;
	int hits;
	int points;
	
	private static final Logger logger = LogManager.getLogger(Player.class);
	
	/**
	 * Constructor for setting the name of the player
	 * 
	 * @param name
	 */
	Player(String name) {
		this.name = name;
		
	}
	
	/** 
	 * @see game.IPlayer#countPoints()
	 */
	@Override
	public void countPoints(int points) {
		logger.info("The method Player.countPoints has been called!");
		points = this.points + points;
		
	}
	
	/**
	 * @see game.IPlayer#getCountPoints()
	 */
	@Override
	public int getCountedPoints() {
		logger.info("The method ComputerPlayer.getCountedPoints has been called!");
		return points;
	}
	
	/**
	 * @see game.IPlayer#countHits()
	 */
	@Override
	public void countHits(int hits) {
		logger.info("The method Player.countHits has been called!");
		hits = this.hits + hits;
		
	}
	
	/**
	 * @see game.IPlayer#countPoints()
	 */
	@Override
	public int getCountedHits() {
		logger.info("The method Player.getCountedHits has been called!");
		return hits;
	}

		
}
