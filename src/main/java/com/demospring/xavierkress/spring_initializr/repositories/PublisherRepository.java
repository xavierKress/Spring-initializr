package com.demospring.xavierkress.spring_initializr.repositories;

import com.demospring.xavierkress.spring_initializr.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
