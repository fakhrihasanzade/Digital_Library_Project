package com.digital_library.Digital_Library_Project1.punishment.exception;

import java.time.LocalDateTime;

public record ErrorDetails(

        LocalDateTime timeStamp,

        String message,

        String details

) {
}
