package com.digital_library.Digital_Library_Project1.book.repository;

import com.digital_library.Digital_Library_Project1.book.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
