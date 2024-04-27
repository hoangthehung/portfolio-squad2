package com.squad2.portfolio.controller;

import com.squad2.portfolio.exception.Error;
import com.squad2.portfolio.exception.ErrorCode;
import com.squad2.portfolio.exception.PortfolioException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.server.ServerWebInputException;

import java.nio.file.AccessDeniedException;
import java.util.Arrays;
import java.util.List;

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(ServerWebInputException.class)
    public ResponseEntity<Error> handleServerWebInputException(
            ServerWebInputException exception) {

        String reason = exception.getReason();
        if(reason != null) {
            reason = Arrays.stream(reason.split(":")).findFirst().orElse("");
        }
        return new ResponseEntity(new Error(ErrorCode.MISSING_REQUIRED_PARAM), ErrorCode.MISSING_REQUIRED_PARAM.getStatus());
    }
    @ExceptionHandler(PortfolioException.class)
    public ResponseEntity<Error> handlePortfolioException(PortfolioException exception) {
        return new ResponseEntity(
                        new Error(exception.getErrorCode()),
                exception.getErrorCode().getStatus());
    }

    @ExceptionHandler(AccessDeniedException.class)
    public ResponseEntity<Error> handleAccessDeniedException(
            AccessDeniedException accessDeniedException) {
        log.error("Handle AccessDeniedException ", accessDeniedException.getMessage());
        return new ResponseEntity(
                new Error(ErrorCode.ACCESS_DENIED),
                ErrorCode.ACCESS_DENIED.getStatus());
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Error> handleException(Exception exception) {
        log.error("Handle Exception ", exception.getMessage());
        return new ResponseEntity(
                new Error(ErrorCode.ACCESS_DENIED),
                ErrorCode.ACCESS_DENIED.getStatus());
    }


}
