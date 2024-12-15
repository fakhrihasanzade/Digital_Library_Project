package com.digital_library.Digital_Library_Project1.rent.exception.seperexception;

import com.digital_library.Digital_Library_Project1.rent.exception.subexception.MainNotFoundException;

public class RentNotFoundException extends MainNotFoundException {
    public RentNotFoundException(String message) {
        super(message);
    }
}
