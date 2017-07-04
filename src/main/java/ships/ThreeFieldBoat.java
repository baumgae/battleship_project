package ships;

import java.awt.Point;

/**
 * 
 * THIS CLASS IS NOT USED
 * 
 * Subclass of AShip called ThreeFieldBoat
 * <p>
 * This class is a subclass of AShip.
 * It has the ID 7.
 *
 * <p>
 * ThreeFieldBoat uses in his constructor {@link #ThreeFieldBoat}
 * the constructor {@link #AShips} to set the ID as well as it's size.
 * 
 * <p> 
 *
 * @author Lea Baumgärtner
 * @version 0.2 
 */
public class ThreeFieldBoat extends AShip {

	//ThreeFieldBoat() {
	//	super(7, 3, 0);
	
	//}
	
	@Override
	public boolean isHidden(boolean hide) {
		return hide;
	}

	@Override
	public int getScore() {
		int plusPoints = 100;	
		return plusPoints;
	}

	@Override
	public boolean isDestroyed(boolean destroy) {
		return destroy;
	}
	
	@Override
	public int getID() {
		return 7;
	}
	
	@Override
	public void setPosition(Point p) {
		this.p = p;

	}
	
	@Override
	public Point getPosition() {
		return p;
	}

	@Override
	public int getXPosition() {
		return p.x;
	}

	@Override
	public int getYPosition() {
		return p.y;
	}

	@Override
	public int getSize() {
		return 3;
	}
	
}
