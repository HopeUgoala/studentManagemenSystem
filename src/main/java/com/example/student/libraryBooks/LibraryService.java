package com.example.student.libraryBooks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibraryService {

    private final LibraryRepository libraryRepository;

    @Autowired
    public LibraryService(LibraryRepository libraryRepository) {
        this.libraryRepository = libraryRepository;
    }

    public List<LibraryBooks> getBooks() {
        return libraryRepository.findAll();
    }

    public void addNewBook(LibraryBooks libraryBooks) {
        Optional<LibraryBooks> libraryOptional= libraryRepository.findLibraryBooksByName(libraryBooks.getName());

        if (libraryOptional.isPresent()){
            throw new IllegalStateException("Book exist");

        }
        libraryRepository.save(libraryBooks);
    }

    public void deleteBook(Long bookId){
        boolean exits = libraryRepository.existsById(bookId);

        if(!exits) {
            throw new IllegalStateException("Library with id " +bookId +"does not exist");
        }
        libraryRepository.deleteById(bookId);
    }

    public void changeBook(LibraryBooks libraryBooks) {
        libraryRepository.save(libraryBooks);
    }
}
