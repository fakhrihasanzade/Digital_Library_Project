package com.digital_library.Digital_Library_Project1.sale.exception.subexception;

import com.digital_library.Digital_Library_Project1.rent.exception.subexception.MainNotFoundException;

public class SaleNotFoundException extends MainNotFoundException {

    public SaleNotFoundException(String message) {
        super(message);
    }

}
