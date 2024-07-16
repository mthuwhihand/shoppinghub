package com.example.shoppinghub.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorld {

    @GetMapping("/hello")
    public String Hello(){
        return "Hello World, I'm Minh Thu";
    }
}
