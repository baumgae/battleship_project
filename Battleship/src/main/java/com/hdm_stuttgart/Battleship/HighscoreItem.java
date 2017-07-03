package com.hdm_stuttgart.Battleship;

/**
 * The Class HighscoreItem 
 * <p>
 * A class for saving a name and the score of this person.
 * 
 * {@link #HighscoreItem(String, int)} is the constructor for saving a new HighscoreItem. So if a new HighscoreItem will be 
 * instantiated, a name and a score has to be given as parameters.
 * <br>
 * {@link #getName()} returns the name of the specific HighscoreItem. <br>
 * {@link #getScore()} returns the score of the specific HighscoreItem. <br> 
 *
 * <p>
 * @author Celine Wichmann
 * @version 1.0
 */

public class HighscoreItem {
	
	private String name;
	private int score;
	
	/**
	 * HighscoreItem for saving a new Highscore
	 * @param name
	 * @param score
	 */
	public HighscoreItem(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

	/**
	 * Method for getting the name of a highscore
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Method for getting the score of a highscore
	 * @return name
	 */
	public int getScore() {
		return score;
	}
	
	

}
