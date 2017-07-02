package com.hdm_stuttgart.Battleship;

/**
 * The Class HighscoreItem 
 *
 * <p>
 * @author Celine Wichmann
 * @version 1.0
 */

public class HighscoreItem {
	
	private String name;
	private int score;
	
	
	public HighscoreItem(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}


	public String getName() {
		return name;
	}


	public int getScore() {
		return score;
	}
	
	

}
