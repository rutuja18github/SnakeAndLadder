package com.snake.ladder;

import java.util.Random;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Player {
	private static final Logger logger = LogManager.getLogger(App.class);
	private int playerPosition;
	int dice = 0;
	int count = 0;

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

	public int SnakeLadderBoard(int dieValue) {
		logger.info("Die Value"+dieValue);
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
		return dice;

	}

	public void play() {
		while (playerPosition < 100) {
			int dieValue = diceRoll();
			count++;
			logger.info("Dice value :" + dieValue);
			int dia = SnakeLadderBoard(dieValue);
			playerPosition = playerPosition + dia;
			if (playerPosition < 0) {
				playerPosition = 0;
			} else if (playerPosition > 100) {
				playerPosition = playerPosition - dia;
			}
			logger.info("position after every die role :" + playerPosition);
		}
		logger.info("Winning position :" + playerPosition);
		logger.info("Number of times dice was played to win game :" + count);
	}
}