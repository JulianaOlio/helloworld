package com.letscode.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class HelloWorldController {

    @GetMapping("/hello")
    public String hello(){
        return "olá Mundo";
    }
}
