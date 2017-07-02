package com.hdm_stuttgart.Battleship;

import game.GameArea;

/**
 *The class AutoBackUpThread returns all Items in an Interval of 60 seconds.
 * 
 * <p>
 * @author Celine Wichmann
 * @version 0.2
 */

public class AutoBackUpThread extends Thread{
	
	public void run(GameArea items) {
		while(true){
			// Ausgabe aller Items mit dem Logger in zwei for-Schleifen???
			start();
			for(int x = 0; x < 15; x++) {
				for(int y = 0; y <= 15; y++) {
					GameArea.logger.info(((GameArea) GameArea.logger).getItems());
					
				}
				
			}
			
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
}
