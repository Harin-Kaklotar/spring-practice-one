package com.harin.springpracticeone.game;

public class AppGameDemo {

	public static void main(String[] args) {
		//var marioGame = new MarioGame();
		var superContraGame = new SuperContraGame();
		var gameRunner = new GameRunner(superContraGame);
		gameRunner.run();
	}

}
