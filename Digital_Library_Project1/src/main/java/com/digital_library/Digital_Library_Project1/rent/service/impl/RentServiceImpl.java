package com.digital_library.Digital_Library_Project1.rent.service.impl;

import com.digital_library.Digital_Library_Project1.rent.dto.request.RentRequest;
import com.digital_library.Digital_Library_Project1.rent.dto.response.RentResponse;
import com.digital_library.Digital_Library_Project1.rent.entity.Rent;
import com.digital_library.Digital_Library_Project1.rent.mapper.RentMapper;
import com.digital_library.Digital_Library_Project1.rent.repository.RentRepository;
import com.digital_library.Digital_Library_Project1.rent.service.RentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class RentServiceImpl implements RentService {

    private final RentRepository repository;

    private final RentMapper mapper;

    @Override
    public List<RentResponse> myRentGetAll(String userId) {

        List<Rent> rents = repository.findRentsByUserId(userId);
        List<RentResponse> rentList = new ArrayList<>();
        String bookName;
        String userName;

        for (Rent r : rents) {
            bookName = repository.findBookNames(r.getBookId());
            userName = repository.findUserNames(r.getUserId());
            rentList.add(mapper.toDto(bookName, userName, r));

        }

        return rentList;
    }

    @Override
    public void deleteRent(String userId, String bookName) {
        List<Rent> rents = repository.findRentsByUserId(userId);

        Rent rent = rents.stream()
                .filter(r -> mapper.toDto(bookName, userId, r).getBookName().equals(bookName))
                .toList().get(0);
        if (rent.getReturnDate().isAfter(LocalDate.now())) {
            repository.deleteById(rent.getId());
        }

    }

    @Override
    public void create(RentRequest dto) {
        Rent rent = mapper.toEntity(dto);
        repository.save(rent);
    }
}
