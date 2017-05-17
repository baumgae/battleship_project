package game;

import gameConfigurations.Item;
import gameElement.Water;

public class ShipArea {
	
	int Layer1;
	Item ships [][];
	EDifficulty difficulty;
	int x;
	int y;
	
	// is it possible like that?
	public void setShipPosition (int x, int y) {
		this.x = x;
		this.y = y;
		
		//How can we give the x and y over to this two dimensional array?
		//ships[x][y];
	}
	
	public Item[][] getShipPosition () {
		return ships;
	
	}
	
	// Think about to compare in the equal method, if water is water or 
	// if there is a ship instead of water
	// It doesn't matter, if there is a ship or water, if the enemy shoots,
	// the Layer 1 will turn from 0 to 1
	void enemyShoot(Water water) {

        if (ships.equals(water)) {
        	
        	Layer1 = 0;
        	
      } else {
    	  
    	  Layer1 = 1;
      }
		
	}

}
