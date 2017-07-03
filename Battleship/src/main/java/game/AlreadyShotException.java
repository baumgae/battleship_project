package game;

/**
 * Class for Throwing a AlreadyShotException.
 * 
 * <p>
 * This Exception will be thrown, if the Player tries to shoot on a Coordinate which already 
 * has been shot.
 * 
 * <p>
 * @author Celine Wichmann
 * @version 1.0
 */

public class AlreadyShotException extends Exception {
	
	/**
	 * Constructor for the AlreadyShotException
	 */
	AlreadyShotException()	{
		super("The Player has already shot at this Coordinate!");
		
	}
	
}


