package com.dellahi.buyAny.Services.Impl;

import com.dellahi.buyAny.Dto.UserDto;
import com.dellahi.buyAny.Model.MyUserPrincipal;
import com.dellahi.buyAny.Model.User;
import com.dellahi.buyAny.Repository.UserRepository;
import com.dellahi.buyAny.Services.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@Service
public class UserDetailsServiceImpl implements UserService, UserDetailsService {

    private final static String USER_NOT_FOUND_MSG = "user with username : %s not found";
    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userRepository.findById(username).get();

        if(user==null) throw new UsernameNotFoundException(String.format(USER_NOT_FOUND_MSG,username));

        return new MyUserPrincipal(user);
    }

    @Override
    public UserDto saveUser(UserDto userDto) {

        User user = new User();
        BeanUtils.copyProperties(userDto,user);

        boolean userExists = userRepository.findById(user.getUserName())
                .isPresent();
        if (userExists) {
            // TODO check of attributes are the same and
            // TODO if email not confirmed send confirmation email.

            throw new IllegalStateException("username already taken");
        }

        PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
        user.setPassword(encoder.encode(user.getPassword()));

        user = userRepository.save(user);
        BeanUtils.copyProperties(user,userDto);

        return userDto;
    }

    @Override
    public UserDto updateUser(UserDto userDto) {

        User user = new User();
        BeanUtils.copyProperties(userDto,user);
        user = userRepository.save(user);
        BeanUtils.copyProperties(user,userDto);

        return userDto;
    }

    @Override
    public void deleteUser(UserDto userDto) {

        User user = new User();
        BeanUtils.copyProperties(userDto,user);
        userRepository.delete(user);
    }

    @Override
    public void deleteUserByUsername(String username) {
        userRepository.deleteById(username);
    }

    @Override
    public UserDto getUserByUsername(String username) {

        boolean userExists = userRepository.findById(username).isPresent();

        if (!userExists) throw new NoSuchElementException(String.format(USER_NOT_FOUND_MSG,username));

        User user = userRepository.findById(username).get();
        UserDto userDto = new UserDto();
        BeanUtils.copyProperties(user,userDto);

        //TODO Decode Password before sending request
        return userDto;
    }

    @Override
    public List<UserDto> getAllUsers() {

        List<User> users = userRepository.findAll();

        List<UserDto> usersDto = users.stream().map(user -> {
                UserDto userDto = new UserDto();
                BeanUtils.copyProperties(user,userDto);
                return userDto;
            }).collect(Collectors.toList());

        return usersDto;
    }
}