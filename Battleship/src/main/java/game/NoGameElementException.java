package game;

/**
 * Class for Throwing a NoGameElementException.
 * 
 * <p>
 * This Exception will be thrown, if the Player won't shot on a Game Element
 * or on Water or on a Ship.
 * 
 * <p>
 * @author Celine Wichmann
 * @version 1.0
 */

public class NoGameElementException extends Exception {
	
	/**
	 * Constructor of NoGameElementException
	 */
	 @Override
     public String toString() {
     return "There has not been shoot one of the existing Game Items!";
}
	
}
