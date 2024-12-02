package com.digital_library.Digital_Library_Project1.book.service;

import com.digital_library.Digital_Library_Project1.book.dto.response.BookResponse;
import java.util.List;

public interface BookServiceForUser {

    List<BookResponse> getAll();

    List<BookResponse> getByCategory(String category);

    List<BookResponse> getByLanguage(String language);

    List<BookResponse> getByAuthor(String author);

    List<BookResponse> getByPriceBound(Double price1, Double price2);

}
