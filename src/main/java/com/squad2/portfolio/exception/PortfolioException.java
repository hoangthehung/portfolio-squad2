package com.squad2.portfolio.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class PortfolioException extends RuntimeException {
    ErrorCode errorCode;
}
