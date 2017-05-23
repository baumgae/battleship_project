package gameConfigurations;

import java.util.Random;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * THIS CLASS ISN'T USED NOW!
 * 
 * <p>
 * Class for the Action of the Artificial Intelligence <br>
 * or you can just call him the Computer.
 * 
 * <p>
 * The methods {@link #randomCoordinateX(int)} and {@link #randomCoordinateY(int)} 
 * generate a random Coordinate (x/y) for the Computer where he will shoot at.
 * 
 * <p>
 * @author Celine Wichmann
 * @version 0.2
 */



public class ArtificialIntelligence {
	
	private static final Logger logger = LogManager.getLogger(ArtificialIntelligence.class);
	
    public static int randomCoordinateX(int x) {
	
    	logger.info("The method ArtificialIntelligence.randomCoordinateX has been called!"); 
    	
	    final int maximumX = x;
	
	    Random rndX = new Random();
	
	    final int randomValueX = rndX.nextInt(maximumX + 1);
	
	    return randomValueX;
	
     }	
    
    public static int randomCoordinateY(int y) {
	
    	logger.info("The method ArtificialIntelligence.randomCoordinateY has been called!"); 
    	
	   final int maximumY = y;
	
	   Random rndY = new Random();
	
	   final int randomValueY = rndY.nextInt(maximumY + 1);
	
	   return randomValueY;
	
  } 
    
}

