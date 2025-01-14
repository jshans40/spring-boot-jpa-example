package com.jshans.springbootjpaexample.repository.user;

import com.jshans.springbootjpaexample.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
