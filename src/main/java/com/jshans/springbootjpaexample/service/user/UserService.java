package com.jshans.springbootjpaexample.service.user;

import com.jshans.springbootjpaexample.dto.user.UserSaveRequestDto;
import com.jshans.springbootjpaexample.model.user.User;
import com.jshans.springbootjpaexample.model.user.UserName;
import com.jshans.springbootjpaexample.model.user.UserPassword;
import com.jshans.springbootjpaexample.repository.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User createUser(UserSaveRequestDto userSaveRequestDto) {
        return userRepository.save(
                new User(
                        new UserName(userSaveRequestDto.getName()),
                        new UserPassword(userSaveRequestDto.getPassword())
                )
        );
    }
}
