package com.digital_library.Digital_Library_Project1.punishment.controller;

import com.digital_library.Digital_Library_Project1.punishment.dto.PunishmentRequest;
import com.digital_library.Digital_Library_Project1.punishment.entity.Punishment;
import com.digital_library.Digital_Library_Project1.punishment.service.PunishmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/punishment")
public class PunishmentController {

    private final PunishmentService service;

    @GetMapping("/daily-add")
    public List<Punishment> addFineFromRentToPunishment(){
        return service.addFineFromRentToPunishment();
    }

    @GetMapping("/daily-punish")
    public List<Punishment> getDailyFine(LocalDate date){
        return service.getDailyFine(date);
    }

    @GetMapping("/get-time-interval")
    public List<Punishment> getByTimeInterval(LocalDate beginDate, LocalDate endDate){
        return service.getByTimeInterval(beginDate,endDate);
    }

    @GetMapping("/get-by-status/{status}")
    public List<Punishment> getByStatus(@PathVariable String status){
        return service.getByStatus(status);
    }

    @DeleteMapping("/delete/{status}")
    public void deletePaidStatusInThisInterval(@PathVariable String status){
        service.deletePaidStatusInThisInterval(status);
    }

    @PutMapping("/{id}")
    public void updateReasonAndStatusById(
            @PathVariable Long id,@RequestBody PunishmentRequest dto){
        System.out.println("Controller");
         service.updateReasonAndStatusById(id,dto);
    }

}
