package com.hdm_stuttgart.Battleship;

/**
 * Test for Creating GameArea
 * 
 * @author Lea Baumgärtner
 * @version 1.0
 */
import static org.junit.Assert.assertEquals;

import java.awt.Point;

import org.junit.Test;

import game.EDifficulty;
import game.GameArea;
import gameConfigurations.ComputerPlayer;
import gameConfigurations.CreatePlayerException;
import gameConfigurations.HumanPlayer;
import gameConfigurations.IPlayer;
import gameConfigurations.PlayerFactory;
import junit.framework.Assert;

public class CreateGameAreaTest {

	// Expected right
	@Test
	public void testRightGameAreaCreated() {

		GameArea area = new GameArea(EDifficulty.EASY);
		Assert.assertTrue(area instanceof GameArea);

	}

	// Expected right
	@Test
	public void testRightGameAreaCreated2() {

		GameArea area = new GameArea(EDifficulty.NORMAL);
		Assert.assertTrue(area instanceof GameArea);

	}

	// Expected right
	@Test
	public void testRightGameAreaCreated3() {

		GameArea area = new GameArea(EDifficulty.HARD);
		Assert.assertTrue(area instanceof GameArea);

	}

	// Expected right
	@Test
	public void testRightGameAreaCreated4() {

		GameArea area = new GameArea(EDifficulty.SUICIDAL);
		Assert.assertTrue(area instanceof GameArea);

	}

}
