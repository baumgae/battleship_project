package com.hdm_stuttgart.Battleship;

public class AutoBackUpThread extends Thread{
	
	@Override
	public void run() {
		while(true){
			// Ausgabe aller Items mit dem Logger in zwei for-Schleifen
			
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
}
