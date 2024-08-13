package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		// this creates the ioc container and runs the application
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		System.out.println("hello world");
		//	Alien al = new Alien();

		// Dependency Injection : Injecting the class object to the application
		Alien al = context.getBean(Alien.class);
		al.code();

	}

}
