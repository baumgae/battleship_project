package gameConfigurations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Factory for creating a new Player
 * <p>
 * This is a Factory for creating new Players.
 * 
 * HumanPlayer - Player, which is making input through the GUI. ArtificialPlayer
 * - Player, Input through the class AI.
 * 
 * <p>
 * 
 * @author Lea Baumgärtner
 * @version 0.1
 */
public class PlayerFactory {

	public static final String PLAYER_TYPE_AI = "ai";
	public static final String PLAYER_TYPE_HUMAN = "human";
	private static final Logger logger = LogManager.getLogger(PlayerFactory.class);

	public static IPlayer getInstance(String type, String name) throws CreatePlayerException {
		if (type == null) {
			logger.error("No Player has been created and CreatePlayerException was thrown");
			throw new CreatePlayerException();

		} else if (type.equals(PLAYER_TYPE_HUMAN)) {

			logger.info("A new HumanPlayer has been created!");
			return new HumanPlayer(name);

		} else if (type.equals(PLAYER_TYPE_AI)) {
			logger.info("A new ComputerPlayer has been created!");
			return new ComputerPlayer("ComputerHans");

		} else {
			logger.error("No Player has been created and CreatePlayerException was thrown");
			throw new CreatePlayerException();

		}
	}

}
