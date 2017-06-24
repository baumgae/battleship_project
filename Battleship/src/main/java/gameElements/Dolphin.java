package gameElements;

import java.awt.Point;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Game Element Dolphin
 * <p>
 * This class is a subclass of Game Items. It has the ID 1 as well as a special
 * impact. If the player hits a dolphin on the shootingArea, he or she will get
 * -100 points.
 *
 * <p>
 * Dolphin uses in his constructor {@link #Dolphin} the constructor
 * {@link #AGameItems} to set the ID. Use {@link #dolphinImpact} to get the
 * impact of the dolphin.
 * 
 * <p>
 *
 * @author Lea Baumgärtner
 * @version 0.2
 */

public class Dolphin extends AGameItem {

	private static final Logger logger = LogManager.getLogger(Dolphin.class);
	
	boolean hide;
	boolean destroy;
	Point p;
	String name;
	
	public Dolphin(String name) {
		this.name = name;
		hide = true;
		destroy = false;
	}
	
	@Override
	public boolean isHidden(boolean hide) {
		logger.info("The method Dolphine.isHidden has been called!");
		hide = this.hide;
		return hide;
	}

	@Override
	public int getScore() {
		logger.info("The method Dolphine.getScore has been called!");
		logger.info("The Player gets -100 points!");
		int minusPoints = -100;
		return minusPoints;
	}

	@Override
	public boolean isDestroyed(boolean destroy) {
		logger.info("The method Dolphine.isDestroyed has been called!");
		destroy = this.destroy;
		return destroy;
	}

	@Override
	public int getID() {
		logger.info("The method Dolphine.getID has been called!");
		logger.info("ID = 1 should be returned!");
		return 1;
	}

	@Override
	public Point setPosition(Point p) {
		logger.info("The method Dolphine.setPosition has been called!");
		this.p = p;
		return p;
	}

	@Override
	public Point getPosition() {
		logger.info("The method Dolphine.getPosition has been called!");
		return p;
	}

	@Override
	public int getXPosition() {
		logger.info("The method Dolphine.getXPosition has been called!");
		return p.x;
	}

	@Override
	public int getYPosition() {
		logger.info("The method Dolphine.getYPosition has been called!");
		return p.y;
	}

	@Override
	public int getSize() {
		logger.info("The method Dolphine.getSize has been called!");
		logger.info("Size = 1 should be returned!");
		return 1;
	}

}
