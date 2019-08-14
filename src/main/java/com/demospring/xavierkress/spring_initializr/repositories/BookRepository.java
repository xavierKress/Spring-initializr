package com.demospring.xavierkress.spring_initializr.repositories;

import com.demospring.xavierkress.spring_initializr.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
