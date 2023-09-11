package com.harin.springpracticeone.game;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppGameSpringDemo {

	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(GameConfiguration.class)) {
			System.out.println();
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
		} catch (BeansException e) {
			e.printStackTrace();
		}
	}

}
