package com.digital_library.Digital_Library_Project1.report.service.impl;

import com.digital_library.Digital_Library_Project1.report.dto.ReportRequestDto;
import com.digital_library.Digital_Library_Project1.report.dto.ReportResponseDto;
import com.digital_library.Digital_Library_Project1.report.entity.Report;
import com.digital_library.Digital_Library_Project1.report.mapper.ReportMapper;
import com.digital_library.Digital_Library_Project1.report.repository.ReportRepository;
import com.digital_library.Digital_Library_Project1.report.service.ReportService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@RequiredArgsConstructor
public class ReportServiceImpl implements ReportService {

    private final ReportRepository repository;

    private final ReportMapper mapper;

    @Override
    public ReportResponseDto dailyReport(LocalDate date) {
        ReportRequestDto reportRequest=new ReportRequestDto();
        reportRequest.setFkTotalFineAmount(repository.findAllPunishmentPriceByDate(date));
        reportRequest.setFkTotalSalePrice(repository.findAllSalePriceByDate(date));
        reportRequest.setDate(date);
        Report report=mapper.toEntity(reportRequest);
        repository.save(report);
        return mapper.toDto(report);
    }
}
