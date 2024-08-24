package com.restrezos.restrezos;

import java.sql.Timestamp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.restrezos.restrezos.reservation.Reservation;
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
			Reservation reservation = new Reservation(1, new Timestamp(0), new Timestamp(0), 1, 1, 1);
			log.info("Restaurant: " + reservation);
		};
	}

}
