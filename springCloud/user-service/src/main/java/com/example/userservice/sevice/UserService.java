package com.example.userservice.sevice;

import com.example.userservice.domain.UserEntity;
import com.example.userservice.dto.UserDto;

public interface UserService {

    UserDto createUser(UserDto userDto);

    UserDto getUserByUserId(String userId);

    Iterable<UserEntity> getUserByAll();
}
