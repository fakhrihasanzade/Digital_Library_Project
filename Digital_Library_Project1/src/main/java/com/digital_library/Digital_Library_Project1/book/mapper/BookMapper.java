package com.digital_library.Digital_Library_Project1.book.mapper;

import com.digital_library.Digital_Library_Project1.book.dto.request.BookRequest;
import com.digital_library.Digital_Library_Project1.book.dto.response.BookResponse;
import com.digital_library.Digital_Library_Project1.book.entity.Book;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookMapper {

    BookResponse toDto(Book book);

    Book toEntity(BookRequest dto);

}
