package gameConfigurations;
/**
* Exception CreatePlayerException
* <p>
* This is an Exception for the PlayerFactory
* <br>
* If a Player will be created, and the necessary parameters won't be 
* given, this Exception will be thrown.
* 
* <p>
* @author Lea Baumgärtner
* @version 0.2 
*/

public class CreatePlayerException extends RuntimeException {

		// Constructor 
	CreatePlayerException()	{
		super("There has not been choosen one of the existing Player Types!");
	}
	      
}


