//package com.example.spring_security_demo;
//
//
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/demo")
//public class DemoController {
//
//
//    //the username is user and password is automatically generated in the console
//    @GetMapping("/demo")
//    public String getDemo(){
//        return("<h1>Spring Security Test Demo Successfully </h1>");
//    }
//
//}




package com.example.spring_security_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/")
    public String getDemo(){
        return "<h1>Spring Security Test Demo Successfully</h1>";
    }


    //adding more urls
    @GetMapping("/one")
    public String getDemoOne(){
        return "<h1>Spring Security Test Demo One Successfully</h1>";
    }

    @GetMapping("/two")
    public String getDemoTwo(){
        return "<h1>Spring Security Test Demo Two Successfully</h1>";
    }

    @GetMapping("/three")
    public String getDemoTThree(){
        return "<h1>Spring Security Test Demo Three Successfully</h1>";
    }





}





