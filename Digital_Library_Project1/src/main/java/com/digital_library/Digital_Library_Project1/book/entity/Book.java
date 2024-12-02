package com.digital_library.Digital_Library_Project1.book.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column(nullable = false)
    String title;

    @Column(nullable = false)
    String category;

    @Column(nullable = false)
    String author;

    @Column(name = "published_year", nullable = false)
    LocalDate publishedYear;

    @Column(nullable = false)
    Integer count;

    @Column(nullable = false)
    Double price;

    @Column(nullable = false)
    String language;

}
