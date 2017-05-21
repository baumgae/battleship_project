package gameElement;

import java.awt.Point;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * 
 * Game Element Mine
 * <p>
 * This class is a subclass of Game Items.
 * It has the ID 4 as well as a special impact.
 * If the player hits a Mine on the shootingArea,
 * he or she will "die" and the game 
 * will be quit immediately. The other player will have won 
 * the game. 
 * But before we can implement this, the impact of the GameElement will
 * be MinusPoints.
 *
 * <p>
 * Island uses in his constructor {@link #Mine}
 * the constructor {@link #AGameItems} to set the ID.
 * Use {@link #mineImpact} to get the impact of the island.
 * 
 * <p> 
 *
 * @author Lea Baumgärtner
 * @version 0.1 
 */
public class Mine extends AGameItem {
	
	private static final Logger logger = LogManager.getLogger(Mine.class);
	
	@Override
	public boolean isHidden(boolean hide) {
		logger.info("The method Mine.isHidden has been called!");
		return hide;
	}

	@Override
	public int getScore() {
		logger.info("The method Mine.getScore has been called!");
		logger.info("The player gets -400 Points!");
		int minusPoints = -400;	
		return minusPoints;
	}

	@Override
	public boolean isDestroyed(boolean destroy) {
		logger.info("The method Mine.isDestroyed has been called!");
		return destroy;
	}
	
	@Override
	public int getID() {
		logger.info("The method Mine.getID has been called!");
		logger.info("ID = 4 should be returned!");
		return 4;
	}

	@Override
	public Point setPosition(Point p) {
		logger.info("The method Mine.setPosition has been called!");
		this.p = p;
		return p;
	}
	
	@Override
	public Point getPosition() {
		logger.info("The method Mine.getPosition has been called!");
		return p;
	}

	@Override
	public int getXPosition() {
		logger.info("The method Mine.getXPosition has been called!");
		return p.x;
	}

	@Override
	public int getYPosition() {
		logger.info("The method Mine.getYPosition has been called!");
		return p.y;
	}
	
	@Override
	public int getSize() {
		logger.info("The method Mine.getSize has been called!");
		return 1;
	}
	
}
