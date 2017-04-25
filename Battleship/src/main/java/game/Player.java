package game;
/**
 * Class for Player
 * <p>
 * This is the class for the Game Items.
 * It sets the size of every Element on 1, which means
 * that every Game Item is one field big.
 * Due to the constructor the Children have to set an ID.
 * And there are methods for getting the size and the ID.
 
 * <p>
 * Subclasses use constructor {@link #AGameItems} to set the ID
 * Use {@link #getSize} to get the size of a game item
 * Use {@link #getGameElementID} to get the ID of a game item
 * 
 * <p> 
 *
 * @author Lea Baumgärtner
 * @version 0.2 
 */
public abstract class Player {
		
	String name;
	int counthits;
	int points;
	EGameArea gameArea;
	
	
	Player(String name) {
		this.name = name;
	}

	
	public static void countPoints() {
		
	}
	
	public int getCountedPoints (int points) {
		return points;
	}
		
}
