package com.digital_library.Digital_Library_Project1.book.dto.response;

import jakarta.persistence.Column;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BookResponse {

    String title;

    String category;

    String author;

    LocalDate publishedYear;

    Double price;

    String language;

}
