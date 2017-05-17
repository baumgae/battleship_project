package ships;

import java.awt.Point;

/**
 * 
 * THIS CLASS ISN'T ACTIVE YET
 * 
 * Subclass of AShip called OneFieldBoat
 * <p>
 * This class is a subclass of AShip.
 * It has the ID 6.
 *
 * <p>
 * TwoFieldBoat uses in his constructor {@link #TwoFieldBoat}
 * the constructor {@link #AShips} to set the ID as well as it's size.
 * 
 * <p> 
 *
 * @author Lea Baumgärtner
 * @version 0.2 
 */
public class TwoFieldBoat extends AShip {

	TwoFieldBoat() {
		super(6, 2, 0);
	
	}
	
	@Override
	public boolean isHidden(boolean hide) {
		return true;
	}

	@Override
	public int getScore() {
		int plusPoints = 100;	
		return plusPoints;
	}

	@Override
	public boolean isDestroyed(boolean destroy) {
		return false;
	}
	
	@Override
	public int getID() {
		return 6;
	}
	
	@Override
	public Point setPosition(Point p) {
		this.p = p;
		return p;
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
		return 2;
	}
	
}
