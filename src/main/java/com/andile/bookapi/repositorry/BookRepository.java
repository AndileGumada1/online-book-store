package com.andile.bookapi.repositorry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.andile.bookapi.entities.Book;

@CrossOrigin("*")
public interface BookRepository  extends JpaRepository<Book, Long>{


}
