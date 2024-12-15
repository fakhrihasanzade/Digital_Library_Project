package com.digital_library.Digital_Library_Project1.sale.exception;

import com.digital_library.Digital_Library_Project1.book.exception.ErrorDetails;
import com.digital_library.Digital_Library_Project1.book.exception.superexception.MainNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;

public class CustomisedException extends ResponseEntityExceptionHandler {

    @ExceptionHandler(MainNotFoundException.class)
    @ResponseStatus(code = HttpStatus.NOT_FOUND)
    public final ResponseEntity<Object> handleMainNotFoundException(
            Exception ex, WebRequest request
    ) {
        com.digital_library.Digital_Library_Project1.book.exception.ErrorDetails errorDetails = new ErrorDetails(
                LocalDateTime.now(),
                ex.getMessage(),
                request.getDescription(false));
        return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
    }

}
