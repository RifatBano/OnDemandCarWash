package com.cg.casestudy.carwash;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.cg.casestudy.carwash")
@SpringBootApplication
public class CarwashApplication{

	public static void main(String[] args) {
		SpringApplication.run(CarwashApplication.class, args);
		System.out.println("hello");
	}

}
