package gameConfigurations;
import java.util.Random;

public class ArtificialIntelligence {
	
	/*
	 * TJ
	 * You want to return a random x and y coordinate, right?
	 * Just remove the summation in the return statement and return a single value.
	 * To get a second random position value, just call the method twice. 
	 */
	
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

