package com.digital_library.Digital_Library_Project1.rent.controller;

import com.digital_library.Digital_Library_Project1.rent.entity.Rent;
import com.digital_library.Digital_Library_Project1.rent.service.AdminRentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1/admin/rent")
@RequiredArgsConstructor
public class AdminRentController {

    private final AdminRentService service;


    @GetMapping("/all")
    public List<Rent> getAllEntity(){
        return service.getAllEntity();
    }

    @GetMapping("/time-interval")
    public List<Rent> getByTimeInterval(
             LocalDate starDate, LocalDate endDate){
        return service.getByTimeInterval(starDate,endDate);
    }


    @GetMapping("/get-date/{date}")
    public List<Rent> getByDate(@PathVariable LocalDate date){
        return service.getByDate(date);
    }

    @GetMapping("/get-punishment")
    public List<Rent> getPunishmentRent(){
        return service.getPunishmentRent();
    }

    @PutMapping("/add-fine")
    public void addFineAmount(){
        service.addFineAmount();
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        service.deleteById(id);
    }
}
