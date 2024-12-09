package com.digital_library.Digital_Library_Project1.punishment.service;

import com.digital_library.Digital_Library_Project1.punishment.dto.PunishmentRequest;
import com.digital_library.Digital_Library_Project1.punishment.entity.Punishment;

import java.time.LocalDate;
import java.util.List;

public interface PunishmentService {

    List<Punishment> addFineFromRentToPunishment();

    List<Punishment> getDailyFine(LocalDate date);

    List<Punishment> getByTimeInterval(LocalDate beginDate, LocalDate endDate);

    List<Punishment> getByStatus(String status);

    void deletePaidStatusInThisInterval(String status);

    void updateReasonAndStatusById(Long id, PunishmentRequest dto);

}
