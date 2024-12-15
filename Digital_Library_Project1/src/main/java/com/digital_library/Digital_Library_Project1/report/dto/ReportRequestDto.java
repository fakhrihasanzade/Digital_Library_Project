package com.digital_library.Digital_Library_Project1.report.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ReportRequestDto {

    Double fkTotalFineAmount;

    Double fkTotalSalePrice;

    LocalDate date;

}
