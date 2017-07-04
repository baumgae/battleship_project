package gameConfigurations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * 
 * Subclass of Player called ComputerPlayer
 * <p>
 * This is the subclass for a ComputerPlayer <br>
 * If a ComputerPlayer will be created, a name has to be given through the <br>
 * constructor {@link #ComputerPlayer}
 * 
 * <p>
 * 
 * @author Lea Baumgärtner
 * @version 1.0
 */
public class ComputerPlayer extends Player {

	private static final Logger logger = LogManager.getLogger(ComputerPlayer.class);

	/**
	 * Constructor of ComputerPlayer for setting the name
	 * 
	 * @see game.Player#Player
	 * 
	 * @param name
	 */
	ComputerPlayer(String name) {
		super(name);
		logger.info("The constructor ComputerPlayer has been called!");

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
