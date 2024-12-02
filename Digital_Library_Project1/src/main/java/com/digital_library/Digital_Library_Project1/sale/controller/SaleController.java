package com.digital_library.Digital_Library_Project1.sale.controller;

import com.digital_library.Digital_Library_Project1.sale.dto.SaleRequest;
import com.digital_library.Digital_Library_Project1.sale.entity.Sale;
import com.digital_library.Digital_Library_Project1.sale.service.SaleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/admin/sale")
public class SaleController {

    private final SaleService service;

    @GetMapping("/all")
    public List<Sale> getAll(){
        return service.getAll();
    }

    @GetMapping("/time-interval/{t1}/{t2}")
    public List<Sale> getBySaleDateInterval(
            @PathVariable LocalDateTime t1,@PathVariable LocalDateTime t2){
        return service.getBySaleDateInterval(t1,t2);
    }

    @GetMapping("/count-interval/{count1}/{count2}")
    public List<Sale> getByCountInterval(@PathVariable Long count1,@PathVariable Long count2){
        return service.getByCountInterval(count1,count2);
    }

    @GetMapping("/price-interval/{total1}/{total2}")
    public List<Sale> getByTotalPriceInterval(
            @PathVariable Double total1,@PathVariable Double total2){
        return service.getByTotalPriceInterval(total1,total2);
    }

    @GetMapping("/{userId}")
    public List<Sale> getByUserId(@PathVariable String userId){
        return service.getByUserId(userId);
    }

    @PostMapping("/save")
    public void createSale(@RequestBody SaleRequest dto){
        service.createSale(dto);
    }

    @DeleteMapping("/{id}")
    public void cannelSale(@PathVariable Long id){
        service.cannelSale(id);
    }

}
