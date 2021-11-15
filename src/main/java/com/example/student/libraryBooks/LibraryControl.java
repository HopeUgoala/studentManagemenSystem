package com.example.student.libraryBooks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path="/LibraryBooks")
public class LibraryControl {

    private final LibraryService libraryService;

    @Autowired
    public LibraryControl(LibraryService libraryService) {

        this.libraryService = libraryService;
    }

    @GetMapping
    public List<LibraryBooks> getBooks(){

        return libraryService.getBooks();
    }

    @PostMapping
    public void registerNewBooks(@RequestBody LibraryBooks libraryBooks){

        libraryService.addNewBook(libraryBooks);
    }

    @DeleteMapping(path = "{bookId}")
    public  void removeBooksFromList(@PathVariable("bookId") Long bookId){

        libraryService.deleteBook(bookId);
    }
    @PutMapping
    public void updateBooks(@RequestBody LibraryBooks libraryBooks){
        libraryService.changeBook(libraryBooks);
    }
}
