package com.digital_library.Digital_Library_Project1.rent.service;

import com.digital_library.Digital_Library_Project1.rent.dto.request.RentRequest;
import com.digital_library.Digital_Library_Project1.rent.dto.response.RentResponse;

import java.util.List;

public interface RentService {

    List<RentResponse> myRentGetAll(String userId);

    void deleteRent(String userId,String bookName);

    void create(RentRequest dto);

}
