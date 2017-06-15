package gameElement;

import java.awt.Point;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Game Element Water
 * 
 * <p>
 * This class is a subclass of Game Items.
 * It has the ID 0 and it has no impact at all,
 * if the player hits water on the shootingArea.
 *
 * <p>
 * Water uses in his constructor {@link #Water}
 * the constructor {@link #AGameItems} to set the ID.
 * Use {@link #waterImpact} to get the impact of the water.
 * 
 * <p> 
 *
 * @author Lea Baumgärtner
 * @version 0.2 
 */

public class Water extends AGameItem{
	
	private static final Logger logger = LogManager.getLogger(Water.class);
	
	boolean hide;
	boolean destroy;
	Point p;
	String name;
	
	public Water(String name) {
		this.name = name;
		hide = true;
		destroy = false;
	}
	
	@Override
	public boolean isHidden(boolean hide) {
		logger.info("The method Water.isHidden has been called!");
		return hide;
	}

	@Override
	public int getScore() {
		logger.info("The method Water.getScore has been called!");
		logger.info("The player gets 0 points.");
		int noPoints = 0;	
		return noPoints;
	}

	@Override
	public boolean isDestroyed(boolean destroy) {
		logger.info("The method Water.isDestroyed has been called!");
		return destroy;
	}
	
	@Override
	public int getID() {
		logger.info("The method Water.getID has been called!");
		logger.info("ID = 0 should be returned!");
		return 0;
	}
	
	@Override
	public Point setPosition(Point p) {
		logger.info("The method Water.setPosition has been called!");
		this.p = p;
		return p;
	}
	
	@Override
	public Point getPosition() {
		logger.info("The method Water.getPosition has been called!");
		return p;
	}

	@Override
	public int getXPosition() {
		logger.info("The method Water.getXPosition has been called!");
		return p.x;
	}

	@Override
	public int getYPosition() {
		logger.info("The method Water.getYPosition has been called!");
		return p.y;
	}
	
	@Override
	public int getSize() {
		logger.info("The method Water.getSize has been called!");
		return 1;
	}
	
}

