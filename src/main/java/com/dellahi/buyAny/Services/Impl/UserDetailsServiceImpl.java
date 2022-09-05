package com.dellahi.buyAny.Services.Impl;

import com.dellahi.buyAny.Model.MyUserPrincipal;
import com.dellahi.buyAny.Model.User;
import com.dellahi.buyAny.Repository.UserRepository;
import com.dellahi.buyAny.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDetailsServiceImpl implements UserService, UserDetailsService {

    private final static String USER_NOT_FOUND_MSG = "user with username : %s not found";
    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = getUserByUsername(username);

        if(user==null) throw new UsernameNotFoundException(String.format(USER_NOT_FOUND_MSG,username));

        return new MyUserPrincipal(user);
    }

    @Override
    public User saveUser(User user) {
        boolean userExists = userRepository.findById(user.getUserName())
                .isPresent();
        if (userExists) {
            // TODO check of attributes are the same and
            // TODO if email not confirmed send confirmation email.

            throw new IllegalStateException("username already taken");
        }
        PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
        user.setPassword(encoder.encode(user.getPassword()));
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
