package com.digital_library.Digital_Library_Project1.rent.mapper;

import com.digital_library.Digital_Library_Project1.rent.dto.request.RentRequest;
import com.digital_library.Digital_Library_Project1.rent.dto.response.RentResponse;
import com.digital_library.Digital_Library_Project1.rent.entity.Rent;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface RentMapper {


    Rent toEntity(RentRequest dto);

    void rentUpdateFromDto( RentRequest updateRequest,@MappingTarget Rent updateRent);

    RentResponse toDto(String bookName, String userName, Rent rent);

}
