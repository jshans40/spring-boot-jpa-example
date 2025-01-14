package com.jshans.springbootjpaexample.model.user;

import com.jshans.springbootjpaexample.exception.ApiException;
import com.jshans.springbootjpaexample.exception.constant.ApiError;
import jakarta.persistence.Column;
import org.hibernate.annotations.Comment;

import java.util.regex.Pattern;

public class UserPassword {

    private static final String PASSWORD_REGEX =
            "^(?:(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)|(?=.*[a-z])(?=.*\\d)(?=.*[\\W_])|(?=.*[A-Z])(?=.*\\d)(?=.*[\\W_])|(?=.*[a-z])(?=.*[A-Z])(?=.*[\\W_])).{8,}$";
    private static final Pattern PASSWORD_PATTERN = Pattern.compile(PASSWORD_REGEX);

    @Comment("유저 비밀번호")
    @Column(name = "password", columnDefinition = "VARCHAR(256)", nullable = false)
    private String value;

    public UserPassword(String password) {
        validatePassword(password);
        this.value = value;
    }

    private void validatePassword(String password) {
        if (password == null) {
            throw new ApiException(ApiError.PASSWORD_IS_NULL);
        }
        if (!PASSWORD_PATTERN.matcher(password).matches()) {
            throw new ApiException(ApiError.INVALID_PASSWORD);
        }
    }

}
