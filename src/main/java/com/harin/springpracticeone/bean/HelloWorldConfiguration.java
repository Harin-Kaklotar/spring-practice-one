package com.harin.springpracticeone.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "Hello world!";
	}

	
	@Bean
	public int age() {
		return 10;
	}
	
	@Bean
	public Person person() {
		return new Person("Harin", 16);
	}
	
	@Bean
	public Address address() {
		return new Address("Andheri", "Mumbai");
	}
}

record Person(String name, int age) {};
record Address(String firstLine, String city) {};
