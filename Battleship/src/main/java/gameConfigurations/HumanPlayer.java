package gameConfigurations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
* Subclass of Player HumanPlayer
* <p>
* 
* This is the subclass for a HumanPlayer
* <br>
* If a HumanPlayer will be created, a name has to be given through the
* constructor {@link #HumanPlayer} <br>
* 
* 
* <p>
* @author Lea Baumgärtner
* @version 1.0 
*/

public class HumanPlayer extends Player{
	
	int points;
	int hits;
	String name;
	
	private static final Logger logger = LogManager.getLogger(HumanPlayer.class);
	
	/**
	 * Constructor of HumanPlayer for setting the name
	 * @see game.Player#Player 
	 * 
	 * @param name
	 */
	HumanPlayer(String name) {
		super(name);
		logger.info("The constructor of HumanPlayer has been called!");
	}
	
	/**
	 * @see game.IPlayer#setName
	 */
	@Override
	public void setName(String name) {
		name = this.name;
		
	}

	/**
	 * @see game.IPlayer#getName
	 */
	@Override
	public String getName() {
		return name;
	}
	
}
