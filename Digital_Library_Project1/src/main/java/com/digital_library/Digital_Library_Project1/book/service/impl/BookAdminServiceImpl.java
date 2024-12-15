package com.digital_library.Digital_Library_Project1.book.service.impl;

import com.digital_library.Digital_Library_Project1.book.dto.request.BookRequest;
import com.digital_library.Digital_Library_Project1.book.entity.Book;
import com.digital_library.Digital_Library_Project1.book.exception.subexception.BookNotFoundException;
import com.digital_library.Digital_Library_Project1.book.mapper.BookMapper;
import com.digital_library.Digital_Library_Project1.book.repository.BookRepository;
import com.digital_library.Digital_Library_Project1.book.service.BookServiceForAdmin;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BookAdminServiceImpl implements BookServiceForAdmin {

    private final BookRepository repository;

    private final BookMapper mapper;


    @Override
    public List<Book> getAll() {
        try {
            return repository.findAll();
        }catch (Exception ex){
            throw new BookNotFoundException("Book is not found");
        }
    }

    @Override
    public List<Book> getByLanguage(String language) {
        List<Book> books = new ArrayList<>();
        books = repository.findAll();
        return books.stream().filter(b -> b.getLanguage().contains(language)).toList();
    }

    @Override
    public List<Book> getByAuthor(String author) {
        List<Book> books = new ArrayList<>();
        books = repository.findAll();
        return books.stream().filter(b -> b.getAuthor().contains(author)).toList();
    }

    @Override
    public List<Book> getByCategory(String category) {
        List<Book> books = repository.findAll();
        return books.stream().filter(b -> b.getCategory().contains(category)).toList();
    }

    @Override
    public List<Book> getByPriceBound(Double price1, Double price2) {
        List<Book> books = repository.findAll();
        return books.stream()
                .filter(b -> b.getPrice() > price1 && b.getPrice() < price2).toList();
    }

    @Override
    public Book getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new BookNotFoundException("Book is not found"));
    }

    @Override
    public void create(BookRequest book) {
        repository.save(mapper.toEntity(book));
    }

    @Override
    public void updateById(Long id, BookRequest book) {
        Book findedBook = repository.findById(id)
                .orElseThrow(() -> new BookNotFoundException("Book is not found"));
        findedBook.setTitle(book.getTitle());
        findedBook.setAuthor(book.getAuthor());
        findedBook.setCategory(book.getCategory());
        findedBook.setCount(book.getCount());
        findedBook.setLanguage(book.getLanguage());
        findedBook.setPrice(book.getPrice());
        findedBook.setPublishedYear(book.getPublishedYear());
        repository.save(findedBook);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
