package ships;

public abstract class AShip implements IShip {
	
	char shipID;
	int shipSizeX;
	int shipSizeY;
	
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

	
	
	

}