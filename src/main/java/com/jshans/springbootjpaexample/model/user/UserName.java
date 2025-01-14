package com.jshans.springbootjpaexample.model.user;

import com.jshans.springbootjpaexample.exception.ApiException;
import com.jshans.springbootjpaexample.exception.constant.ApiError;
import jakarta.persistence.Column;

public class UserName {

    @Column(name = "name", columnDefinition = "VARCHAR(16)")
    private String value;

    public UserName(String value) {
        this.value = value;
    }

    public void validate(String name) {
        if (name == null || name.isEmpty()) {
            throw new ApiException(ApiError.PASSWORD_IS_NULL);
        }

        if (name.length() == 1 || name.length() >= 8) {
            throw new ApiException(ApiError.INVALID_USERNAME);
        }
    }
}
