package gameConfigurations;

import java.awt.Point;

/**
 * 
 * Interface Item
 * <p>
 * Interface for all possible game items. Game Elements as well as ships.
 * 
 * Every Subclass of Items has the methods {@link #isHidden(boolean)} sets the
 * visibility of an Item. <br>
 * {@link #getScore()} returns the score of an Item <br>
 * {@link #isDestroyed(boolean)} sets the destruction of an Item <br>
 * {@link #getID()} returns ID of an Item. <br>
 * {@link #getSize} returns the size of an item. <br>
 * 
 * {@link #setPosition(Point)} sets the position of an Item <br>
 * {@link #getPosition()} returns the position of an Item <br>
 * {@link #getXPosition()} returns the x-coordinate of an Item <br>
 * {@link #getYPosition()} returns the y-coordinate of an Item <br>
 * <p>
 *
 * @author Lea Baumgärtner
 * @version 1.0
 */
public interface Item {
	/**
	 * Sets visibility of an item
	 * 
	 * @param hide
	 * @return hide
	 */
	public boolean isHidden(boolean hide);

	/**
	 * Returns points of an item
	 * 
	 * @return points
	 */
	public int getScore();

	/**
	 * Sets destruction of an item
	 * 
	 * @param destroy
	 * @return destroy
	 */
	public boolean isDestroyed(boolean destroy);

	/**
	 * Returns ID of an item
	 * 
	 * @return ID
	 */
	public int getID();

	/**
	 * Returns size of an item
	 * 
	 * @return size
	 */
	public int getSize();

	/**
	 * sets position of an item
	 * 
	 * @param p
	 */
	public void setPosition(Point p);

	/**
	 * Returns position of an item
	 * 
	 * @return Point p
	 */
	public Point getPosition();

	/**
	 * Returns position on x-coordinate of an item
	 * 
	 * @return
	 */
	public int getXPosition();

	/**
	 * Returns position on y-coordinate of an item
	 * 
	 * @return
	 */
	public int getYPosition();

}
