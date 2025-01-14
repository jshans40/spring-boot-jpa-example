package com.jshans.springbootjpaexample.model.user;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QUserPassword is a Querydsl query type for UserPassword
 */
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QUserPassword extends BeanPath<UserPassword> {

    private static final long serialVersionUID = -140490306L;

    public static final QUserPassword userPassword = new QUserPassword("userPassword");

    public final StringPath value = createString("value");

    public QUserPassword(String variable) {
        super(UserPassword.class, forVariable(variable));
    }

    public QUserPassword(Path<? extends UserPassword> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUserPassword(PathMetadata metadata) {
        super(UserPassword.class, metadata);
    }

}

