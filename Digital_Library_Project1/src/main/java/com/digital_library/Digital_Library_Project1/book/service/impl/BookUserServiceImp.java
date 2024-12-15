package com.digital_library.Digital_Library_Project1.book.service.impl;

import com.digital_library.Digital_Library_Project1.book.dto.response.BookResponse;
import com.digital_library.Digital_Library_Project1.book.mapper.BookMapper;
import com.digital_library.Digital_Library_Project1.book.repository.BookRepository;
import com.digital_library.Digital_Library_Project1.book.service.BookServiceForUser;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookUserServiceImp implements BookServiceForUser {

    private final BookRepository repository;

    private final BookMapper mapper;

    @Override
    public List<BookResponse> getAll() {
        return repository.findAll().stream().map(mapper::toDto).toList();
    }

    @Override
    public List<BookResponse> getByCategory(String category) {
        return repository.findAll().stream()
                .filter(book -> book.getCategory().contains(category))
                .map(mapper::toDto).toList();
    }

    @Override
    public List<BookResponse> getByLanguage(String language) {
        return repository.findAll().stream()
                .filter(b -> b.getLanguage().contains(language))
                .map(mapper::toDto).toList();
    }

    @Override
    public List<BookResponse> getByAuthor(String author) {
        return repository.findAll().stream()
                .filter(b -> b.getAuthor().contains(author))
                .map(mapper::toDto).toList();
    }

    @Override
    public List<BookResponse> getByPriceBound(Double price1, Double price2) {
        return repository.findAll().stream()
                .filter(b -> b.getPrice() > price1 && b.getPrice() < price2)
                .map(mapper::toDto).toList();
    }
}
