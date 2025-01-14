package com.jshans.springbootjpaexample.exception.vo;

import com.jshans.springbootjpaexample.exception.spec.ErrorSpec;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
public class ApiErrorResponse {
    private final String resultCode;
    private final String message;

    public ApiErrorResponse(ErrorSpec errorSpec, String message) {
        this.resultCode = errorSpec.getResultCode();
        this.message = message;
    }
}
