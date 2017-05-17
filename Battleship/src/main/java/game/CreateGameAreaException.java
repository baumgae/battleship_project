package game;

/**
 * Class for Throwing a CreateGameAreaException.
 * 
 * <p>
 * This Exception will be thrown, if there has not been created a Game Area.
 * 
 * <p>
 * @author Celine Wichmann
 * @version 0.2
 */

public class CreateGameAreaException extends Exception{
	
	CreateGameAreaException()	{
		super("There has not been created a Game Area!");
		
	}

}
