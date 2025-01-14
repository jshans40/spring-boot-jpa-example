package com.jshans.springbootjpaexample.exception;

import com.jshans.springbootjpaexample.exception.constant.ApiError;
import lombok.Getter;

@Getter
public class ApiException extends RuntimeException{
    private final int status;
    private final String resultCode;
    private final ApiError apiError;

    public ApiException(ApiError apiError) {
        this.apiError = apiError;
        this.status = apiError.getStatus();
        this.resultCode = apiError.getResultCode();
    }
}
