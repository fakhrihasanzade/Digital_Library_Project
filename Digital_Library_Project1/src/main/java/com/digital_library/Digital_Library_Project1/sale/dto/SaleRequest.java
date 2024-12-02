package com.digital_library.Digital_Library_Project1.sale.dto;


import lombok.*;
import lombok.experimental.FieldDefaults;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SaleRequest {

    String fkBookId;

    String fkUserId;

    String fkSalesmanId;

    String fkPaymentId;

    LocalDateTime saleDate;

    Long count;

    Double price;

    Double discount;

    Double totalPrice;

}
