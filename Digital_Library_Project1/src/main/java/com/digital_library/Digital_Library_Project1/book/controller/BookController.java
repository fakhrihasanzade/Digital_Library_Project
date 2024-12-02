package com.digital_library.Digital_Library_Project1.book.controller;

import com.digital_library.Digital_Library_Project1.book.dto.response.BookResponse;
import com.digital_library.Digital_Library_Project1.book.service.BookServiceForUser;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/user/books")
public class BookController {

    private final BookServiceForUser service;

    @GetMapping("/All")
    public List<BookResponse> getAll() {
        return service.getAll();
    }

    @GetMapping("/category/{category}")
    public List<BookResponse> getByCategory(@PathVariable String category) {
        return service.getByCategory(category);
    }

    @GetMapping("/language/{language}")
    public List<BookResponse> getByLanguage(@PathVariable String language) {
        return service.getByLanguage(language);
    }

    @GetMapping("/author/{author}")
    public List<BookResponse> getByAuthor(@PathVariable String author) {
        return service.getByAuthor(author);
    }

    @GetMapping("/price/{price1}/{price2}")
    public List<BookResponse> getByPriceBound(
            @PathVariable Double price1, @PathVariable Double price2) {
        return service.getByPriceBound(price1, price2);
    }

}
