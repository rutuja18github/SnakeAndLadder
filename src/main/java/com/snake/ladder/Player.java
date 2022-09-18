package com.snake.ladder;

import java.util.Random;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Player {

	private static final Logger logger = LogManager.getLogger(App.class);
	private int playerPosition;
	int dice = 0;

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

	public int diceRoll() {
		return random.nextInt(6) + 1;
	}

	public void SnakeLadderBoard() {
		int dieValue = diceRoll();
		int options = random.nextInt(3) + 1;
		switch (options) {
		case 1:
			logger.info("Ladder");
			dice = dice + dieValue;
			break;
		case 2:
			logger.info("Snake");
			dice = dice - dieValue;
			break;
		case 3:
			logger.info("No Play");
			dice = 0;
			break;
		}

		logger.info("After chacking Condition how many position player have to move :" + dice);

	}
}