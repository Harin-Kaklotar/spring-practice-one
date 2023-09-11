package com.harin.springpracticeone.game;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GameConfiguration {

	@Bean
	public GamingConsole game() {
		return new PackManGame();
	}

	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		return new GameRunner(game);
	}
}
