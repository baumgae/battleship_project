package ships;

import java.awt.Point;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import gameElements.Water;

/**
 * Subclass of AShip called OneFieldBoat
 * <p>
 * This class is a subclass of AShip.
 * It has the ID '5'.
 *
 * <p>
 * OneFieldBoat uses in his constructor {@link #OneFieldBoat}
 * the constructor {@link #AShips} to set the ID as well as it's size.
 * 
 * <p> 
 *
 * @author Lea Baumgärtner
 * @version 0.2 
 */
public class OneFieldBoat extends AShip {
	
	private static final Logger logger = LogManager.getLogger(OneFieldBoat.class);

	boolean hide;
	boolean destroy;
	Point p;
	String name;
	
	
	// Doesn't work because of the super?
	public OneFieldBoat(String name) {
		this.name = name;
		hide = true;
		destroy = false;
	 }
	
	
	@Override
	public boolean isHidden(boolean hide) {
		logger.info("The method OneFieldBoat.isHidden has been called!");
		this.hide = hide;
		return hide;
	}

	@Override
	public int getScore() {
		logger.info("The method OneFieldBoat.getScore has been called!");
		logger.info("The player gets 100 points!");
		int plusPoints = 100;	
		return plusPoints;
	}

	@Override
	public boolean isDestroyed(boolean destroy) {
		logger.info("The method OneFieldBoat.isDestroyed has been called!");
		return destroy;
	}
	
	@Override
	public int getID() {
		logger.info("The method OneFieldBoat.getID has been called!");
		logger.info("ID = 5 should be returned!");
		return 5;
	}
	
	@Override
	public Point setPosition(Point p) {
		logger.info("The method OneFieldBoat.setPosition has been called!");
		this.p = p;
		return p;
	}
	
	@Override
	public Point getPosition() {
		logger.info("The method OneFieldBoat.getPosition has been called!");
		return p;
	}

	@Override
	public int getXPosition() {
		logger.info("The method OneFieldBoat.getXPosition has been called!");
		return p.x;
	}

	@Override
	public int getYPosition() {
		logger.info("The method OneFieldBoat.getYPosition has been called!");
		return p.y;
	}

	@Override
	public int getSize() {
		logger.info("The method OneFieldBoat.getSize has been called!");
		return 1;
	}
	
}
