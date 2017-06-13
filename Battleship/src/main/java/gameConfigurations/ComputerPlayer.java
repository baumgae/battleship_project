package gameConfigurations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * THIS CLASS ISN'T ACTIVE YET
 * 
* Subclass of Player called ComputerPlayer
* <p>
* This is the subclass for a ComputerPlayer
* <br>
* If a ComputerPlayer will be created, a name has to be given through the <br>
* constructor {@Link ComputerPlayer}
* 
* <p>
* @author Lea Baumgärtner
* @version 0.1 
*/
public class ComputerPlayer extends Player{
	
	private static final Logger logger = LogManager.getLogger(ComputerPlayer.class);
	
	ComputerPlayer(String name) {
		super(name);
		logger.info("The constructor ComputerPlayer has been called!");
		
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
