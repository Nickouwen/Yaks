package com.restrezos.restrezos;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.restrezos.restrezos.restaurant.Restaurant;

@SpringBootApplication
public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		log.info("Application started successfully");
	}

	@Bean
	CommandLineRunner runner() {
		return args -> {
			Restaurant restaurant = new Restaurant(1, "Restaurant 1", "Description 1", 10);
			log.info("Restaurant: " + restaurant);
		};
	}

}
