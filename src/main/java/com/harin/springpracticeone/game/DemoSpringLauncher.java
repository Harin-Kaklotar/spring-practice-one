package com.harin.springpracticeone.game;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.harin.springpracticeone.game")
public class DemoSpringLauncher {

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(DemoSpringLauncher.class)) {
			context.getBean(GameRunner.class).run();
		} catch (BeansException e) {
			e.printStackTrace();
		}

	}

}
