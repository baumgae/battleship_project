package game;

import java.awt.Point;
import java.util.Random;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import gameConfigurations.Item;
import gameElements.Dolphin;
import gameElements.Island;
import gameElements.LuckyDwarf;
import gameElements.Mine;
import gameElements.Water;
import ships.OneFieldBoat;

/**
 * The class GameArea
 * <p>
 * 
 * The Class GameArea is managing the creation of the Game Area and handles the
 * actions on the field. <br>
 * It also manages the status of the coordinate fields, so the player can see
 * where he has shot at and which item is below the coordinate.
 * 
 * <p>
 * First the Game Area will be created with the Constructor
 * {@link #GameArea(EDifficulty)}. Depending on which difficulty the player has
 * chosen the field has a different size.
 * 
 * <p>
 * The method {@link #generateRandomCoordinate()} generates random coordinates
 * for the game elements which the players are not allowed to set by themselves.
 * 
 * <p>
 * The method {@link #setNumberOfItems(int, int)} gets the random Coordinates
 * from {@link #generateRandomCoordinate()} and sets and creates the
 * gameElements. Depending on which Difficulty the Player has chosen, there is a
 * different number of Game Elements. The ID is used to decide which Game
 * Element will be created. For example in Difficulty Easy there are three
 * Objects of ID = 1 available, so the method knows there will be three Dolphins
 * created.
 * 
 * <p>
 * In the method {@link #setShipPosition(Point)} the Player is allowed to set
 * his Number of Ships.
 * 
 * <p>
 * With the method {@link #shootOnCoordinate(Point)} the Player is allowed to
 * shoot on Coordinates. The Status of each Coordinate is 0 until the Player
 * shoots on a Coordinate, then it changes to 1. If the Player has already shot
 * on this Coordinate, this method will throw an Exception, because you are only
 * allowed to shot at a Coordinate once.
 * 
 * <p>
 * The method {@link #getCoordinateFieldstatus(Point)} return the Status of a
 * Field.
 * 
 * <p>
 * If a Player shoots on a Coordinate the
 * method{@link #getPointsCoordinate(int, Point)} will check the ID of the
 * Object which is under the Button. After the method finds out which Element is
 * under the Coordinate, it returns the Number of Points the Player will get.
 * 
 * <p>
 * The method {@link #getIDCoordinate(Point)} returns the ID of the Object under
 * the Field.
 * 
 * <p>
 * The method {@link #getItems()} returns Items, including special items and
 * ships.
 * 
 * <p>
 * 
 * @author Celine Wichmann
 * @version 1.0
 */

public class GameArea {

	private static final Logger logger = LogManager.getLogger(GameArea.class);

	Item[][] items;
	EDifficulty difficulty;
	Point p;
	int randomValueX;
	int randomValueY;
	int Fieldstatus = 0; // the field hasn't been shot	???
	boolean isItem = true;							//	???

	/**
	 * Constructor which will be called if a Game Area will be created. The size
	 * of the Game Area depends the difficulty chosen by the player.
	 * 
	 * @param difficulty
	 */
	public GameArea(EDifficulty difficulty) {

		logger.info("The constructor GameArea has been called!");

		java.awt.Point point = DifficultyManager.getFieldSize(difficulty);

		this.items = new Item[point.x][point.y];

		this.difficulty = difficulty;

		setNumberOfItems(0, point.x * point.y);

	}

	/*
	 * Method for generating random coordinates for the special items
	 */
	public void generateRandomCoordinate() {

		logger.info("The method generateRandomCoordinate has been called!");

		int CoordinateX = this.items.length;
		Random rndX = new Random();
		int randomValueX = rndX.nextInt(CoordinateX);
		this.randomValueX = randomValueX;

		int CoordinateY = this.items.length;
		Random rndY = new Random();
		int randomValueY = rndY.nextInt(CoordinateY);
		this.randomValueY = randomValueY;

	}

	/**
	 * Method for setting special items through random generated coordinates.
	 * The kind of item depends on the ID and the number of this item depends on
	 * the difficulty chosen by the player.
	 * 
	 * @param ID
	 * @param NumberOfItems
	 */
	public synchronized void setNumberOfItems(int ID, int NumberOfItems) {

		logger.info("The method setNumberOfItems has been called.");
		int currentNumberOfItems = 0;

		if (ID == 0) {
			while (currentNumberOfItems < NumberOfItems) {
				this.generateRandomCoordinate();
				if (items[randomValueX][randomValueY] == null) {
					items[randomValueX][randomValueY] = new Water("Water" + currentNumberOfItems);
					currentNumberOfItems++;

				} else {
					logger.info("The method generateWater didn't work! " + randomValueX + "/" + randomValueY + " type: "
							+ items[randomValueX][randomValueY]);

				}
			}
		}

		if (ID == 1) {
			while (currentNumberOfItems < NumberOfItems) {
				this.generateRandomCoordinate();
				if (items[randomValueX][randomValueY] == null || items[randomValueX][randomValueY].getID() == 0) {
					items[randomValueX][randomValueY] = new Dolphin("Dolphin" + currentNumberOfItems);
					currentNumberOfItems++;

				} else {
					logger.info("The method generateDolphin didn't work!");

				}
			}
		}

		if (ID == 2) {
			while (currentNumberOfItems < NumberOfItems) {
				this.generateRandomCoordinate();
				if (items[randomValueX][randomValueY] == null || items[randomValueX][randomValueY].getID() == 0) {
					items[randomValueX][randomValueY] = new Island("Island" + currentNumberOfItems);
					currentNumberOfItems++;

				} else {
					logger.info("The method generateIsland didn't work!");

				}
			}
		}

		if (ID == 3) {
			while (currentNumberOfItems < NumberOfItems) {
				this.generateRandomCoordinate();
				if (items[randomValueX][randomValueY] == null || items[randomValueX][randomValueY].getID() == 0) {
					items[randomValueX][randomValueY] = new LuckyDwarf("LuckyDwarf" + currentNumberOfItems);
					currentNumberOfItems++;

				} else {
					logger.info("The method generateLuckyDwarf didn't work!");

				}
			}
		}

		if (ID == 4) {
			while (currentNumberOfItems < NumberOfItems) {
				this.generateRandomCoordinate();
				if (items[randomValueX][randomValueY] == null || items[randomValueX][randomValueY].getID() == 0) {
					items[randomValueX][randomValueY] = new Mine("Mine" + currentNumberOfItems);
					currentNumberOfItems++;

				} else {
					logger.info("The method generateMine didn't work!");

				}
			}
		}

		if (ID == 5) {
			while (currentNumberOfItems < NumberOfItems) {
				this.generateRandomCoordinate();
				if (items[randomValueX][randomValueY] == null || items[randomValueX][randomValueY].getID() == 0) {
					items[randomValueX][randomValueY] = new OneFieldBoat("OneFieldBoat" + currentNumberOfItems);
					currentNumberOfItems++;

				} else {
					logger.info("The method generateMine didn't work!");

				}
			}
		}

	}

	/**
	 * Method for setting the position of the ships.
	 * 
	 * @param p
	 */
	public synchronized void setShipPosition(Point p) {

		logger.info("The method setShipPosition has been called!");
		items[p.x][p.y] = new OneFieldBoat("Hans");

	}

	/**
	 * Method for shooting on a coordinate. If the player has already shot on
	 * the coordinate an exception will be thrown.
	 * 
	 * @param p
	 * @throws Exception
	 */
	public void shootOnCoordinate(Point p) throws Exception {

		this.p = p;
		logger.info("The method shootOnCoordinate has been called!");

		if (Fieldstatus == 1) {
			throw new AlreadyShotException();

		} else {
			logger.info("You are not allowed to shoot again over here!");
			Fieldstatus = 1;

		}
	}

	/**
	 * Method for getting the status of a Field Is the coordinate already shot
	 * or not?
	 * 
	 * @param p
	 * @return FieldStatus
	 */
	public int getCoordinateFieldstatus(Point p) {

		p = this.p;
		logger.info("The method getCoordinateLayer1Status has been called!");
		return Fieldstatus;

	}

	/**
	 * Method for getting the impact and so the points of an shot item
	 * 
	 * @param ID
	 * @param p
	 * @return points
	 * @throws NoGameElementException
	 */
	public int getPointsCoordinate(int ID, Point p) throws NoGameElementException {

		logger.info("The method getStatusCoordinate has been called!");
		Item currentItem = items[p.x][p.y];

		if (currentItem.getID() == 0) { // There is Water.
			int points = currentItem.getScore();
			return points;

		}
		if (currentItem.getID() == 1) { // There is a Dolphin.
			int points = currentItem.getScore();
			return points;

		}
		if (currentItem.getID() == 2) { // There is an Island.
			int points = currentItem.getScore();
			return points;

		}
		if (currentItem.getID() == 3) { // There is a Mine.
			int points = currentItem.getScore();
			return points;

		}
		if (currentItem.getID() == 4) { // There is a LuckyDwarf.
			int points = currentItem.getScore();
			return points;

		}
		if (currentItem.getID() == 5) { // There is an One Field Boat

			// We just have an One Field Boat at this moment.
			int points = currentItem.getScore();
			return points;

			/*
			 * } if (currentItem.getID() == 6) { // There is a Two Field Boat
			 * int points = currentItem.getScore(); return points;
			 * 
			 * } if (currentItem.getID() == 7) { // There is a Three Field Boat
			 * int points = currentItem.getScore(); return points;
			 * 
			 * } if (currentItem.getID() == 8) { // There is a Four Field Boat
			 * int points = currentItem.getScore(); return points;
			 * 
			 * } if (currentItem.getID() == 9) { // There is a Quadruple int
			 * points = currentItem.getScore(); return points;
			 */

		} else {

			logger.debug("NoGameElementException has been thrown!");
			throw new NoGameElementException();

		}
	}

	/**
	 * Method for getting the ID of an Item on a special position
	 * 
	 * @param p
	 * @return ID
	 */
	public int getIDCoordinate(Point p) {

		logger.info("The method getIDCoordinate has been called!");
		Item currentItem = items[p.x][p.y];

		if (currentItem.getID() == 0) {
			int ID = currentItem.getID();
			return ID;

		}
		if (currentItem.getID() == 1) {
			int ID = currentItem.getID();
			return ID;

		}
		if (currentItem.getID() == 2) {
			int ID = currentItem.getID();
			return ID;

		}
		if (currentItem.getID() == 3) {
			int ID = currentItem.getID();
			return ID;

		}
		if (currentItem.getID() == 4) {
			int ID = currentItem.getID();
			return ID;

		}
		if (currentItem.getID() == 5) {
			int ID = currentItem.getID();
			return ID;

			/*
			 * } if (currentItem.getID() == 6) { int ID = currentItem.getID();
			 * return ID;
			 * 
			 * } if (currentItem.getID() == 7) { int ID = currentItem.getID();
			 * return ID;
			 * 
			 * } if (currentItem.getID() == 8) { int ID = currentItem.getID();
			 * return ID;
			 * 
			 * } if (currentItem.getID() == 9) { int ID = currentItem.getID();
			 * return ID;
			 */

		} else {

			logger.debug("No ID has been found!");
			return -1;
		}
	}

	/**
	 * Method for getting the items
	 * 
	 * @return items
	 */
	public Item[][] getItems() {
		logger.info("The method getItems() has been called!");
		return items;
	}
}