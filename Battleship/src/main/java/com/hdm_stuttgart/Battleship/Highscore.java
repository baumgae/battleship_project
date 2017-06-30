package com.hdm_stuttgart.Battleship;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Highscore {
	
	//Instanzen Player vom GameManager und den Namen sammt den Punkten speichern
	//werte von player 1 und player 2 vergleichen
	//das höhere wird mit namen in einer liste gespeichert
	// sortieren
	//Bsp.
	//  Name | Punktzahl
	//  Lea  | 150
	//Celine | 120
	//sortiert nach den meisten Punkten
	public void setHighscore() {
	List<String> namesList = new ArrayList<String>();
	namesList.add(GameManager.getInstance().getPlayerOne().getName());
	namesList.add(GameManager.getInstance().getPlayerTwo().getName());

	
//	List<Integer> pointsList = new ArrayList<Integer>();
//	pointsList.add(GameManager.getInstance().getPlayerOne().getCountedPoints());
//	pointsList.add(GameManager.getInstance().getPlayerTwo().getCountedPoints());

	
	/*Map<Integer, List namesList> highscoreList = namesList
			.stream()
			.collect(Collectors.toMap(
					highscoreList -> GameManager.getInstance().getPlayerOne().getCountedPoints(),
					highscoreList -> namesList))
			.collect(Collectors.toMap(
					highscoreList -> GameManager.getInstance().getPlayerTwo().getCountedPoints(),
					highscoreList -> namesList))
			.sort();*/
	
	
	
	
	

	Map<String, Integer> highscoreList = new HashMap<String, Integer>();
	highscoreList.put(GameManager.getInstance().getPlayerOne().getName(),
			GameManager.getInstance().getPlayerOne().getCountedPoints());
	highscoreList.put(GameManager.getInstance().getPlayerTwo().getName(),
			GameManager.getInstance().getPlayerTwo().getCountedPoints());

	      if(GameManager.getInstance().getPlayerOne().getCountedPoints() <= 
	    		  GameManager.getInstance().getPlayerTwo().getCountedPoints()) {
	    	   
	      }
	      
	      if(GameManager.getInstance().playerOne.getCountedPoints() >= 
	    		  GameManager.getInstance().getPlayerTwo().getCountedPoints()) {
	    	  
	      }
	      
	      if(GameManager.getInstance().playerOne.getCountedPoints() == 
	    		  GameManager.getInstance().getPlayerTwo().getCountedPoints()) {
	    	  
	      }
	      
	      else{
	    	  
	      }
	
	}
	
	public void getHighsore(){
		
	}
	
}
