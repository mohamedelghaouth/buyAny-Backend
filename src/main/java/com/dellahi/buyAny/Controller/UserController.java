package com.dellahi.buyAny.Controller;

import com.dellahi.buyAny.Model.User;
import com.dellahi.buyAny.Services.Impl.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/buyAny/v1/users")
public class UserController {

    @Autowired
    private UserDetailsServiceImpl userDetailsService;

    @PostMapping(path = "/registration")
    /*@ApiOperation(value = "Account creation", response = User.class)
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Account successfully created"),
            @ApiResponse(code = 400, message = "Incorrect Request") })*/

    public User register(@RequestBody User user) {
        return userDetailsService.saveUser(user);
    }

    /*@GetMapping(path = "{userName}")
    public User getUser(@PathVariable("userName") String userName){
        return ;

    }*/
}
