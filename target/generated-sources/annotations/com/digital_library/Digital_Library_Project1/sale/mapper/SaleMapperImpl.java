package com.digital_library.Digital_Library_Project1.sale.mapper;

import com.digital_library.Digital_Library_Project1.sale.dto.SaleRequest;
import com.digital_library.Digital_Library_Project1.sale.entity.Sale;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-12-02T03:20:03+0400",
    comments = "version: 1.6.3, compiler: javac, environment: Java 23.0.1 (Oracle Corporation)"
)
@Component
public class SaleMapperImpl implements SaleMapper {

    @Override
    public Sale toEntity(SaleRequest dto) {
        if ( dto == null ) {
            return null;
        }

        Sale sale = new Sale();

        sale.setFkBookId( dto.getFkBookId() );
        sale.setFkUserId( dto.getFkUserId() );
        sale.setFkSalesmanId( dto.getFkSalesmanId() );
        sale.setFkPaymentId( dto.getFkPaymentId() );
        sale.setSaleDate( dto.getSaleDate() );
        sale.setCount( dto.getCount() );
        sale.setPrice( dto.getPrice() );
        sale.setDiscount( dto.getDiscount() );
        sale.setTotalPrice( dto.getTotalPrice() );

        return sale;
    }
}
