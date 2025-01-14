package com.jshans.springbootjpaexample.controller;

import com.jshans.springbootjpaexample.dto.user.UserSaveRequestDto;
import com.jshans.springbootjpaexample.service.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class UserController {

    private final UserService userService;

    @PostMapping("/users")
    public ResponseEntity<?> save(@RequestBody UserSaveRequestDto userSaveRequestDto) {
        return new ResponseEntity<>(userService.createUser(userSaveRequestDto), HttpStatus.CREATED);
    }
}
