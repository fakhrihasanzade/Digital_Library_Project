package com.digital_library.Digital_Library_Project1.book.dto.request;

import jakarta.persistence.Column;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BookRequest {

    String title;

    String category;

    String author;

    LocalDate publishedYear;

    Integer count;

    Double price;

    String language;

}
