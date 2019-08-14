package com.demospring.xavierkress.spring_initializr.bootstrap;

import com.demospring.xavierkress.spring_initializr.model.Author;
import com.demospring.xavierkress.spring_initializr.model.Book;
import com.demospring.xavierkress.spring_initializr.repositories.AuthorRepository;
import com.demospring.xavierkress.spring_initializr.repositories.BookRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    private void initData() {
        Author xavier = new Author("Xavier", "KRESS");
        Book myBook = new Book("My Book", "1234", "publisherA");
        myBook.getAuthors().add(xavier);

        authorRepository.save(xavier);
        bookRepository.save(myBook);

        Author victoria = new Author("Victoria", "KRESS");
        Book myBook2 = new Book("Her Book", "1234", "publisherA");
        myBook2.getAuthors().add(victoria);

        authorRepository.save(victoria);
        bookRepository.save(myBook2);


    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }
}
