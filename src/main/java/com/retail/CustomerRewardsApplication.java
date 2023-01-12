package com.retail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({ "model", "service" })
public class CustomerRewardsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerRewardsApplication.class, args);
	}

}