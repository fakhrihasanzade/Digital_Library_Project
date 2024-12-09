package com.digital_library.Digital_Library_Project1.punishment.mapper;

import com.digital_library.Digital_Library_Project1.punishment.dto.PunishmentRequest;
import com.digital_library.Digital_Library_Project1.punishment.entity.Punishment;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-12-09T01:33:02+0400",
    comments = "version: 1.6.3, compiler: javac, environment: Java 23.0.1 (Oracle Corporation)"
)
@Component
public class PunishmentMapperInterfaceImpl implements PunishmentMapperInterface {

    @Override
    public Punishment updatePunishmenttoEntity(Punishment punishment, PunishmentRequest dto) {
        if ( dto == null ) {
            return punishment;
        }

        punishment.setUserId( dto.getUserId() );
        punishment.setBookId( dto.getBookId() );
        punishment.setPrice( dto.getPrice() );
        punishment.setStartDate( dto.getStartDate() );
        punishment.setReason( dto.getReason() );
        punishment.setStatus( dto.getStatus() );

        return punishment;
    }
}
