package com.harin.springpracticeone.bean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloWorldSpring {

	public static void main(String[] args) {
		
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));
		System.out.println(context.getBean("person"));
		System.out.println(context.getBean("address"));
		
		System.out.println(context.getBean("CustomNameAddress"));
		System.out.println(context.getBean("personByMethod"));
		System.out.println(context.getBean("personByParameter"));
		System.out.println(context.getBean("student"));
		System.out.println(context.getBean("student2"));
		//System.out.println(context.getBean(Student.class));
	}

}
