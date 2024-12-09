package com.digital_library.Digital_Library_Project1.rent.service;

import com.digital_library.Digital_Library_Project1.rent.entity.Rent;

import java.time.LocalDate;
import java.util.List;

public interface AdminRentService {

    List<Rent> getAllEntity();

    List<Rent> getByTimeInterval(LocalDate starDate, LocalDate endDate);

    List<Rent> getByDate(LocalDate date);

    List<Rent> getPunishmentRent();

    void addFineAmount();

    void deleteById(Long id);

}
