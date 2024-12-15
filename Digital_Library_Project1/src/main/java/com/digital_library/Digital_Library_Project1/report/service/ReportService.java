package com.digital_library.Digital_Library_Project1.report.service;

import com.digital_library.Digital_Library_Project1.report.dto.ReportResponseDto;

import java.time.LocalDate;

public interface ReportService {

    ReportResponseDto dailyReport(LocalDate date);

}
