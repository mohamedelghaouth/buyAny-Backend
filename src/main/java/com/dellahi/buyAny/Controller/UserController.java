package com.dellahi.buyAny.Controller;

import com.dellahi.buyAny.Dto.UserDto;
import com.dellahi.buyAny.Services.Impl.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/buyAny/v1/users")
public class UserController {

    @Autowired
    private UserDetailsServiceImpl userDetailsService;

    @PostMapping(path = "/registration")
    public ResponseEntity<UserDto> register(@RequestBody UserDto userDto) {

        return new ResponseEntity<UserDto>(userDetailsService.saveUser(userDto),HttpStatus.CREATED);
    }

    @GetMapping(path = "{userName}")
    public UserDto getUser(@PathVariable("userName") String userName){

        return userDetailsService.getUserByUsername(userName);

    }
}
