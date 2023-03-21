package com.study.dto;

import com.fasterxml.jackson.annotation.*;
import lombok.*;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.*;

import java.util.*;
import java.util.stream.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties
public class ErrorResponseTest {

    private HttpStatus message;
    private String error;

    public static ErrorResponseTest createFromValidation(RuntimeException runtimeException) {
        return new ErrorResponseTest( HttpStatus.BAD_REQUEST, runtimeException.getMessage());
    }
}