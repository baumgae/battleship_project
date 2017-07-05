package gameElements;

import java.awt.Point;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Game Element Water
 * 
 * <p>
 * This class is a subclass of Game Items. It has the ID 0 and it has no impact
 * at all, if the player hits water on the shootingArea.
 *
 * <p>
 * Through the constructor {@link #Water} the name of a Water can be set. <br>
 * 
 * Through the method {@link #isHidden(boolean)} you can set the visibility of
 * the Water.<br>
 * 
 * The method {@link #getScore()} returns the points a player receives, if a
 * player shoots on a Water. <br>
 * 
 * {@link #isDestroyed()} returns the destruction of a Water. <br>
 * 
 * {@link #destroy(boolean)} sets the destruction of a Water. <br>
 * 
 * {@link #getID()} returns the ID of the Water. <br>
 * 
 * {@link #setPosition()} sets the position of a Water. <br>
 * 
 * {@link #getPosition()} returns the position of a Water. <br>
 * 
 * {@link #getXPosition()} returns the X-coordinate of the position of the Water.
 * <br>
 * 
 * {@link #getYPosition()} returns the Y-coordinate of the position of the Water.
 * <br>
 * 
 * {@link #getSize()} returns the size of the Water. <br>
 * 
 * 
 * <p>
 *
 * @author Lea Baumgärtner
 * @version 1.0
 */

public class Water extends AGameItem {

	private static final Logger logger = LogManager.getLogger(Water.class);

	boolean hide;
	boolean destroy = false;
	Point p;
	String name;

	/**
	 * Set name of a WaterField
	 * 
	 * @param name
	 */
	public Water(String name) {
		this.name = name;
		hide = true;
		destroy = false;
	}

	/**
	 * Set the visibility of the Water
	 * 
	 * @param hide
	 * 
	 * @return hide
	 */
	@Override
	public boolean isHidden(boolean hide) {
		logger.info("The method Water.isHidden has been called!");
		return hide;
	}

	/**
	 * Return the noPoints of a WaterField if it is shot.
	 * 
	 * @return noPoints
	 */
	@Override
	public int getScore() {
		logger.info("The method Water.getScore has been called!");
		logger.info("The player gets 0 points.");
		int noPoints = 0;
		return noPoints;
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
	 * Sets the destruction of a WaterField
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
	 * Returns ID of the Water
	 * 
	 * @return 0
	 */
	@Override
	public int getID() {
		logger.info("The method Water.getID has been called!");
		logger.info("ID = 0 should be returned!");
		return 0;
	}

	/**
	 * Sets the position of a water field
	 * 
	 * @param p
	 */
	@Override
	public void setPosition(Point p) {
		logger.info("The method Water.setPosition has been called!");
		this.p = p;

	}

	/**
	 * Returns the position of a water field
	 * 
	 * @return p
	 */
	@Override
	public Point getPosition() {
		logger.info("The method Water.getPosition has been called!");
		return p;
	}

	/**
	 * Returns X-coordinate of the position of a water field
	 * 
	 * @return p.x
	 */
	@Override
	public int getXPosition() {
		logger.info("The method Water.getXPosition has been called!");
		return p.x;
	}

	/**
	 * Returns Y-coordinate of the position of a water field
	 * 
	 * @return p.y
	 */
	@Override
	public int getYPosition() {
		logger.info("The method Water.getYPosition has been called!");
		return p.y;
	}

	/**
	 * Returns size of a water field
	 * 
	 * @return 1
	 */
	@Override
	public int getSize() {
		logger.info("The method Water.getSize has been called!");
		return 1;
	}

}
