package com.digital_library.Digital_Library_Project1.report.mapper;

import com.digital_library.Digital_Library_Project1.report.dto.ReportRequestDto;
import com.digital_library.Digital_Library_Project1.report.dto.ReportResponseDto;
import com.digital_library.Digital_Library_Project1.report.entity.Report;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-12-10T23:00:25+0400",
    comments = "version: 1.6.3, compiler: javac, environment: Java 23.0.1 (Oracle Corporation)"
)
@Component
public class ReportMapperImpl implements ReportMapper {

    @Override
    public ReportResponseDto toDto(Report report) {
        if ( report == null ) {
            return null;
        }

        ReportResponseDto.ReportResponseDtoBuilder reportResponseDto = ReportResponseDto.builder();

        reportResponseDto.fkTotalFineAmount( report.getFkTotalFineAmount() );
        reportResponseDto.fkTotalSalePrice( report.getFkTotalSalePrice() );
        reportResponseDto.date( report.getDate() );

        return reportResponseDto.build();
    }

    @Override
    public Report toEntity(ReportRequestDto dto) {
        if ( dto == null ) {
            return null;
        }

        Report report = new Report();

        report.setFkTotalFineAmount( dto.getFkTotalFineAmount() );
        report.setFkTotalSalePrice( dto.getFkTotalSalePrice() );
        report.setDate( dto.getDate() );

        return report;
    }
}
