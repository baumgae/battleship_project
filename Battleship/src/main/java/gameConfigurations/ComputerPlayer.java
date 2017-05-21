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
		
	}

	@Override
	public void countPoints(int points) {
		logger.info("The method ComputerPlayer.countPoints has been called!");
		points = this.points + points;
		
	}

	@Override
	public int getCountedPoints() {
		logger.info("The method ComputerPlayer.getCountedPoints has been called!");
		return points;
	}

	@Override
	public void countHits(int hits) {
		logger.info("The method ComputerPlayer.countHits has been called!");
		hits = this.hits + hits;
		
	}

	@Override
	public int getCountedHits() {
		logger.info("The method ComputerPlayer.getCountedHits has been called!");
		return hits;
	}
	
}
