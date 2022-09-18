package com.snake.ladder;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App {
	private static final Logger logger = LogManager.getLogger(App.class);

	public static void main(String[] args) {
		logger.info("Welcome to Snake and Ladder Game");
		Player playObj = new Player();
		Player playObj1 = new Player();
		logger.info("Player's initial position is :" + playObj.getPlayerPosition());
		logger.info("Player's initial position is :" + playObj1.getPlayerPosition());
		TwoPlayer g = new TwoPlayer();
		g.playGame(playObj, playObj1);

	}
}
