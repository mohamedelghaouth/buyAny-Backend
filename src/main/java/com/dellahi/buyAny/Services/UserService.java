package com.dellahi.buyAny.Services;

import com.dellahi.buyAny.Dto.UserDto;

import java.util.List;

public interface UserService {

    UserDto saveUser(UserDto userDto);
    UserDto updateUser(UserDto userDto);
    void deleteUser(UserDto userDto);
    void deleteUserByUsername(String username);
    UserDto getUserByUsername(String username);
    List<UserDto> getAllUsers();
}