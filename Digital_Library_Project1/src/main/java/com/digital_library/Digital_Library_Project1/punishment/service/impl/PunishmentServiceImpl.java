package com.digital_library.Digital_Library_Project1.punishment.service.impl;

import com.digital_library.Digital_Library_Project1.punishment.dto.PunishmentRequest;
import com.digital_library.Digital_Library_Project1.punishment.entity.Punishment;
import com.digital_library.Digital_Library_Project1.punishment.mapper.PunishmentMapper;
import com.digital_library.Digital_Library_Project1.punishment.mapper.PunishmentMapperInterface;
import com.digital_library.Digital_Library_Project1.punishment.repository.PunishmentRepository;
import com.digital_library.Digital_Library_Project1.punishment.service.PunishmentService;
import com.digital_library.Digital_Library_Project1.rent.entity.Rent;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PunishmentServiceImpl implements PunishmentService {

    private final PunishmentRepository repository;

    private final PunishmentMapperInterface mapper;

    @Override
    public List<Punishment> addFineFromRentToPunishment() {

        List<Rent> fineRents = repository
                .findAllRentByReturnDate(LocalDate.now());
        List<Punishment> punishments = new ArrayList<>();
        punishments = fineRents.stream()
                .map(r -> repository.save(PunishmentMapper.RentToPunishment(r))).toList();

        return punishments;
    }

    @Override
    public List<Punishment> getDailyFine(LocalDate date) {

        List<Punishment> punishments = repository.findAllPunishmentByStartDate(date);

        return punishments;
    }

    @Override
    public List<Punishment> getByTimeInterval(LocalDate beginDate, LocalDate endDate) {

        List<Punishment> punishments = repository.findAllPunishmentStartDateBetween(
                beginDate, endDate
        );

        return punishments;
    }

    @Override
    public List<Punishment> getByStatus(String status) {

        List<Punishment> punishments = repository.findAllPunishmentByStatus(status);

        return punishments;
    }

    @Override
    public void deletePaidStatusInThisInterval(String status) {

        repository.deletePunishmentByStatus(status);


    }

    @Override
    public void updateReasonAndStatusById(Long id, PunishmentRequest dto) {

        Punishment findPunishment = repository.findById(id).orElseThrow();
        repository.save(mapper.updatePunishmenttoEntity(findPunishment, dto));

    }
}
