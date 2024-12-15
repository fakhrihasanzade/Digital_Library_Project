package com.digital_library.Digital_Library_Project1.sale.service;

import com.digital_library.Digital_Library_Project1.sale.dto.SaleRequest;
import com.digital_library.Digital_Library_Project1.sale.entity.Sale;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface SaleService {

    List<Sale> getAll();

    List<Sale> getBySaleDateInterval(LocalDate t1, LocalDate t2);

    List<Sale> getByCountInterval(Long count1, Long count2);

    List<Sale> getByTotalPriceInterval(Double total1, Double total2);

    List<Sale> getByUserId(String userId);

    void createSale(SaleRequest dto);

    void cannelSale(Long id);



}
