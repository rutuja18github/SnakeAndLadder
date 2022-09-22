package com.snake.ladder;

import java.util.Random;

public class Test {
	
	Random random = new Random();
	
	
	public int diceRoll() {
		return random.nextInt(6) + 1;
	}

	public int SnakeLadderBoard(int dieValue) {
		int dice = 0;
		int options = random.nextInt(3) + 1;
		switch (options) {
		case 1:
			System.out.println("Ladder");
			dice = dice + dieValue;
			break;
		case 2:
			System.out.println("Snake");
			dice = dice - dieValue;
			break;
		case 3:
			System.out.println("No Play");
			dice = 0;
			break;
		}

		System.out.println("After chacking Condition how many position player have to move :" + dice);
		return dice;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
