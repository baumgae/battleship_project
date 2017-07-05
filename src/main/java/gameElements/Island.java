package gameElements;

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
 * Through the constructor {@link #Island} the name of a Island can be set. <br>
 * 
 * Through the method {@link #isHidden(boolean)} you can set the visibility of
 * the Island.<br>
 * 
 * The method {@link #getScore()} returns the points a player receives, if a
 * player shoots on a Island. <br>
 * 
 * {@link #isDestroyed()} returns the destruction of an Island. <br>
 * 
 * {@link #destroy(boolean)} sets the destruction of an Island. <br>
 * 
 * {@link #getID()} returns the ID of the Island. <br>
 * 
 * {@link #setPosition()} sets the position of a Island. <br>
 * 
 * {@link #getPosition()} returns the position of a Island. <br>
 * 
 * {@link #getXPosition()} returns the X-coordinate of the position of the
 * Island. <br>
 * 
 * {@link #getYPosition()} returns the Y-coordinate of the position of the
 * Island. <br>
 * 
 * {@link #getSize()} returns the size of the Island. <br>
 * 
 * <p>
 *
 * @author Lea Baumgärtner
 * @version 1.0
 */
public class Island extends AGameItem {

	private static final Logger logger = LogManager.getLogger(Island.class);

	boolean hide;
	boolean destroy = false;
	Point p;
	String name;

	/**
	 * Set name of a Island
	 * 
	 * @param name
	 */
	public Island(String name) {
		this.name = name;
		hide = true;
		destroy = false;
	}

	/**
	 * Set the visibility of a Island
	 * 
	 * @param hide
	 * 
	 * @return hide
	 */
	@Override
	public boolean isHidden(boolean hide) {
		logger.info("The method Island.isHidden has been called!");
		return hide;
	}

	/**
	 * Return the minusPoints of a Island if it is shot.
	 * 
	 * @return minusPoints
	 */
	@Override
	public int getScore() {
		logger.info("The method Island.getScore has been called!");
		logger.info("The Player gets -200 points!");
		int minusPoints = -200;
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
	 * Sets the destruction of a Island
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
	 * Returns ID of the Island
	 * 
	 * @return 2
	 */
	@Override
	public int getID() {
		logger.info("The method Island.getID has been called!");
		logger.info("ID = 2 should be returned!");
		return 2;
	}

	/**
	 * Sets the position of a Island
	 * 
	 * @param p
	 */
	@Override
	public void setPosition(Point p) {
		logger.info("The method Island.setPosition has been called!");
		this.p = p;

	}

	/**
	 * Returns the position of a Island
	 * 
	 * @return p
	 */
	@Override
	public Point getPosition() {
		logger.info("The method Island.getPosition has been called!");
		return p;
	}

	/**
	 * Returns X-coordinate of the position of a Island
	 * 
	 * @return p.x
	 */
	@Override
	public int getXPosition() {
		logger.info("The method Island.getXPosition has been called!");
		return p.x;
	}

	/**
	 * Returns Y-coordinate of the position of a Island
	 * 
	 * @return p.y
	 */
	@Override
	public int getYPosition() {
		logger.info("The method Island.getYPosition has been called!");
		return p.y;
	}

	/**
	 * Returns size of a Island
	 * 
	 * @return 1
	 */
	@Override
	public int getSize() {
		logger.info("The method Island.getSize has been called!");
		logger.info("Size = 1 should be returned!");
		return 1;
	}
}
