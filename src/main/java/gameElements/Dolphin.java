package gameElements;

import java.awt.Point;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Game Element Dolphin
 * 
 * <p>
 * This class is a subclass of Game Items. It has the ID 1 as well as a special
 * impact. If the player hits a dolphin on the shootingArea, he or she will get
 * -100 points.
 *
 * <p>
 * Through the constructor {@link #Dolphin} the name of a Dolphin can be set.
 * <br>
 * 
 * Through the method {@link #isHidden(boolean)} you can set the visibility of
 * the Dolphin.<br>
 * 
 * The method {@link #getScore()} returns the points a player receives, if a
 * player shoots on a Dolphin. <br>
 * 
 * {@link #isDestroyed()} sets the destruction of a Dolphin. <br>
 * 
 * {@link #getID()} returns the ID of the Dolphin. <br>
 * 
 * {@link #setPosition()} sets the position of a Dolphin. <br>
 * 
 * {@link #getPosition()} returns the position of a Dolphin. <br>
 * 
 * {@link #getXPosition()} returns the X-coordinate of the position of the
 * Dolphin. <br>
 * 
 * {@link #getYPosition()} returns the Y-coordinate of the position of the
 * Dolphin. <br>
 * 
 * {@link #getSize()} returns the size of the Dolphin. <br>
 * 
 * <p>
 *
 * @author Lea Baumgärtner
 * @version 1.0
 */

public class Dolphin extends AGameItem {

	private static final Logger logger = LogManager.getLogger(Dolphin.class);

	boolean hide;
	boolean destroy = false;
	Point p;
	String name;

	/**
	 * Set name of a Dolphin
	 * 
	 * @param name
	 */
	public Dolphin(String name) {
		this.name = name;
		hide = true;
		destroy = false;
	}

	/**
	 * Set the visibility of a Dolphin
	 * 
	 * @param hide
	 * 
	 * @return hide
	 */
	@Override
	public boolean isHidden(boolean hide) {
		logger.info("The method Dolphine.isHidden has been called!");
		hide = this.hide;
		return hide;
	}

	/**
	 * Return the minusPoints of a Dolphin if it is shot.
	 * 
	 * @return minusPoints
	 */
	@Override
	public int getScore() {
		logger.info("The method Dolphine.getScore has been called!");
		logger.info("The Player gets -100 points!");
		int minusPoints = -100;
		return minusPoints;
	}

	/**
	 * Gets the status of destroyed
	 * 
	 * @param destroy
	 * @return destroy
	 */
	@Override
	public void destroy(boolean b) {
		this.destroy = b;
	}

	/**
	 * Sets the destruction of a Dolphin
	 * 
	 * @param destroy
	 * @return destroy
	 * 
	 */
	@Override
	public boolean isDestroyed() {
		logger.info("The method Dolphine.isDestroyed has been called!");
		return destroy;
	}

	/**
	 * Returns ID of the Dolphin
	 * 
	 * @return 1
	 */
	@Override
	public int getID() {
		logger.info("The method Dolphine.getID has been called!");
		logger.info("ID = 1 should be returned!");
		return 1;
	}

	/**
	 * Sets the position of a Dolphin
	 * 
	 * @param p
	 */
	@Override
	public void setPosition(Point p) {
		logger.info("The method Dolphine.setPosition has been called!");
		this.p = p;
	}

	/**
	 * Returns the position of a Dolphin
	 * 
	 * @return p
	 */
	@Override
	public Point getPosition() {
		logger.info("The method Dolphine.getPosition has been called!");
		return p;
	}

	/**
	 * Returns X-coordinate of the position of a Dolphin
	 * 
	 * @return p.x
	 */
	@Override
	public int getXPosition() {
		logger.info("The method Dolphine.getXPosition has been called!");
		return p.x;
	}

	/**
	 * Returns Y-coordinate of the position of a Dolphin
	 * 
	 * @return p.y
	 */
	@Override
	public int getYPosition() {
		logger.info("The method Dolphine.getYPosition has been called!");
		return p.y;
	}

	/**
	 * Returns size of a Dolphin
	 * 
	 * @return 1
	 */
	@Override
	public int getSize() {
		logger.info("The method Dolphine.getSize has been called!");
		logger.info("Size = 1 should be returned!");
		return 1;
	}

}
