package com.snake.ladder;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TwoPlayer {
	private static final Logger logger = LogManager.getLogger(TwoPlayer.class);

	void playGame(Player p1, Player p2) {
		while (p1.getPlayerPosition() < 100 && p2.getPlayerPosition() < 100) {
			System.out.println("1st player's turn :");
			p1.play(p1);
			/*while (p1.options == 1) {
				p1.play(p1);
			}*/
			logger.info("player position :" + p1.getPlayerPosition());

			logger.info("2st player's turn");
			p2.play(p2);
			/*while (p2.options == 1) {
				p2.play(p2);
			}*/
			logger.info("player position :" + p2.getPlayerPosition());
		}
		logger.info("1 Total player position :" + p1.getPlayerPosition());
		logger.info("2 Total player position :" + p2.getPlayerPosition());
		if (p1.getPlayerPosition() > p2.getPlayerPosition()) {
			logger.info("1st Player is Winner");
		} else {
			logger.info("2nd Player is Winner");
		}
	}

}
