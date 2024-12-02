package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Stringreturn {
    @GetMapping("/hello")
    public String hello(){
        System.out.println("com");
        System.out.println("ganja");
        return "hello";
    }
}
