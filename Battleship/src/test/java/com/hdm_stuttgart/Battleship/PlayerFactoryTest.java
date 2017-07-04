package com.hdm_stuttgart.Battleship;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import gameConfigurations.ComputerPlayer;
import gameConfigurations.CreatePlayerException;
import gameConfigurations.HumanPlayer;
import gameConfigurations.IPlayer;
import gameConfigurations.PlayerFactory;
import junit.framework.Assert;

/**
 * Test for Creating Players
 * 
 * 
 * @author Lea Baumgärtner
 * @version 1.0
 *
 */
public class PlayerFactoryTest {

	@Test
	public void testRightPlayerchoosen() throws CreatePlayerException {

		IPlayer Player = PlayerFactory.getInstance("human", "Celine");
		Assert.assertTrue(Player instanceof HumanPlayer);
	}
	// Expected right

	@Test
	public void testRightPlayerchoosen2() throws CreatePlayerException {

		IPlayer Player = PlayerFactory.getInstance("human", "Kai");
		Assert.assertTrue(Player instanceof HumanPlayer);
	}
	// Expected wrong

	@Test
	public void testRightComputerPlayerchoosen() throws CreatePlayerException {

		IPlayer Player = PlayerFactory.getInstance("ai", "ComputerHans");
		Assert.assertTrue(Player instanceof ComputerPlayer);

	}
	// expected right

	@Test(expected = CreatePlayerException.class)
	public void testCompletelyWrong() throws CreatePlayerException {

		IPlayer Player = PlayerFactory.getInstance("xyz", "Luigi");
		Assert.assertTrue(Player instanceof HumanPlayer);
	}

}
