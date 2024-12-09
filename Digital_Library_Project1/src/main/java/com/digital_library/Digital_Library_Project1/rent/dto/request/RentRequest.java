package com.digital_library.Digital_Library_Project1.rent.dto.request;

import jakarta.persistence.Column;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;


@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
public class RentRequest {

    String bookId;

    String userId;

    Double fineAmount;

    LocalDate startDate;

    LocalDate returnDate;

}
