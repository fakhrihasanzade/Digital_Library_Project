package com.digital_library.Digital_Library_Project1.user.exception.subexception;

import com.digital_library.Digital_Library_Project1.punishment.exception.superexception.MainNotFoundException;

public class UserNotFoundException extends MainNotFoundException {

    public UserNotFoundException(String message) {
        super(message);
    }

}
