package com.digital_library.Digital_Library_Project1.book.exception.subexception;

import com.digital_library.Digital_Library_Project1.book.exception.superexception.MainNotFoundException;

public class BookNotFoundException extends MainNotFoundException {
    public BookNotFoundException(String message) {
        super(message);
    }
}
