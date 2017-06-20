package com.hdm_stuttgart.Battleship;

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

	
	@Test
	public void testRightGameAreaCreated() throws CreatePlayerException {
		
		// Point p = new Point(5,5);
		
		GameArea area = new GameArea(EDifficulty.EASY);
		Assert.assertTrue(area instanceof GameArea);
		
	}
	// Expected right
	@Test
	public void testWrongGameAreaCreated() throws CreatePlayerException {
		
		// Point p = new Point(5,5);
		
		GameArea area = new GameArea(EDifficulty.EASY);
		Assert.assertTrue(area instanceof GameArea);
		
	}
	
}
