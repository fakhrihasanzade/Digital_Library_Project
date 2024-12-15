package com.digital_library.Digital_Library_Project1.punishment.exception.subexception;

import com.digital_library.Digital_Library_Project1.punishment.exception.superexception.MainNotFoundException;

public class PunishmentNotFoundException extends MainNotFoundException {
    public PunishmentNotFoundException(String message) {
        super(message);
    }
}
