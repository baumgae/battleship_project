package ships;
/**
 * Subclass of AShip called QuadrupleFieldBoat
 * <p>
 * This class is a subclass of AShip.
 * It has the ID 'E'.
 *
 * <p>
 * FourFieldBoat uses in his constructor {@link #QuadrupleFieldBoat}
 * the constructor {@link #AShips} to set the ID as well as it's size.
 * Use {@link #getY} and {@link #getX} to receive the position.
 * 
 * <p> 
 *
 * @author Lea Baumgärtner
 * @version 0.2 
 */
public class QuadrupleFieldBoat extends AShip {

	QuadrupleFieldBoat() {
		super('E', 2, 2);
		
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return 0;
	}
}
