package com.digital_library.Digital_Library_Project1.report.controller;

import com.digital_library.Digital_Library_Project1.report.dto.ReportResponseDto;
import com.digital_library.Digital_Library_Project1.report.service.ReportService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequiredArgsConstructor
@RequestMapping("/admin/report")
public class ReportController {

    private final ReportService service;

    @GetMapping("/daily-report")
    public ReportResponseDto dailyReport(LocalDate date){
        return service.dailyReport(date);
    }

}
