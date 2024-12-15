package com.digital_library.Digital_Library_Project1.report.mapper;

import com.digital_library.Digital_Library_Project1.report.dto.ReportRequestDto;
import com.digital_library.Digital_Library_Project1.report.dto.ReportResponseDto;
import com.digital_library.Digital_Library_Project1.report.entity.Report;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ReportMapper {

    ReportResponseDto toDto(Report report);

    Report toEntity(ReportRequestDto dto);

}
