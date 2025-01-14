package com.jshans.springbootjpaexample.repository.user;

import com.jshans.springbootjpaexample.model.user.QUser;
import com.jshans.springbootjpaexample.vo.user.QUserVo;
import com.jshans.springbootjpaexample.vo.user.UserVo;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.jshans.springbootjpaexample.model.user.QUser.user;

@Repository
@RequiredArgsConstructor
public class UserQueryRepository {

    private final JPAQueryFactory queryFactory;

    public List<UserVo> findAll() {
        return queryFactory.select(
                new QUserVo(
                        user.password.value,
                        user.name.value
                ))
                .from(user)
                .fetch();
    }
}
