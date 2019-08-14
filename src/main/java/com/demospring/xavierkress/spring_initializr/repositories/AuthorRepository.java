package com.demospring.xavierkress.spring_initializr.repositories;

import com.demospring.xavierkress.spring_initializr.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
