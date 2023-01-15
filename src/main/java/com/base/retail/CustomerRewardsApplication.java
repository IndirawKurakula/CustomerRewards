package com.base.retail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
@EnableJpaRepositories("com.base")

public class CustomerRewardsApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(CustomerRewardsApplication.class, args);
	}

}