package com.digital_library.Digital_Library_Project1.punishment.dto;

import jakarta.persistence.Column;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;


@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
public class PunishmentRequest {

    String userId;

    String bookId;

    Double price;

    LocalDate startDate;

    String reason;

    String status;

}
