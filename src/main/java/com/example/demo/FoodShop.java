package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class FoodShop {

	public static void main(String[] args) {
		SpringApplication.run(FoodShop.class, args);
	}

}
