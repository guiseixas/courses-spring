package com.guilherme.courses_spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hello")
public class HelloWorldController {

    @GetMapping
    public String helloWorld() {
        return "Hello, World!";
    }
}
