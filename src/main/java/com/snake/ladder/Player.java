package com.snake.ladder;

import java.util.Random;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Player {
	private static final Logger logger = LogManager.getLogger(Player.class);
	private int playerPosition;
	int count = 0;
	int dia;
	int options;

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
		count++;
		return random.nextInt(6) + 1;
	}

	public int SnakeLadderBoard(int dieValue) {
		int dice = 0;
		options = random.nextInt(3) + 1;
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

	public void play(Player player) {

		int dieValue = diceRoll();
		count++;
		logger.info("Dice value :" + dieValue);
		dia = SnakeLadderBoard(dieValue);
		playerPosition = playerPosition + dia;
		if (playerPosition < 0) {
			playerPosition = 0;
		}
		if (player.getPlayerPosition() > 100) {
			player.setPlayerPosition(playerPosition - dia);
		}
		player.setPlayerPosition(playerPosition);
		logger.info("position after every die role :" + player.getPlayerPosition());
	}

}