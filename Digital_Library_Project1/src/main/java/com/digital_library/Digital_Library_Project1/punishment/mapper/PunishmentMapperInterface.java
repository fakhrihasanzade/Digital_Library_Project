package com.digital_library.Digital_Library_Project1.punishment.mapper;

import com.digital_library.Digital_Library_Project1.punishment.dto.PunishmentRequest;
import com.digital_library.Digital_Library_Project1.punishment.entity.Punishment;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface PunishmentMapperInterface {

    Punishment updatePunishmenttoEntity(
            @MappingTarget Punishment punishment, PunishmentRequest dto);

}
