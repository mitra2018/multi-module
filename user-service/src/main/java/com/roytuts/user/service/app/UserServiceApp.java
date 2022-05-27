package com.demo.user.service.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.demo")
public class UserServiceApp {

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApp.class, args);
	}

}
