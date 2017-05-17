package ships;

import java.awt.Point;

import gameConfigurations.Item;

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

/*
 * TJ
 * You can consider to implement the IGameElement interface
 */
public abstract class AShip implements Item {
	
	int shipID;
	int shipSizeX;
	int shipSizeY;
	
	Point p;
	int x;
	int y;
	int shipPoints;
	
	AShip(int shipID, int shipSizeX, int shipSizeY) {
		this.shipID = shipID;
		this.shipSizeX = shipSizeX;
		this.shipSizeY = shipSizeY;
	}
	
	
	/* (non-Javadoc)
	 * @see game.IGameElements#getX()
	 */
	@Override
	public int getID() {
		return this.shipID;
	}
	

	
	
	
}