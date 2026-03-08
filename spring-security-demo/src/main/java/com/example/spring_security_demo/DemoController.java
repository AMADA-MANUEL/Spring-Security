package com.example.spring_security_demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {
    @GetMapping
    public String getDemo(){
        return("<h1>Spring Security Test Demo Successfully </h1>");
    }

}
