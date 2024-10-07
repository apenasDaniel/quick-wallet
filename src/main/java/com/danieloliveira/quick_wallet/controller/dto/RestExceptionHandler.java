package com.danieloliveira.quick_wallet.controller.dto;

import com.danieloliveira.quick_wallet.exception.QuickWalletException;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(QuickWalletException.class)
    public ProblemDetail handleQuickWalletException(QuickWalletException exception) {
        return exception.toProblemDetail();
    }
}
