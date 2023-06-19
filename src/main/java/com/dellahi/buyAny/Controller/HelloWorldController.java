package com.dellahi.buyAny.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Hello")
public class HelloWorldController {

    @GetMapping
    public String getHelloWorld(){
        return "Hello World";
    }
}
