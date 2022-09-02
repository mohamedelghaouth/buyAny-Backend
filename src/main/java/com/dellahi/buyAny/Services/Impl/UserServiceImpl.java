package com.dellahi.buyAny.Services.Impl;

import com.dellahi.buyAny.Model.User;
import com.dellahi.buyAny.Repository.UserRepository;
import com.dellahi.buyAny.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(User user) {
        userRepository.delete(user);
    }

    @Override
    public void deleteUserByUsername(String username) {
        userRepository.deleteById(username);
    }

    @Override
    public User getUserByUsername(String username) {
        return userRepository.findById(username).get();
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
