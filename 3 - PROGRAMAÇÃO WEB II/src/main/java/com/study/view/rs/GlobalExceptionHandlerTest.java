package com.study.view.rs;

import com.study.dto.ErrorResponseTest;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.persistence.EntityNotFoundException;


@ControllerAdvice
@Log4j2
public class GlobalExceptionHandlerTest {
//Doc: https://www.baeldung.com/exception-handling-for-rest-with-spring
    @ExceptionHandler({
            MethodArgumentNotValidException.class,
            EntityNotFoundException.class,
            IllegalStateException.class
    })
    public ResponseEntity<ErrorResponseTest> handleConstraintViolationException(final RuntimeException exception) {

        log.error(exception.getMessage());
        return ResponseEntity
                .badRequest()
                .body(ErrorResponseTest.createFromValidation(exception));
    }
}