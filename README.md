# SpringBoot Training

This is just a project build by Spring Initializr with 
- Spring Boot DevTools
- Sprint Web Starter
- Tymeleaf
- Spring Data JPA
 -H2 DB 
 - Spring Boot Actuator
 
 
 ## What we have done
 
 - We created a new project using Spring initializr (1.0.0)
 - We created two classes (2.0.0)
 - We made the mapping with JPA using annotations 
    - @Entity
    - @id
    - @GeneratedValue(strategy = GenerationType.AUTO)
    - @ManyToMany
- We activated h2 console in the application.properties using spring.h2.console.enabled=true
- We launched the application and connected to the console at localhot:8080/h2-console (URL : jdbc:h2:mem:testdb)
- We saw that hibernate created two tables and two relationship tables 
- We broke that problem by adding mapping information using annotations (2.0.1)
- We added two crud repositories interfaces for our model classes and added a bootstrap class to inject data at application launch (using component annotation and 
onApplicationEvent method with contextRefreshEvent object parameter) (2.1.0)
- We added a new Publisher class with a OneToMany relation on Books  (exercice) (2.2.0)
- We added an MVC structure to display books in a HTML page (2.3.0)
- We added a new Authors list (exercice) (2.4.0)