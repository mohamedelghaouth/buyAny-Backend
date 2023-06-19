package com.dellahi.buyAny.Controller;

import com.dellahi.buyAny.Model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private static final List<User> USERS = Arrays.asList(
            new User("User1","","123"),
            new User("User2","","1234"),
            new User("User3","","12345")
    );

    @GetMapping(path = "{userName}")
    public User getUser(@PathVariable("userName") String userName){
        return USERS.stream()
                .filter(user -> userName.equals(user.getUserName()))
                .findFirst()
                .orElseThrow(()-> new IllegalStateException("User " + userName + "does not exists"));

    }
}
