package com.example.student.libraryBooks;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LibraryRepository
        extends JpaRepository<LibraryBooks, Long> {

    @Query("SELECT l FROM LibraryBooks l WHERE l.name =?1")
    Optional<LibraryBooks> findLibraryBooksByName(String name);

}
