package com.snake.ladder;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TwoPlayer {
	private static final Logger logger = LogManager.getLogger(TwoPlayer.class);
    int count=0;
	void playGame(Player p1, Player p2) {
		while (p1.getPlayerPosition() < 100 && p2.getPlayerPosition() < 100) {
			count++;
			logger.info("1st player's turn :");
			p1.play(p1);
			while (p1.options == 1) {
				logger.info("Play again");
				p1.play(p1);
			}
			logger.info("player position :" + p1.getPlayerPosition());

			logger.info("2st player's turn");
			p2.play(p2);
			while (p2.options == 1) {
				logger.info("Play again");
				p2.play(p2);
			}
			logger.info("player position :" + p2.getPlayerPosition());
		}
		logger.info("1st Total player position :" + p1.getPlayerPosition());
		logger.info("2nd Total player position :" + p2.getPlayerPosition());
		logger.info("count :" + count);
		if (p1.getPlayerPosition() > p2.getPlayerPosition()) {
			logger.info("1st Player is Winner");
		} else {
			logger.info("2nd Player is Winner");
		}
	}

}
