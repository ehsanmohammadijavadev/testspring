package com.testspring.testspring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/t")
public class Test {

    @GetMapping
    public String testSpring(){
        return "This is a test";
    }
}
