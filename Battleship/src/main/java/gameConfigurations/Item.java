package gameConfigurations;

import java.awt.Point;

/**
* 
* Interface Item
* <p>
* Interface for all possible game items. Game Elements as well as ships.
* 
 * Every Subclass of Items has the methods
 * {@Link #isHidden(boolean)}, {@Link #getScore()},
 * {@Link #isDestroyed(boolean)}, {@Link #getID()}.
 * <p>
 *
 * @author Lea Baumgärtner
 * @version 0.2 
 */
public interface Item {
	
	public boolean isHidden(boolean hide);
	public int getScore();
	public boolean isDestroyed(boolean destroy);
	public int getID();
	public int getSize();
	public Point setPosition(Point p);
	public Point getPosition();
	public int getXPosition();
	public int getYPosition();
	
	
	//public String getIcon();
		
}
