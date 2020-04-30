package com.feeassignment.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(exclude = {HibernateJpaAutoConfiguration.class})
public class FeeAppApplication {
	
	private static final Logger logger = LoggerFactory.getLogger(FeeAppApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(FeeAppApplication.class, args);
	}

}
