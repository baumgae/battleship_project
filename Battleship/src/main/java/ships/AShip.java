package ships;
import game.IGameElements;
/**
 * Abstract Class Ships
 * <p>
 * This is the super class for the ships.
 * 
 * Due to the constructor the children have to set an ID
 * as well as their ship size in x and in y direction.
 * And there are methods for getting the size, the ID and their 
 * position.
 
 * <p>
 *
 * @author Lea Baumgärtner
 * @version 0.2 
 */
public abstract class AShip implements IShip {
	
	char shipID;
	int shipSizeX;
	int shipSizeY;
	int x;
	int y;
	
	AShip(char shipID, int shipSizeX, int shipSizeY) {
		this.shipID = shipID;
		this.shipSizeX = shipSizeX;
		this.shipSizeY = shipSizeY;
	}

	/* (non-Javadoc)
	 * @see ships.IShip#getShipID()
	 */
	@Override
	public char getShipID() {
		return shipID;
	}

	/* (non-Javadoc)
	 * @see ships.IShip#getShipSizeX()
	 */
	@Override
	public int getShipSizeX() {
		return shipSizeX;
	}

	/* (non-Javadoc)
	 * @see ships.IShip#getShipSizeY()
	 */
	@Override
	public int getShipSizeY() {
		return shipSizeY;
	}

	/* (non-Javadoc)
	 * @see game.IGameElements#getX()
	 */
	@Override
	public int getX() {
		return x;
	}
	
	/* (non-Javadoc)
	 * @see game.IGameElements#getX()
	 */
	@Override
	public int getY() {
		return y;
	}

}