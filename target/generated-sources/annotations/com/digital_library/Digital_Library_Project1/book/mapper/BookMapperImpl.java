package com.digital_library.Digital_Library_Project1.book.mapper;

import com.digital_library.Digital_Library_Project1.book.dto.request.BookRequest;
import com.digital_library.Digital_Library_Project1.book.dto.response.BookResponse;
import com.digital_library.Digital_Library_Project1.book.entity.Book;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-12-09T01:33:02+0400",
    comments = "version: 1.6.3, compiler: javac, environment: Java 23.0.1 (Oracle Corporation)"
)
@Component
public class BookMapperImpl implements BookMapper {

    @Override
    public BookResponse toDto(Book book) {
        if ( book == null ) {
            return null;
        }

        BookResponse.BookResponseBuilder bookResponse = BookResponse.builder();

        bookResponse.title( book.getTitle() );
        bookResponse.category( book.getCategory() );
        bookResponse.author( book.getAuthor() );
        bookResponse.publishedYear( book.getPublishedYear() );
        bookResponse.price( book.getPrice() );
        bookResponse.language( book.getLanguage() );

        return bookResponse.build();
    }

    @Override
    public Book toEntity(BookRequest dto) {
        if ( dto == null ) {
            return null;
        }

        Book.BookBuilder book = Book.builder();

        book.title( dto.getTitle() );
        book.category( dto.getCategory() );
        book.author( dto.getAuthor() );
        book.publishedYear( dto.getPublishedYear() );
        book.count( dto.getCount() );
        book.price( dto.getPrice() );
        book.language( dto.getLanguage() );

        return book.build();
    }
}
