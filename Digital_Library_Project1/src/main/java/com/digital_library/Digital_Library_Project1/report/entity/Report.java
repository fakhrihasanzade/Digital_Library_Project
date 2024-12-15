package com.digital_library.Digital_Library_Project1.report.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Entity
@Table(name = "report")
@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Report {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column(name="total_fine_amount",nullable = false)
    Double fkTotalFineAmount;

    @Column(name="total_sale_price",nullable = false)
    Double fkTotalSalePrice;

    @Column(name="date",nullable = false)
    LocalDate date;

}
