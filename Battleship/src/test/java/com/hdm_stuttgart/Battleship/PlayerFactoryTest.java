package com.hdm_stuttgart.Battleship;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import gameConfigurations.CreatePlayerException;
import gameConfigurations.HumanPlayer;
import gameConfigurations.IPlayer;
import gameConfigurations.PlayerFactory;
import junit.framework.Assert;

public class PlayerFactoryTest {
	
	@Test
	public void testWrongPlayerchoosen() throws CreatePlayerException {
	
		IPlayer Player = PlayerFactory.getInstance("human", "Celine");
		Assert.assertTrue(Player instanceof HumanPlayer);
	}
	
	// noch zwei tests 
	// einmal für CompiuterPlayer und dann für xy falsches Zeug
	// da müsste eine Exception fliegen
	
	
}
