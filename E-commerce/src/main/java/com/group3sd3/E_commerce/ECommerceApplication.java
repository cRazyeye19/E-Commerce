package com.group3sd3.E_commerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.group3sd3.foobar.Welcome;

@SpringBootApplication
public class ECommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ECommerceApplication.class, args);

		var welcomeMessage = new Welcome();
		System.out.println(welcomeMessage.welcomeMessage());
	}
}