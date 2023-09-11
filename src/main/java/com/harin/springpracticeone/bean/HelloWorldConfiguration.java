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
	
	@Bean("CustomNameAddress")
	public Address customAdd() {
		return new Address("Katargam", "Surat");
	}
	
	@Bean
	public Person personByMethod() {
		return new Person(name(), age());
	}
	
	@Bean
	public Person personByParameter(String name, int age) {
		return new Person(name, age);
	}
	
	
	@Bean
	public Student student(String name, Address address) {
		return new Student(name, address);
	}
	
	@Bean Student student2() {
		return new Student("Jhon", new Address("Lixun", "london"));
	}
	
	@Bean Student mbaStudent() {
		return new Student(name(), address());
	}
}

record Person(String name, int age) {};
record Address(String firstLine, String city) {};
record Student(String name, Address address) {};
