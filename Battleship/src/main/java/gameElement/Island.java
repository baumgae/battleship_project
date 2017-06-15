package gameElement;

import java.awt.Point;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * 
 * Game Element Island
 * <p>
 * This class is a subclass of Game Items. It has the ID 2 as well as a special
 * impact. If the player hits a island on the shootingArea, he or she will be
 * able to shoot on four fields three time, one time every round.
 *
 * <p>
 * Island uses in his constructor {@link #Island} the constructor
 * {@link #AGameItems} to set the ID. Use {@link #islandImpact} to get the
 * impact of the island.
 * 
 * <p>
 *
 * @author Lea Baumgärtner
 * @version 0.2
 */
public class Island extends AGameItem {

	private static final Logger logger = LogManager.getLogger(Island.class);
	
	boolean hide;
	boolean destroy;
	Point p;
	String name;
	
	public Island(String name) {
		this.name = name;
		hide = true;
		destroy = false;
	}
	
	@Override
	public boolean isHidden(boolean hide) {
		logger.info("The method Island.isHidden has been called!");
		return hide;
	}

	@Override
	public int getScore() {
		logger.info("The method Island.getScore has been called!");
		logger.info("The Player gets -200 points!");
		int minusPoints = -200;
		return minusPoints;
	}

	@Override
	public boolean isDestroyed(boolean destroy) {
		logger.info("The method Island.isDestroyed has been called!");
		return destroy;
	}

	@Override
	public int getID() {
		logger.info("The method Island.getID has been called!");
		logger.info("ID = 2 should be returned!");
		return 2;
	}

	@Override
	public Point setPosition(Point p) {
		logger.info("The method Island.setPosition has been called!");
		this.p = p;
		return p;
	}

	@Override
	public Point getPosition() {
		logger.info("The method Island.getPosition has been called!");
		return p;
	}

	@Override
	public int getXPosition() {
		logger.info("The method Island.getXPosition has been called!");
		return p.x;
	}

	@Override
	public int getYPosition() {
		logger.info("The method Island.getYPosition has been called!");
		return p.y;
	}

	@Override
	public int getSize() {
		logger.info("The method Island.getSize has been called!");
		logger.info("Size = 1 should be returned!");
		return 1;
	}
}
