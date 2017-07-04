package com.hdm_stuttgart.Battleship;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import battleshipGUI.GameAreaScreen;

/**
 * The Class Highscore is an ArrayList which contains the Name of a Player and
 * his counted Points during the Game.
 * 
 * <p>
 * The method {@link #addScore(String, int)} adds name and score to the
 * ArrayList.
 * 
 * <p>
 * The method {@link #sortedScores()} sorts the ArrayList, so that the Player
 * with the highest Score stands on the Beginning of the List.
 * 
 * <p>
 * The method {@link #getScore()} returns the ArrayList.
 *
 * <p>
 * 
 * @author Celine Wichmann
 * @version 1.0
 */

public class Highscore {

	private static final Logger logger = LogManager.getLogger(Highscore.class);
	List<HighscoreItem> namesList = new ArrayList<>();

	/**
	 * Adds name and score to the ArrayList HighscoreItems
	 * 
	 * @param name
	 * @param score
	 */
	public void addScore(String name, int score) {
		namesList.add(new HighscoreItem(name, score));
	}

	/**
	 * Sorts the ArrayList
	 */
	public void sortedScores() {

		namesList.parallelStream().sorted((n0, n1) -> Integer.compare(n0.getScore(), n1.getScore()))
				// .forEach(System.out::println);
				// Instead of using system.out.println
				.forEach(e -> logger.info(e.toString()));

	}

	/**
	 * Return Highscores
	 * 
	 * @return namesList
	 */
	public List<HighscoreItem> getScore() {
		return namesList;
	}

}
