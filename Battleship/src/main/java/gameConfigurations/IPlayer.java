package gameConfigurations;

/**
 * Interface IPlayer for the player
 * <p>
 * This is the Interface for Players. If a new Game Area will be created, two
 * Players per Game will be created too. <br>
 * 
 * <p>
 * 
 * Use {@link #countPoints} to count on the Points, when something is shot on
 * the GameArea.<br>
 * Use {@link #getCountedPoints} to get the counted points of a player.<br>
 * Use {@link #countHits} to count on the hits, when the player shots.<br>
 * Use {@link #getCountedHits} to get the counted hits of a player.
 * 
 * <p>
 *
 * @author Lea Baumgärtner
 * @version 1.0
 */

public interface IPlayer {

	/**
	 * Setting the name of a player
	 * 
	 * @param name
	 */
	public void setName(String name);

	/**
	 * @return the name of a player
	 */
	public String getName();

	/**
	 * Counting points of a player
	 * 
	 * @param points
	 */
	public void countPoints(int points);

	/**
	 * @return counted points of a player
	 */
	public int getCountedPoints();

	/**
	 * Count hits of a player
	 * 
	 * @param hits
	 */
	public void countHits(int hits);

	/**
	 * @return counted hits of a player
	 */
	public int getCountedHits();

}
