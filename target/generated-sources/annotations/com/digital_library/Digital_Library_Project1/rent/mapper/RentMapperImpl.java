package com.digital_library.Digital_Library_Project1.rent.mapper;

import com.digital_library.Digital_Library_Project1.rent.dto.request.RentRequest;
import com.digital_library.Digital_Library_Project1.rent.dto.response.RentResponse;
import com.digital_library.Digital_Library_Project1.rent.entity.Rent;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-12-09T20:16:36+0400",
    comments = "version: 1.6.3, compiler: javac, environment: Java 23.0.1 (Oracle Corporation)"
)
@Component
public class RentMapperImpl implements RentMapper {

    @Override
    public Rent toEntity(RentRequest dto) {
        if ( dto == null ) {
            return null;
        }

        Rent.RentBuilder rent = Rent.builder();

        rent.bookId( dto.getBookId() );
        rent.userId( dto.getUserId() );
        rent.fineAmount( dto.getFineAmount() );
        rent.startDate( dto.getStartDate() );
        rent.returnDate( dto.getReturnDate() );

        return rent.build();
    }

    @Override
    public void rentUpdateFromDto(RentRequest updateRequest, Rent updateRent) {
        if ( updateRequest == null ) {
            return;
        }

        updateRent.setBookId( updateRequest.getBookId() );
        updateRent.setUserId( updateRequest.getUserId() );
        updateRent.setFineAmount( updateRequest.getFineAmount() );
        updateRent.setStartDate( updateRequest.getStartDate() );
        updateRent.setReturnDate( updateRequest.getReturnDate() );
    }

    @Override
    public RentResponse toDto(String bookName, String userName, Rent rent) {
        if ( bookName == null && userName == null && rent == null ) {
            return null;
        }

        RentResponse.RentResponseBuilder rentResponse = RentResponse.builder();

        if ( rent != null ) {
            rentResponse.fineAmount( rent.getFineAmount() );
            rentResponse.startDate( rent.getStartDate() );
            rentResponse.returnDate( rent.getReturnDate() );
        }
        rentResponse.bookName( bookName );
        rentResponse.userName( userName );

        return rentResponse.build();
    }
}
