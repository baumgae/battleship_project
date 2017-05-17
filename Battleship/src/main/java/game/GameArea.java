package game;

import java.util.Random;

import gameConfigurations.Item;

/**
 * The Class GameArea is managing the Creation of the Game Area and handle the
 * Action on the Field.
 * 
 * <p>
 * This class is managing the Creation of the Game Area and handle the Action on
 * the Field. First the Game Area will be created with the Constructor 
 * {@link #GameArea(EDifficulty)}.
 * 
 * <p>
 * The method {@link #setRandomGameElement()} generate to random Coordinates to set
 * the Game Elements on the Field decide on which degree of Difficulty is used.
 * 
 * <p>  
 * The method {@link #unhide(int, int)} discover the Field to see which Game Element 
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

