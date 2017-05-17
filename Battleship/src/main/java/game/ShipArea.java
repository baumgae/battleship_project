package game;

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
 * <p> The method {@link #enemyShoot()} shows if a field has already been shot by the
 * other Player and set the FieldStatus on 1.
 * 
 * <p>
 * @author Celine Wichmann
 * @version 0.2
 */

public class ShipArea {
	
	int FieldStatus;
	Item ships [][];
	int x;
	int y;
	
	public void setShipPosition (int x, int y) {
	    
		this.x = x;
		this.y = y;
	  //ships[x][y];
		
		//How can we give the x and y over to this two dimensional array?
	
	}
	
	public Item[][] getShipPosition () {
		return ships;
	
	}
	
	// How can I check if a method was even used.
	
	void enemyShoot() {

        if (x == 2) { 
        	//if the shoot method has been called for the field, FieldStatus = 1
        	
        	FieldStatus = 1;
        	
      } else {
    	  
    	    FieldStatus = 0;
      }
		
	}

}
