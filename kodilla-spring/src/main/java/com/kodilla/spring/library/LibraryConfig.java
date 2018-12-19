package com.kodilla.spring.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LibraryConfig {

    @Autowired
    private LibraryDbController libraryDbController;

    @Bean
    public Library library() {
        return new Library(libraryDbController);
    }

    @Bean
    public LibraryDbController libraryDbController() {
        return new LibraryDbController();
    }

}
