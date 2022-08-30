package com.dellahi.buyAny.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/buyAny/v1")
@CrossOrigin(origins = "*")
public class LoginController {
    
    @GetMapping("/login/basicAuth")
    public Principal basicLogin(Principal principal)
    {
        System.out.println("Processing the request....");
        return principal;
    }
}
