package com.snake.ladder;

import java.util.Random;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Player {

	private static final Logger logger = LogManager.getLogger(Player.class);
	private int playerPosition;
	int dieValue;

	Player() {
		playerPosition = 0;
	}

	Random random = new Random();

	public int getPlayerPosition() {
		return playerPosition;
	}

	public void setPlayerPosition(int playerPosition) {
		this.playerPosition = playerPosition;
	}

	public void diceRoll() {
		dieValue = random.nextInt(6) + 1;
		logger.info("After rolling die get value on die :" + dieValue);
	}

}