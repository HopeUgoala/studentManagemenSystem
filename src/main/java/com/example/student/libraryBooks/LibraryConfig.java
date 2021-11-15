package com.example.student.libraryBooks;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class LibraryConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            LibraryRepository repository){
        return args -> {

            LibraryBooks mariam = new LibraryBooks(
                            "Mariam Ugoala",
                            LocalDate.of(2001, AUGUST, 5),
                            "Computer Science",
                            "mariam.ugoala@gmail.com",
                            "Machine Learning by J.K philip"
                    );

            LibraryBooks paul = new LibraryBooks(
                            "Paul Ugoala",
                            LocalDate.of(2008, AUGUST, 8),
                            "Computer Science",
                            "paul.ugoala@gmail.com",
                            "Essential Java by O.S wilbert"
            );
            LibraryBooks tomek = new LibraryBooks(
                    "Tomek Ugoala",
                    LocalDate.of(2008, AUGUST, 8),
                    "Biomedical Science",
                    "tomek.ugoala@gmail.com",
                    "Essential Java by O.S wilbert"
            );
            repository.saveAll(
                    List.of(mariam, paul,tomek)
            );
        };
    }
}
