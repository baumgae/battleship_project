package gameConfigurations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import gameElement.Dolphin;

/**
* Subclass of Player called HumanPlayer
* <p>
* This is the subclass for a HumanPlayer
* <br>
* If a HumanPlayer will be created, a name has to be given through the <br>
* constructor {@Link HumanPlayer}
* 
* <p>
* @author Lea Baumgärtner
* @version 0.2 
*/

public class HumanPlayer extends Player{
	
	int points;
	int hits;
	String name;
	
	private static final Logger logger = LogManager.getLogger(HumanPlayer.class);
	
	HumanPlayer(String name) {
		super(name);
		logger.info("The constructor of HumanPlayer has been called!");
	}

	@Override
	public void setName(String name) {
		name = this.name;
		
	}

	@Override
	public String getName() {
		return name;
	}
	
}
