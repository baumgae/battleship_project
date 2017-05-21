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
	
	private static final Logger logger = LogManager.getLogger(HumanPlayer.class);
	
	HumanPlayer(String name) {
		super(name);
	}

	@Override
	public void countPoints(int points) {
		logger.info("The method HumanPlayer.countPoints has been called!");
		points = this.points + points;
		
	}

	@Override
	public int getCountedPoints() {
		logger.info("The method HumanPlayer.getCountedPoints has been called!");
		return points;
	}

	@Override
	public void countHits(int hits) {
		logger.info("The method HumanPlayer.countHits has been called!");
		hits = this.hits + hits;
		
	}

	@Override
	public int getCountedHits() {
		logger.info("The method HumanPlayer.getCountedHits has been called!");
		return hits;
	}
	
}
