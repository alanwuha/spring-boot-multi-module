package com.example.demo.customer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomerApplication {
	private static final Logger logger = LoggerFactory.getLogger(CustomerApplication.class);
	public static void main(String[] args) {
//		SpringApplication.run(CustomerApplication.class, args);
//		logger.info("CustomerApplication Started........");
		
		SpringApplication app = new SpringApplication(CustomerApplication.class);
		app.setBannerMode(Banner.Mode.OFF);
		app.run(args);
	}
}
