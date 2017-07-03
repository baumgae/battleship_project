package com.hdm_stuttgart.Battleship;

import java.awt.Point;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import battleshipGUI.OpeningScreen;
import battleshipGUI.SelectDifficultyScreen;
import battleshipGUI.SetShipsScreen;
import game.DifficultyManager;
import game.EDifficulty;
import game.GameArea;
import gameConfigurations.Item;

/**
 *The class AutoBackUpThread returns all Items in an Interval of 60 seconds.
 * 
 * <p>
 * @author Celine Wichmann
 * @author Lea Baumgärtner
 * @version 0.2
 */



public class PrintItemThread extends Thread{

	private static final Logger logger = LogManager.getLogger(PrintItemThread.class);
	
	GameArea gameArea = GameManager.getInstance().getGameAreaPlayerOne();
	Item item[][] = gameArea.getItems();

	
	@Override
	public void run() {
		while(true && !isInterrupted()){
	
			for(int x = 0; x < item.length; x++) {
				for(int y = 0; y < item[x].length; y++) {
					
					logger.info("Printing Items: " +  item[x][y].getID());
			
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

}
