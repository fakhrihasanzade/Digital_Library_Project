package com.digital_library.Digital_Library_Project1.rent.dto.response;

import jakarta.persistence.Column;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RentResponse {

    String bookName;

    String userName;

    Double fineAmount;

    LocalDate startDate;

    LocalDate returnDate;

}
