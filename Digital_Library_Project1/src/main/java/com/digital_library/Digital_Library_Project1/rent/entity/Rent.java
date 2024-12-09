package com.digital_library.Digital_Library_Project1.rent.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="rent")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Rent {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column(name = "book_id", nullable = false)
    String bookId;

    @Column(name = "user_id", nullable = false)
    String userId;

    @Column(name = "fine_amount", nullable = false)
    Double fineAmount;

    @Column(name = "start_date")
    LocalDate startDate;

    @Column(name = "return_date", nullable = false)
    LocalDate returnDate;

}
