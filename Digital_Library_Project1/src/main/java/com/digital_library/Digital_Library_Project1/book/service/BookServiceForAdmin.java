package com.digital_library.Digital_Library_Project1.book.service;

import com.digital_library.Digital_Library_Project1.book.dto.request.BookRequest;
import com.digital_library.Digital_Library_Project1.book.entity.Book;

import java.util.List;

public interface BookServiceForAdmin {

    List<Book> getAll();

    List<Book> getByLanguage(String language);

    List<Book> getByAuthor(String author);

    List<Book> getByCategory(String category);

    List<Book> getByPriceBound(Double price1, Double price2);

    Book getById(Long id);

    void create(BookRequest book);

    void updateById(Long id, BookRequest book);

    void deleteById(Long id);

}
