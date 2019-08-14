# Spring-initializr

This is just a project build by Spring Initializr with 
- Spring Boot DevTools
- Sprint Web Starter
- Tymeleaf
- Spring Data JPA
 -H2 DB 
 - Spring Boot Actuator
 
 
 ## What we have done
 
 - We created two classes
 - We made the mapping with JPA using annotations
    - @Entity
    - @id
    - @GeneratedValue(strategy = GenerationType.AUTO)
    - @ManyToMany
- We activated h2 console in the application.properties using spring.h2.console.enabled=true
- We launched the application and connected to the console at localhot:8080/h2-console (URL : jdbc:h2:mem:testdb)
- We saw that hibernate created two tables and two relationship tables
- We broke that problem by adding mapping information using annotations
- We added two crud repositories interfaces for our model classes and added a bootstrap class to inject data at application launch (using component annotation and 
onApplicationEvent method with contextRefreshEvent object parameter)
- We added a new Publisher class with a OneToMany relation on Books