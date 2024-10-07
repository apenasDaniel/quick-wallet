package com.danieloliveira.quick_wallet.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;

public class QuickWalletException extends RuntimeException {

    public ProblemDetail toProblemDetail() {
        var pb = ProblemDetail.forStatus(HttpStatus.INTERNAL_SERVER_ERROR);

        pb.setTitle("Quick Wallet Internal server error");

        return pb;
    }

}
