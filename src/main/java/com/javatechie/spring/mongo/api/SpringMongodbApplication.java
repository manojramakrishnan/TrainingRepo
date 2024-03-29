package com.javatechie.spring.mongo.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.javatechie.*")
public class SpringMongodbApplication {

	public static void main(String[] args) {
		System.out.println("hello");
		SpringApplication.run(SpringMongodbApplication.class, args);
	}
}
