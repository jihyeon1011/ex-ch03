package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.demo", "com.cjh.myform"})
public class Ch03Application {

	public static void main(String[] args) {
		SpringApplication.run(Ch03Application.class, args);
	}

}
