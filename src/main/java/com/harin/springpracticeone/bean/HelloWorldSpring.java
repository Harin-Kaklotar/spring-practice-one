package com.harin.springpracticeone.bean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloWorldSpring {

	public static void main(String[] args) {
		
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		System.out.println(context.getBean("name"));
	}

}
