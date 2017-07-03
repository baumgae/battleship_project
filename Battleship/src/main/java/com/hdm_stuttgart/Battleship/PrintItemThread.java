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
	private boolean running = true;

	
	@Override

	public void run() {

		// TJ: Das mit dem interrupt() war eine gute Idee! Leider ist das einfach nur eine
		// nette Anfrage an den Thread sich zu beenden. Da eurer hier noch mit der Schleife
		// beschäftigt ist, reagiert das hier nicht. Wenn jetzt running auf false geht, muss 
		// jetzt max. 10s warten bis sich euer Programm vollständig beendet.
		while(running){
	
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
	
	// TJ: Neue Methode mit der ihr den Thread beenden könnt. Die while-Schleife
	// läuft so lange bis die running-Variable auf false ist.
	public void shutdown(){
		running = false;
	}

}
