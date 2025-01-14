package com.jshans.springbootjpaexample.vo.user;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * com.jshans.springbootjpaexample.vo.user.QUserVo is a Querydsl Projection type for UserVo
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QUserVo extends ConstructorExpression<UserVo> {

    private static final long serialVersionUID = 1852143160L;

    public QUserVo(com.querydsl.core.types.Expression<String> password, com.querydsl.core.types.Expression<String> name) {
        super(UserVo.class, new Class<?>[]{String.class, String.class}, password, name);
    }

}

