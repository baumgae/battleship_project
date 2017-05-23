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
 * @version 0.2
 */

public class AlreadyShotException extends Exception {

	AlreadyShotException()	{
		super("The Player has already shot at this Coordinate!");
		
	}
	
}


