package game;

import java.util.Random;

import gameConfigurations.Item;

/**
 * The Class GameArea is managing the Action on the Game Area Field.
 * 
 * <p>
 * This class is managing the Action on the Game Area Field. With the method
 * {@link #unhide(int, int)} you can discover the Field to see which Game Element 
 * is behind this.
 * 
 * <p>
 * With the method {@link #shoot(int, int)} you can shoot on a Field.
 * 
 * <p>
 * @author Celine Wichmann
 * @version 0.2
 */

public class GameArea {
	
	Item items[][];
	EDifficulty difficulty;
	
	public GameArea(EDifficulty difficulty){

		java.awt.Point point = DifficultyManager.getFieldSize(difficulty);
		
		this.items =  new Item[point.x][point.y];
		// TODO: Spielfeldgröße setzen
		
		this.difficulty = difficulty;
		this.setRandomGameElement();
	}
	

	void setRandomGameElement() {

		final int CoordinateX = this.items.length;
		Random rndX = new Random();
		final int randomValueX = rndX.nextInt(CoordinateX + 1);

		final int CoordinateY = this.items[0].length;
		Random rndY = new Random();
		final int randomValueY = rndY.nextInt(CoordinateY + 1);
		
		

	}
	
	void unhide(int x, int y) {
		
	}
	
	void shoot(int x, int y) {
		
		
		
	}
}
