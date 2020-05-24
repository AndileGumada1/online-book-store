package com.andile.bookapi;

import java.util.stream.Stream;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.andile.bookapi.entities.Book;
import com.andile.bookapi.repositorry.BookRepository;

@SpringBootApplication
@EnableJpaRepositories
public class BookApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookApiApplication.class, args);
	}
	   // Bootstrap some test data into the in-memory database
//    @Bean  
//    ApplicationRunner init(BookRepository repository) {  
//        return args -> {  
//            Stream.of("Java SE8", "C Programming Language", "Angular 8 basics", "Spring Boot", "GoLang").forEach(name -> {  
//                    Book book = new Book(); 
//                    book.setId((long) 1);
//                    book.setName(name); 
//                    book.setActive(false);
//                    book.setCategory("Programming");
//                    book.setDescription("Learn Java Basic concerpt");
//                    book.setImageUrl("");
//                    book.setSku("");
//                    book.setUnitPrice(540.00);
//                    book.setUnitsInStock(45);
//                    book.setCreatedOn(null);
//                    book.setUpdatedOn(null);
//                  
//                    repository.save(book);  
//            });  
//            repository.findAll().forEach(System.out::println);  
//        };  
//    } 
}
