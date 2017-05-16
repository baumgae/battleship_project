package ships;
/**
 * THIS CLASS ISN'T ACTIVE YET
 * 
 * Subclass of AShip called QuadrupleFieldBoat
 * <p>
 * This class is a subclass of AShip.
 * It has the ID 9.
 *
 * <p>
 * QuadrupleFieldBoat uses in his constructor {@link #QuadrupleFieldBoat}
 * the constructor {@link #AShips} to set the ID as well as it's size.
 * 
 * <p> 
 *
 * @author Lea Baumgärtner
 * @version 0.2 
 */
public class QuadrupleFieldBoat extends AShip {

	QuadrupleFieldBoat() {
		super(9, 2, 2);
		
	}
	
	@Override
	public boolean isHidden() {
		return true;
	}

	@Override
	public int getScore() {
		int plusPoints = 100;	
		return plusPoints;
	}

	@Override
	public boolean isDestroyed() {
		return false;
	}
	
	@Override
	public int getID() {
		return 9;
	}
	
}
