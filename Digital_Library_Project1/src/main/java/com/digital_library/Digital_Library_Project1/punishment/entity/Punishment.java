package com.digital_library.Digital_Library_Project1.punishment.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "punishments")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Punishment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column(name = "user_id",nullable = false)
    String userId;

    @Column(name = "book_id",nullable = false)
    String bookId;

    @Column(name = "price",nullable = false)
    Double price;

    @Column(name = "start_date",nullable = false)
    LocalDate startDate;

    @Column(name = "reason",nullable = false)
    String reason;

    @Column(name = "status",nullable = false)
    String status;
}
