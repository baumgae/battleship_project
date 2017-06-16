package game;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import gameConfigurations.Item;

/**
 * The Class ShipArea is managing the Players own Field.
 * 
 * <p>
 * This class is managing the Players own Field. With the method 
 * {@link #setShipPosition(int, int)} the Player can set the Number of ships 
 * he is getting with the degree of Difficult.
 * 
 * <p> The method {@link #getShipPosition()} shows the Position of the ships on 
 * the Field.
 * 
 * <p>
 * @author Celine Wichmann
 * @version 0.2
 */

public class ShipArea {
	
	private static final Logger logger = LogManager.getLogger(ShipArea.class);
	
	int FieldStatus;
	Item[][] ships;
	int x;
	int y;
	
	// TJ: Please look at this, and tell us what you think.
	
	// Damit werden die Schiffe gesetzt;
	public void setShipPosition (Item ships,int x, int y) {
	    
		logger.info("The method ShipArea.setShipPosition has been called!"); 
		x = this.x;
		y = this.y;
	    ships = this.ships[x][y];
	
	}
	
	public Item getShipPosition () {
		
		logger.info("The method ShipArea.getShipPosition has been called!"); 
		return ships[x][y];
	
	}
		
  }


