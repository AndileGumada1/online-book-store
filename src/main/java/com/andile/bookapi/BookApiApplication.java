package com.andile.bookapi;


import org.flywaydb.core.Flyway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookApiApplication.class, args);
		
		// Create the Flyway instance and point it to the database
		Flyway flyway = Flyway.configure().dataSource("jdbc:mysql://localhost:3306/online_book_db", "root", "root").load();
		
		// Start the migration
		flyway.migrate();
	}
}
