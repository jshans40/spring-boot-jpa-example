package com.jshans.springbootjpaexample.vo.user;

import com.querydsl.core.annotations.QueryProjection;

public record UserVo(String password, String name) {

    @QueryProjection
    public UserVo {}
}
