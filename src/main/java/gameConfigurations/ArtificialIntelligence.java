package gameConfigurations;

import java.util.Random;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * CLASS IS NOT USED
 * 
 * <p>
 * Class for the Action of the Artificial Intelligence <br>
 * 
 * <p>
 * The methods {@link #randomCoordinateX(int)} and
 * {@link #randomCoordinateY(int)} generate a random Coordinate (x/y) for the
 * Computer where he will shoot at.
 * 
 * <p>
 * 
 * @author Celine Wichmann
 * @version 1.0
 */

public class ArtificialIntelligence {

	private static final Logger logger = LogManager.getLogger(ArtificialIntelligence.class);

	/**
	 * Method for generating randomCoordinateX
	 * 
	 * @param x
	 * @return randomValueX
	 */
	public static int randomCoordinateX(int x) {

		logger.info("The method ArtificialIntelligence.randomCoordinateX has been called!");

		Random rndX = new Random();

		final int randomValueX = rndX.nextInt(x);

		return randomValueX;

	}

	/**
	 * Method for generating randomCoordinateY
	 * 
	 * @param y
	 * @return randomValueY
	 */
	public static int randomCoordinateY(int y) {

		logger.info("The method ArtificialIntelligence.randomCoordinateY has been called!");

		Random rndY = new Random();

		final int randomValueY = rndY.nextInt(y);

		return randomValueY;

	}

}
