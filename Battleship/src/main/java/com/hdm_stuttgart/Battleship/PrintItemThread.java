package com.hdm_stuttgart.Battleship;

import java.awt.Point;

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
 * @version 0.2
 */



public class PrintItemThread extends Thread{

	GameArea gameArea = GameManager.getInstance().getGameAreaPlayerOne();
	Item item[][] = gameArea.getItems();

	
	@Override
	public void run() {
		while(true){
	
			for(int x = 0; x < item.length; x++) {
				for(int y = 0; y < item[x].length; y++) {
					System.out.println(item[x][y].getID());
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
