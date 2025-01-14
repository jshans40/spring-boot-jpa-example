package com.jshans.springbootjpaexample.exception.constant;

import com.jshans.springbootjpaexample.exception.spec.ErrorSpec;

public enum ApiError implements ErrorSpec {
    INVALID_PASSWORD(400, "U-001", "Invalid password"),
    PASSWORD_IS_NULL(400, "U-002", "Password is null"),
    USERNAME_IS_NULL(400, "U-003", "Username is null"),
    INVALID_USERNAME(400, "U-004", "Invalid username");


    private final int status;
    private final String resultCode;
    private final String message;

    ApiError(int status, String resultCode, String message) {
        this.status = status;
        this.resultCode = resultCode;
        this.message = message;
    }

    @Override
    public int getStatus() {
        return this.status;
    }

    @Override
    public String getResultCode() {
        return this.resultCode;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
