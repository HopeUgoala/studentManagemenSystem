package com.example.student.libraryBooks;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class LibraryBooks {

    @Id
    @SequenceGenerator(
            name = "library_sequence",
            sequenceName = "library_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "library_sequence"
    )
    private Long id;
    private String name;
    private LocalDate date;
    private String depart;
    private String email;
    private String book;

    public LibraryBooks() {
    }

    public LibraryBooks(String name,
                        LocalDate date,
                        String depart,
                        String email,
                        String book) {
        this.name = name;
        this.date = date;
        this.depart = depart;
        this.email = email;
        this.book = book;
    }

    public LibraryBooks(Long id,
                        String name,
                        LocalDate date,
                        String depart,
                        String email,
                        String book) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.depart = depart;
        this.email = email;
        this.book = book;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "LibraryBooks{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date=" + date +
                ", depart='" + depart + '\'' +
                ", email='" + email + '\'' +
                ", book='" + book + '\'' +
                '}';
    }

    }
