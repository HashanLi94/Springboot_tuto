package com.idea.springboot.firstsprinaapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {
    @GetMapping(value = "/test")
    public String test(){
        return "a";
    }
}
