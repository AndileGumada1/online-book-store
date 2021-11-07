package com.andile.bookapi;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.andile.bookapi.entities.Book;
import com.andile.bookapi.entities.BookCategory;
import com.andile.bookapi.repositorry.BookCategoryRepository;
import com.andile.bookapi.repositorry.BookRepository;

@Service
public class DataFilerService {
	
	private final BookRepository bookRepository;
	private final BookCategoryRepository bookCategoryRepository;
	
	public DataFilerService(BookRepository bookRepository, BookCategoryRepository bookCategoryRepository) {
		this.bookCategoryRepository = bookCategoryRepository;
		this.bookRepository = bookRepository;
	}
	//bootstrap some data into the database
	@PostConstruct
	@Transactional
	public void fillData() {
	
		BookCategory progromming1 = new BookCategory(1,"Programming",new ArrayList<Book>());
		BookCategory programming2 = new BookCategory(2,"Programming",new ArrayList<Book>());
		BookCategory programming3 = new BookCategory(3,"Programming",new ArrayList<Book>());
		BookCategory programming4 = new BookCategory(4,"Programming",new ArrayList<Book>());
		BookCategory programming5 = new BookCategory(5,"Programming",new ArrayList<Book>());
		BookCategory programming6 = new BookCategory(6,"Programming",new ArrayList<Book>());
		BookCategory programming7 = new BookCategory(7,"Programming",new ArrayList<Book>());
		BookCategory programming8 = new BookCategory(8,"Programming",new ArrayList<Book>());
		BookCategory programming9 = new BookCategory(9,"Programming",new ArrayList<Book>());
		BookCategory programming10 = new BookCategory(10,"Programming",new ArrayList<Book>());
		

		
		bookCategoryRepository.save(progromming1);
		bookCategoryRepository.save(programming2);
		bookCategoryRepository.save(programming3);
		bookCategoryRepository.save(programming4);
		bookCategoryRepository.save(programming5);
		bookCategoryRepository.save(programming6);
		bookCategoryRepository.save(programming7);
		bookCategoryRepository.save(programming8);
		bookCategoryRepository.save(programming9);
		bookCategoryRepository.save(programming10);
		
		Book java = new Book(
				(long) 1,"text-100","Java Programming Language",
				   "Master Core Java basics",
				   754,
				   "assets/images/books/text-106.jpg",
				  true, 300,LocalDateTime.now(), null,	progromming1
		);
		Book kotlin = new Book(
				(long) 2,"text-101","Kotlin Programming Language",
				   "Learn Kotlin Programming Language",
				   829,
				   "assets/images/books/text-102.jpg",
				  true, 300,LocalDateTime.now(), null,	programming2
		);
		Book python = new Book(
				(long) 3,"text-102","Python 9",
				   "Learn Python Language",
				   240,
				   "assets/images/books/text-103.jpg",
				  true, 300,LocalDateTime.now(), null,	programming3
		);
		Book cShap = new Book(
				(long) 4,"text-103","C#",
				   "Learn C# Programming Language",
				   490,
				   "assets/images/books/text-101.jpg",
				  true, 300,LocalDateTime.now(), null,	programming4
		);
		Book cpp = new Book(
				(long) 5,"text-104","C++",
				   "Learn C++ Language",
				   830,
				   "assets/images/books/text-110.jpg",
				  true, 300,LocalDateTime.now(), null,	programming5
		);
		Book dataStru = new Book(
				(long) 6,"text-105","Data Structure 3",
				   "Learn Data Structures",
				   560,
				   "assets/images/books/text-106.jpg",
				  true, 300,LocalDateTime.now(), null,	programming6
		);
		Book cprog = new Book(
				(long) 7,"text-106","C Programming",
				   "Learn C Language",
				   695,
				   "assets/images/books/text-100.jpg",
				  true, 300,LocalDateTime.now(), null,	programming7
		);
		Book crushInterview = new Book(
				(long) 3,"text-102","Coding Interview",
				   "Crushing the Coding interview",
				   600,
				   "assets/images/books/text-103.jpg",
				  true, 300,LocalDateTime.now(), null,	programming8
		);
		Book desing = new Book(
				(long) 859,"text-102","Design Parttens",
				   "Learn Python Language",
				   690,
				   "assets/images/books/text-105.jpg",
				  true, 300,LocalDateTime.now(), null,	programming9
		);
		Book machineLearn = new Book(
				(long) 9,"text-102","Python 3",
				   "Learn Python Machine Learning with Python",
				   416,
				   "assets/images/books/text-107.jpg",
				  true, 300,LocalDateTime.now(), null,	programming10
		);
		Book apiJava = new Book(
				(long) 10,"text-102","Practical API Design",
				   "Java Framework Architect",
				   540,
				   "assets/images/books/text-108.jpg",
				  true, 300,LocalDateTime.now(), null,	programming8
		);
	bookRepository.save(java);
	bookRepository.save(kotlin);
	bookRepository.save(python);
	bookRepository.save(cpp);
	bookRepository.save(cprog);
	bookRepository.save(crushInterview);
	bookRepository.save(cShap);
	bookRepository.save(dataStru);
	bookRepository.save(desing);
	bookRepository.save(machineLearn);
	bookRepository.save(apiJava);

	}
}
