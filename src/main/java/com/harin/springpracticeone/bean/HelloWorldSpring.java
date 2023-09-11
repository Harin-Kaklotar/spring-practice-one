package com.harin.springpracticeone.bean;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloWorldSpring {

	public static void main(String[] args) {
		
		try (var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
			System.out.println(context.getBean("name"));
			System.out.println(context.getBean("age"));
			System.out.println(context.getBean("person"));
			System.out.println(context.getBean("address"));
			
			System.out.println(context.getBean("CustomNameAddress"));
			System.out.println(context.getBean("personByMethod"));
			System.out.println(context.getBean("personByParameter"));
			System.out.println(context.getBean("student"));
			System.out.println(context.getBean("student2"));
			System.out.println(context.getBean(Person.class));
			System.out.println(context.getBean(Address.class));
			System.out.println(context.getBean(Student.class));
			System.out.println(context.getBean("primaryStudentByQualifire"));
			
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		} catch (BeansException e) {
			e.printStackTrace();
		}
		
	}

}
