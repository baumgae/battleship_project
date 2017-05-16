package gameConfigurations;



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
 * @version 0.2 
 */


/*
 * TJ
 * In my opinion, you can store players' score in the Player class. You don't have to 
 * introduce an extra class. You don't have to save the score permanently as this is 
 * not required for this project. Just focus on the criteria provided in our excel sheet.
 */
abstract class Player implements IPlayer {
		
	String name;
	int hits;
	int points;
	
	Player(String name) {
		this.name = name;
		
	}
	
	/* (non-Javadoc)
	 * @see game.IPlayer#countPoints()
	 */
	public void countPoints() {
		points+= 10;
		// Parameter rein, wo die Punkte übergeben werden.
		// Dynamisch machen indem Punkte übergeben werden
		
		// Actually over here it depends, which kind of GameElement the player hits.
		// So if I determine the points of every GameElemnt in themselves, does it work?
	}
	
	/* (non-Javadoc)
	 * @see game.IPlayer#getCountPoints()
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
