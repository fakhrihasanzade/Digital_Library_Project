package com.digital_library.Digital_Library_Project1.sale.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "sales")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Sale {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column(name = "book_id", nullable = false)
    String fkBookId;

    @Column(name = "user_id", nullable = false)
    String fkUserId;

    @Column(name = "salesman_id", nullable = false)
    String fkSalesmanId;

    @Column(name = "payment_id", nullable = false)
    String fkPaymentId;

    @Column(name = "sale_date", nullable = false)
    LocalDateTime saleDate;

    @Column(name = "count", nullable = false)
    Long count;

    @Column(name = "price", nullable = false)
    Double price;

    @Column(name = "discount", nullable = false)
    Double discount;

    @Column(name = "tottal_price", nullable = false)
    Double totalPrice;

}
