package com.digital_library.Digital_Library_Project1.report.exception.subexception;

import com.digital_library.Digital_Library_Project1.punishment.exception.superexception.MainNotFoundException;

public class ReportNullException extends MainNotFoundException {

    public ReportNullException(String message) {
        super(message);
    }

}
