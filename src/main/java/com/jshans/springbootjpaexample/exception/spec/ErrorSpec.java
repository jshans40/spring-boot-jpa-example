package com.jshans.springbootjpaexample.exception.spec;

public interface ErrorSpec {
    int getStatus();
    String getResultCode();
    String getMessage();

}
