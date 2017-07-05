package gameElements;

import java.awt.Point;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * 
 * Game Element Mine
 * <p>
 * This class is a subclass of Game Items. It has the ID 4 as well as a special
 * impact. If the player hits a Mine on the shootingArea, he or she will "die"
 * and the game will be quit immediately. The other player will have won the
 * game.
 * 
 * But before we can implement this, the impact of the GameElement will be
 * MinusPoints.
 *
 * <p>
 * Through the constructor {@link #Mine} the name of a Mine can be set. <br>
 * 
 * Through the method {@link #isHidden(boolean)} you can set the visibility of
 * the Mine.<br>
 * 
 * The method {@link #getScore()} returns the points a player receives, if a
 * player shoots on a Mine. <br>
 * 
 * {@link #isDestroyed()} sets the destruction of a Mine. <br>
 * 
 * {@link #getID()} returns the ID of the Mine. <br>
 * 
 * {@link #setPosition()} sets the position of a Mine. <br>
 * 
 * {@link #getPosition()} returns the position of a Mine. <br>
 * 
 * {@link #getXPosition()} returns the X-coordinate of the position of the Mine.
 * <br>
 * 
 * {@link #getYPosition()} returns the Y-coordinate of the position of the Mine.
 * <br>
 * 
 * {@link #getSize()} returns the size of the Mine. <br>
 * 
 * 
 * <p>
 *
 * @author Lea Baumgärtner
 * @version 1.0
 */
public class Mine extends AGameItem {

	private static final Logger logger = LogManager.getLogger(Mine.class);

	boolean hide;
	boolean destroy = false;
	Point p;
	String name;

	/**
	 * Set name of a Mine
	 * 
	 * @param name
	 */
	public Mine(String name) {
		this.name = name;
		hide = true;
		destroy = false;
	}

	/**
	 * Set the visibility of a Mine
	 * 
	 * @param hide
	 * 
	 * @return hide
	 */
	@Override
	public boolean isHidden(boolean hide) {
		logger.info("The method Mine.isHidden has been called!");
		return hide;
	}

	/**
	 * Return the plusPoints of a Mine if it is shot.
	 * 
	 * @return minusPoints
	 */
	@Override
	public int getScore() {
		logger.info("The method Mine.getScore has been called!");
		logger.info("The player gets -400 Points!");
		int minusPoints = -400;
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
	 * Sets the destruction of a Mine
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
	 * Returns ID of the Mine
	 * 
	 * @return 4
	 */
	@Override
	public int getID() {
		logger.info("The method Mine.getID has been called!");
		logger.info("ID = 4 should be returned!");
		return 4;
	}

	/**
	 * Sets the position of a Mine
	 * 
	 * @param p
	 */
	@Override
	public void setPosition(Point p) {
		logger.info("The method Mine.setPosition has been called!");
		this.p = p;

	}

	/**
	 * Returns the position of a Mine
	 * 
	 * @return p
	 */
	@Override
	public Point getPosition() {
		logger.info("The method Mine.getPosition has been called!");
		return p;
	}

	/**
	 * Returns X-coordinate of the position of a Mine
	 * 
	 * @return p.x
	 */
	@Override
	public int getXPosition() {
		logger.info("The method Mine.getXPosition has been called!");
		return p.x;
	}

	/**
	 * Returns Y-coordinate of the position of a Mine
	 * 
	 * @return p.y
	 */
	@Override
	public int getYPosition() {
		logger.info("The method Mine.getYPosition has been called!");
		return p.y;
	}

	/**
	 * Returns size of a Mine
	 * 
	 * @return 1
	 */
	@Override
	public int getSize() {
		logger.info("The method Mine.getSize has been called!");
		return 1;
	}

}
