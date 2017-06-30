package com.hdm_stuttgart.Battleship;

import java.util.Timer;
import java.util.TimerTask;

public class AutoBackUpThread extends Thread{
	
	@Override
	public void run() {
		// hiermit wird der Thread gestartet.
		TimerTask backupTimer = new TimerTask() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		};
		Timer timer = new Timer();
		timer.schedule(backupTimer,1000, 60000);
	}
	
	// Durch den Konstruktor wird der Thread gestartet
	AutoBackUpThread() {
		start();
	}
	
	
	
}
