package com.digital_library.Digital_Library_Project1.rent.service.impl;

import com.digital_library.Digital_Library_Project1.rent.entity.Rent;
import com.digital_library.Digital_Library_Project1.rent.repository.RentRepository;
import com.digital_library.Digital_Library_Project1.rent.service.AdminRentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AdminRentServiceImpl implements AdminRentService {

    private final RentRepository repository;


    @Override
    public List<Rent> getAllEntity() {
        return repository.findAll();
    }

    @Override
    public List<Rent> getByTimeInterval(LocalDate starDate, LocalDate returnDate) {
        return repository.findAllByStartDateBetween(starDate, returnDate);
    }



    @Override
    public List<Rent> getByDate(LocalDate date) {
        return repository.findAll().parallelStream()
                .filter(r->r.getStartDate().equals(date)).toList();
    }

    @Override
    public List<Rent> getPunishmentRent() {
        return repository.findAll().parallelStream()
                .filter(r -> r.getFineAmount() > 0).toList();
    }

    @Override
    public void addFineAmount() {
        for (Rent rent : repository.findAll()) {
            if (rent.getReturnDate().isBefore(LocalDate.now())) {
                rent.setFineAmount(rent.getFineAmount() + 1);
            }
        }
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
