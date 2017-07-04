package ships;

import java.awt.Point;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Subclass of AShip called OneFieldBoat
 * 
 * <p>
 * This class is a subclass of AShip. It has the ID '5'.
 *
 * <p>
 * OneFieldBoat uses in his constructor {@link #OneFieldBoat(String name)} for
 * setting a OneFieldBoats name.<br>
 * 
 * Through the method {@link #isHidden(boolean)} you can set the visibility of
 * the OneFieldBoat.<br>
 * 
 * The method {@link #getScore()} returns the points a player receives, if a
 * player shoots on a OneFieldBoat. <br>
 * 
 * {@link #isDestroyed()} sets the destruction of a OneFieldBoat. <br>
 * 
 * {@link #getID()} returns the ID of the OneFieldBoat. <br>
 * 
 * {@link #setPosition()} sets the position of a OneFieldBoat. <br>
 * 
 * {@link #getPosition()} returns the position of a OneFieldBoat. <br>
 * 
 * {@link #getXPosition()} returns the X-coordinate of the position of the
 * OneFieldBoat. <br>
 * 
 * {@link #getYPosition()} returns the Y-coordinate of the position of the
 * OneFieldBoat. <br>
 * 
 * {@link #getSize()} returns the size of the OneFieldBoat. <br>
 * 
 * <p>
 *
 * @author Lea Baumgärtner
 * @version 1.0
 */
public class OneFieldBoat extends AShip {

	private static final Logger logger = LogManager.getLogger(OneFieldBoat.class);

	boolean hide;
	boolean destroy;
	Point p;
	String name;

	/**
	 * Set name of a OneFieldBoat
	 * 
	 * @param name
	 */
	public OneFieldBoat(String name) {
		this.name = name;
		hide = true;
		destroy = false;
	}

	/**
	 * Set the visibility of a OneFieldBoat
	 * 
	 * @param hide
	 * 
	 * @return hide
	 */
	@Override
	public boolean isHidden(boolean hide) {
		logger.info("The method OneFieldBoat.isHidden has been called!");
		this.hide = hide;
		return hide;
	}

	/**
	 * Return the points of a OneFieldBoat if it is shot.
	 * 
	 * @return plusPoints
	 */
	@Override
	public int getScore() {
		logger.info("The method OneFieldBoat.getScore has been called!");
		logger.info("The player gets 100 points!");
		int plusPoints = 100;
		return plusPoints;
	}

	/**
	 * Sets the destruction of a OneFieldBoat
	 * 
	 * @param destroy
	 * @return destroy
	 * 
	 */
	@Override
	public boolean isDestroyed(boolean destroy) {
		logger.info("The method OneFieldBoat.isDestroyed has been called!");
		return destroy;
	}

	/**
	 * Returns ID of the OneFieldBoat
	 * 
	 * @return 5
	 */
	@Override
	public int getID() {
		logger.info("The method OneFieldBoat.getID has been called!");
		logger.info("ID = 5 should be returned!");
		return 5;
	}

	/**
	 * Sets the position of a OneFieldBoat
	 * 
	 * @param p
	 */
	@Override
	public void setPosition(Point p) {
		logger.info("The method OneFieldBoat.setPosition has been called!");
		this.p = p;

	}

	/**
	 * Returns the position of a OneFieldBoat
	 * 
	 * @return p
	 */
	@Override
	public Point getPosition() {
		logger.info("The method OneFieldBoat.getPosition has been called!");
		return p;
	}

	/**
	 * Returns X-coordinate of the position of a OneFieldBoat
	 * 
	 * @return p.x
	 */
	@Override
	public int getXPosition() {
		logger.info("The method OneFieldBoat.getXPosition has been called!");
		return p.x;
	}

	/**
	 * Returns Y-coordinate of the position of a OneFieldBoat
	 * 
	 * @return p.y
	 */
	@Override
	public int getYPosition() {
		logger.info("The method OneFieldBoat.getYPosition has been called!");
		return p.y;
	}

	/**
	 * Returns size of a OneFieldBoat
	 * 
	 * @return 1
	 */
	@Override
	public int getSize() {
		logger.info("The method OneFieldBoat.getSize has been called!");
		return 1;
	}

}
