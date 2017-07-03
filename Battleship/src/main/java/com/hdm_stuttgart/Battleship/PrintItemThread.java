package com.hdm_stuttgart.Battleship;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import game.GameArea;
import gameConfigurations.Item;

/**
 *The class PrintItemThread <p>
 *
 *returns all Items in an Interval of 60 seconds.
 *
 *With {@link #run()} the thread will be started and prints every 
 *60 seconds all items on the field to the console. <br>
 *
 *The method {@link shutdown()} sets the boolean variable running on false so 
 *the loop ends.
 * 
 * <p>
 * @author Celine Wichmann
 * @author Lea Baumgärtner
 * @version 1.0
 */



public class PrintItemThread extends Thread{

	private static final Logger logger = LogManager.getLogger(PrintItemThread.class);
	
	GameArea gameArea = GameManager.getInstance().getGameAreaPlayerOne();
	Item item[][] = gameArea.getItems();
	private boolean running = true;

	/**
	 * Method to run the PrintItemThread
	 */
	@Override
	public void run() {

		
		while(running){
	
			for(int x = 0; x < item.length; x++) {
				for(int y = 0; y < item[x].length; y++) {
					
					logger.info("ID of the item: " +  item[x][y].getID());
			
				}
				
			}
			
			try {
				Thread.sleep(10000);
				
			} catch (InterruptedException e) {
				interrupt();
				logger.info("PrintItemThread has been interrupted!");
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * Method for setting the boolean variable running on false
	 */
	public void shutdown(){
		running = false;
	}

}
