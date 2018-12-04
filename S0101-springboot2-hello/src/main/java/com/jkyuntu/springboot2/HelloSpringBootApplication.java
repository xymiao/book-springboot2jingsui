package com.jkyuntu.springboot2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HelloSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringBootApplication.class, args);
	}

	@RequestMapping("hello")
	public String helloSpringBoot() {
		String  sayHi = "Hello Spring Boot !!!";
		return sayHi;
	}
	
	@RequestMapping("helloChange")
	public String helloSpringBootChange() {
		String  sayHi = "Hello Spring Boot Change !!!";
		return sayHi;
	}
}