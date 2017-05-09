package gameConfigurations;
/**
 * Class for scores
 * <p>
 * This is the class for the scores in general.
 * It should save persistent data in relation to the players 
 * like name, points, and hits.<br>
 * For showing the highest scores, it should be sorted by points.
 * 
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
public class Score {
		
		// Questions - 
		// Do you think, the methods of player
		// like countPoints and hits and Stuff should be
		// here?
	
	
		// Should we create the file with a real database 
		// with SQL or should we only create a file?
	
	/*
	 * TJ
	 * In my opinion, you can store players' score in the Player class. You don't have to 
	 * introduce an extra class. You don't have to save the score permanently as this is 
	 * not required for this project. Just focus on the criteria provided in our excel sheet.
	 */
}
