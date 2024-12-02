package com.digital_library.Digital_Library_Project1.book.controller;

import com.digital_library.Digital_Library_Project1.book.dto.request.BookRequest;
import com.digital_library.Digital_Library_Project1.book.entity.Book;
import com.digital_library.Digital_Library_Project1.book.service.BookServiceForAdmin;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/admin/books")
public class BookAdminController {

    private final BookServiceForAdmin service;

    @GetMapping("/All")
    public List<Book> getAll() {
        return service.getAll();
    }

    @GetMapping("/id/{id}")
    public Book getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @GetMapping("/lang/{language}")
    public List<Book> getByLanguage(@PathVariable String language) {
        return service.getByLanguage(language);
    }

    @GetMapping("/author/{author}")
    public List<Book> getByAuthor(@PathVariable String author) {
        return service.getByAuthor(author);
    }

    @GetMapping("/category/{category}")
    public List<Book> getByCategory(@PathVariable String category) {
        return service.getByCategory(category);
    }

    @GetMapping("/price-bound/{price1}/{price2}")
    public List<Book> getByPriceBound(@PathVariable Double price1, @PathVariable Double price2){
        return service.getByPriceBound(price1,price2);
    }

    @PostMapping("/create")
    public void create(@RequestBody BookRequest book){
        service.create(book);
    }

    @PutMapping("update/{id}")
    public void updateById(@PathVariable Long id, @RequestBody BookRequest book){
        service.updateById(id,book);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        service.deleteById(id);
    }

}
