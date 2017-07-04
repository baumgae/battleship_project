package ships;

import java.awt.Point;

/**
 * 
 * THIS CLASS IS NOT USED
 * 
 * Subclass of AShip called FourFieldBoat
 * <p>
 * This class is a subclass of AShip.
 * It has the ID 8.
 *
 * <p>
 * Through the method {@Link #isHidden(boolean)} you can set the <br>
 * visibility of the FourFieldBoat.
 * 
 * 
 * <p> 
 *
 * @author Lea Baumgärtner
 * @version 0.2 
 */
public class FourFieldBoat extends AShip {
	
	//FourFieldBoat() {
	//	super(8, 4, 0);
	
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
		return 8;
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
	

}
