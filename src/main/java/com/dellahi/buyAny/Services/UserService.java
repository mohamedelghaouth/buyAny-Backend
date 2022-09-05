package com.dellahi.buyAny.Services;

import com.dellahi.buyAny.Model.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);
    User updateUser(User user);
    void deleteUser(User user);
    void deleteUserByUsername(String username);
    User getUserByUsername(String username);
    List<User> getAllUsers();
}