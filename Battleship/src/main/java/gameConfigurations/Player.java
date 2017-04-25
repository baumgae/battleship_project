package gameConfigurations;

import game.EGameArea;

/**
 * Abstract Class for Player
 * <p>
 * This is the abstract class for Players.
 * If a new Game Area will be created, 
 * two Players per Game will be created too. <br>
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
 * @version 0.2 
 */
public abstract class Player {
		
	String name;
	int hits;
	int points;
	EGameArea gameArea;
	
	// If I have a factory - do we need this actually?
	Player(String name, int hits, int points) {
		this.name = name;
		this.hits = hits;
		this.points = points;
		
	}
	// Factory?
	/*
	public static Player createPlayer(){
		Player player = new Player(name, 0, 0);
		return player;
	}
	*/
	
	
	/* (non-Javadoc)
	 * @see game.IPlayer#countPoints()
	 */
	public void countPoints() {
		points+= 10;
		
		// Actually over here it depends, which kind of GameElement the player hits.
		// So if I determine the points of every GameElemnt in themselves, does it work?
	}
	
	/* (non-Javadoc)
	 * @see game.IPlayer#cgetCountPoints()
	 */
	public int getCountedPoints (int points) {
		this.points = points;
		return points;
	}
	
	/* (non-Javadoc)
	 * @see game.IPlayer#countHits()
	 */
	public void countHits() {
		hits+= 1;
	}
	
	/* (non-Javadoc)
	 * @see game.IPlayer#countPoints()
	 */
	public int getCountedHits(int hits) {
		this.hits = hits;
		return hits;
	}
		
}
