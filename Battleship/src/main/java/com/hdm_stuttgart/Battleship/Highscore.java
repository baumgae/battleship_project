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
	
	List<HighscoreItem> namesList = new ArrayList<>();
	
	public void addScore(String name, int score){
		namesList.add(new HighscoreItem(name, score));
	}
	
	public String sortedScores(){
		
		 namesList
		.parallelStream()
		.sorted((n0, n1) -> Integer.compare(n0.getScore(), n1.getScore()))
		.forEach(System.out::println);
		
		
		return "";
	}
	
	public int getHighscore(){
		int score = 0;
		return score;
	}
	
}
