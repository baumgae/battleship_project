package gameElements;

import java.awt.Point;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Game Element LuckyDwarf
 * <p>
 * This class is a subclass of Game Items. It has the ID 3 as well as a special
 * impact. If the player hits a LuckyDwarf on the shootingArea, he or she will
 * get plus 300 points.
 * <p>
 *
 * <p>
 * Through the constructor {@link #LuckyDwarf} the name of a LuckyDwarf can be
 * set. <br>
 * 
 * Through the method {@link #isHidden(boolean)} you can set the visibility of
 * the LuckyDwarf.<br>
 * 
 * The method {@link #getScore()} returns the points a player receives, if a
 * player shoots on a LuckyDwarf. <br>
 * 
 * {@link #isDestroyed()} sets the destruction of a LuckyDwarf. <br>
 * 
 * {@link #getID()} returns the ID of the LuckyDwarf. <br>
 * 
 * {@link #setPosition()} sets the position of a LuckyDwarf. <br>
 * 
 * {@link #getPosition()} returns the position of a LuckyDwarf. <br>
 * 
 * {@link #getXPosition()} returns the X-coordinate of the position of the
 * LuckyDwarf. <br>
 * 
 * {@link #getYPosition()} returns the Y-coordinate of the position of the
 * LuckyDwarf. <br>
 * 
 * {@link #getSize()} returns the size of the LuckyDwarf. <br>
 * 
 * 
 * <p>
 *
 * @author Lea Baumgärtner
 * @version 1.0
 */
public class LuckyDwarf extends AGameItem {

	private static final Logger logger = LogManager.getLogger(LuckyDwarf.class);

	boolean hide;
	boolean destroy;
	Point p;
	String name;

	/**
	 * Set name of a LuckyDwarf
	 * 
	 * @param name
	 */
	public LuckyDwarf(String name) {
		this.name = name;
		hide = true;
		destroy = false;
	}

	/**
	 * Set the visibility of a LuckyDwarf
	 * 
	 * @param hide
	 * 
	 * @return hide
	 */
	@Override
	public boolean isHidden(boolean hide) {
		logger.info("The method LuckyDwarf.isHidden has been called!");
		return hide;
	}

	/**
	 * Return the plusPoints of a LuckyDwarf if it is shot.
	 * 
	 * @return plusPoints
	 */
	@Override
	public int getScore() {
		int plusPoints = 500;
		return plusPoints;
	}

	/**
	 * Sets the destruction of a LuckyDwarf
	 * 
	 * @param destroy
	 * @return destroy
	 * 
	 */
	@Override
	public boolean isDestroyed(boolean destroy) {
		return destroy;
	}

	/**
	 * Returns ID of the LuckyDwarf
	 * 
	 * @return 3
	 */
	@Override
	public int getID() {
		return 3;
	}

	/**
	 * Sets the position of a LuckyDwarf
	 * 
	 * @param p
	 */
	@Override
	public void setPosition(Point p) {
		this.p = p;

	}

	/**
	 * Returns the position of a LuckyDwarf
	 * 
	 * @return p
	 */
	@Override
	public Point getPosition() {
		return p;
	}

	/**
	 * Returns X-coordinate of the position of a LuckyDwarf
	 * 
	 * @return p.x
	 */
	@Override
	public int getXPosition() {
		return p.x;
	}

	/**
	 * Returns Y-coordinate of the position of a LuckyDwarf
	 * 
	 * @return p.y
	 */
	@Override
	public int getYPosition() {
		return p.y;
	}

	/**
	 * Returns size of a LuckyDwarf
	 * 
	 * @return 1
	 */
	@Override
	public int getSize() {
		return 1;
	}

}
