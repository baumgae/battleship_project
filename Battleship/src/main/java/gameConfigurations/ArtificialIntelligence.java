package gameConfigurations;

import java.util.Random;

/**
 * Class for the Action of the Artificial Intelligence or you can just call
 * him the Computer.
 * 
 * <p>
 * The methods {@link #randomCoordinateX(int)} and {@link #randomCoordinateY(int)} 
 * generate a rando Coordinate (x/y) for the Computer where it will shoot at.
 * 
 * <p>
 * @author Celine Wichmann
 * @version 0.2
 */


public class ArtificialIntelligence {
	
	
public static int randomCoordinateX(int x) {
	
	final int maximumX = x;
	
	
	Random rndX = new Random();
	
	
	final int randomValueX = rndX.nextInt(maximumX + 1);
	
	
	return randomValueX;
	
 }	
public static int randomCoordinateY(int y) {
	
	final int maximumY = y;
	
	Random rndY = new Random();
	
	final int randomValueY = rndY.nextInt(maximumY + 1);
	
	return randomValueY;
	
  } 
}

