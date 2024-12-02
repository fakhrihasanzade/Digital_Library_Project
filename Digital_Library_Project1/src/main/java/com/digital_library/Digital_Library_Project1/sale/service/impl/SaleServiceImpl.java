package com.digital_library.Digital_Library_Project1.sale.service.impl;

import com.digital_library.Digital_Library_Project1.sale.dto.SaleRequest;
import com.digital_library.Digital_Library_Project1.sale.entity.Sale;
import com.digital_library.Digital_Library_Project1.sale.mapper.SaleMapper;
import com.digital_library.Digital_Library_Project1.sale.repository.SaleRepository;
import com.digital_library.Digital_Library_Project1.sale.service.SaleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class SaleServiceImpl implements SaleService {

    private final SaleMapper mapper;

    private final SaleRepository repository;

    @Override
    public List<Sale> getAll() {
        return repository.findAll();
    }

    @Override
    public List<Sale> getBySaleDateInterval(LocalDateTime t1, LocalDateTime t2) {
        List<Sale> list = repository.findAll().stream()
                .filter(s -> s.getSaleDate().isAfter(t1)
                        && (s.getSaleDate().isBefore(t2))).toList();
        return list;
    }

    @Override
    public List<Sale> getByCountInterval(Long count1, Long count2) {
        return repository.findAll().stream()
                .filter(s -> s.getCount() > count1 && s.getCount() < count2).toList();
    }

    @Override
    public List<Sale> getByTotalPriceInterval(Double total1, Double total2) {
        return repository.findAll().stream()
                .filter(s -> s.getTotalPrice() > total1 && s.getTotalPrice() < total2).toList();
    }

    @Override
    public List<Sale> getByUserId(String userId) {
        return repository.findAll().stream()
                .filter(s -> s.getFkUserId().equals(userId)).toList();
    }

    @Override
    public void createSale(SaleRequest dto) {

            Sale sale = mapper.toEntity(dto);
            repository.save(sale);

    }

    @Override
    public void cannelSale(Long id) {
        Sale sale=repository.findById(id).orElseThrow();
        long differenceInSeconds = Duration.between(
                sale.getSaleDate(), LocalDateTime.now()).getSeconds();

        if (differenceInSeconds < 10) {
            repository.deleteById(id);

        }
    }
}
