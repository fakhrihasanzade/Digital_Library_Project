package com.digital_library.Digital_Library_Project1.punishment.mapper;

import com.digital_library.Digital_Library_Project1.punishment.entity.Punishment;
import com.digital_library.Digital_Library_Project1.rent.entity.Rent;

public class PunishmentMapper {

    public static Punishment RentToPunishment(Rent rent){

        return Punishment.builder()
                .userId(rent.getUserId())
                .bookId(rent.getBookId())
                .price(rent.getFineAmount())
                .startDate(rent.getReturnDate())
                .reason("delay")
                .status("unpaid")
                .build();

    }

}
