package ships;

import java.awt.Point;

/**
 * THIS CLASS IS NOT USED
 * 
 * Subclass of AShip called QuadrupleFieldBoat
 * <p>
 * This class is a subclass of AShip. It has the ID 9.
 *
 * <p>
 * QuadrupleFieldBoat uses in his constructor {@link #QuadrupleFieldBoat} the
 * constructor {@link #AShips} to set the ID as well as it's size.
 * 
 * <p>
 *
 * @author Lea Baumgärtner
 * @version 0.2
 */
public class QuadrupleFieldBoat extends AShip {

	// QuadrupleFieldBoat() {
	// super(9, 2, 2);

	// }

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
	public int getID() {
		return 9;
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
		return 4;
	}

	@Override
	public void destroy(boolean b) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isDestroyed() {
		// TODO Auto-generated method stub
		return false;
	}

}
