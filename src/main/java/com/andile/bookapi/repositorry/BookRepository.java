package com.andile.bookapi.repositorry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.andile.bookapi.entities.Book;


public interface BookRepository  extends JpaRepository<Book, Long>{


}
