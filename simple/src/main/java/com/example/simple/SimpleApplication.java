package com.example.simple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableOAuth2Sso
public class SimpleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleApplication.class, args);
	}
}
