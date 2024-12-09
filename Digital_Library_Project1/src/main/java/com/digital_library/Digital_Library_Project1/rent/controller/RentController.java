package com.digital_library.Digital_Library_Project1.rent.controller;

import com.digital_library.Digital_Library_Project1.rent.dto.request.RentRequest;
import com.digital_library.Digital_Library_Project1.rent.dto.response.RentResponse;
import com.digital_library.Digital_Library_Project1.rent.service.RentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user/rent")
@RequiredArgsConstructor
public class RentController {

    private final RentService service;

    @GetMapping("/my-rent/{userId}")
    public List<RentResponse> myRentGetAll(@PathVariable String userId) {
        return service.myRentGetAll(userId);
    }

    @DeleteMapping("/{user-id}/{book-name}")
    public void deleteRent(
            @PathVariable("user-id") String userId,
            @PathVariable("book-name") String bookName) {
        service.deleteRent(userId, bookName);
    }

    @PostMapping()
    public void create(@RequestBody RentRequest dto) {
        service.create(dto);
    }

}
