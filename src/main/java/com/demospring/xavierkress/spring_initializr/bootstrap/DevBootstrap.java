package com.demospring.xavierkress.spring_initializr.bootstrap;

import com.demospring.xavierkress.spring_initializr.model.Author;
import com.demospring.xavierkress.spring_initializr.model.Book;
import com.demospring.xavierkress.spring_initializr.model.Publisher;
import com.demospring.xavierkress.spring_initializr.repositories.AuthorRepository;
import com.demospring.xavierkress.spring_initializr.repositories.BookRepository;
import com.demospring.xavierkress.spring_initializr.repositories.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    private void initData() {
        Author xavier = new Author("Xavier", "KRESS");
        Publisher p1 = new Publisher("publisherA");
        Book myBook = new Book("My Book", "1234", p1);
        myBook.getAuthors().add(xavier);

        publisherRepository.save(p1);
        authorRepository.save(xavier);
        bookRepository.save(myBook);

        Author victoria = new Author("Victoria", "KRESS");

        Publisher p2 = new Publisher("publisherB");
        Book myBook2 = new Book("Her Book", "1234", p2);
        myBook2.getAuthors().add(victoria);

        publisherRepository.save(p2);
        authorRepository.save(victoria);
        bookRepository.save(myBook2);
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }
}
