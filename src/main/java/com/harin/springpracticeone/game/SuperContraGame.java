package com.harin.springpracticeone.game;

public class SuperContraGame implements GamingConsole{
	public void up() {
		System.out.println("SuperContra Jump");
	}

	public void down() {
		System.out.println("SuperContra sit down");
	}
	
	public void left() {
		System.out.println("SuperContra stop");
	}
	
	public void right() {
		System.out.println("SuperContra shoot bullet");
	}
}
