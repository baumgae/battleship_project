package game;

import gameConfigurations.Item;
import gameElement.Water;

public class ShipArea {
	
	int Layer1;
	Item ships [][];
	EDifficulty difficulty;
	
	public Item[][] shipPosition(EDifficulty difficulty) {
		
		java.awt.Point point = DifficultyManager.getFieldSize(difficulty);
		
		this.ships = new Item[point.x] [point.y];
		
		return ships;
		
		
	}
	
	void enemyShoot(Water water) {

        if (ships.equals(water)) {
        	
        	Layer1 = 0;
        	
      } else {
    	  
    	  Layer1 = 1;
      }
		
	}

}
