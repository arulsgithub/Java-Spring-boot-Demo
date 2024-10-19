package com.arulJD.DemoApp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Helloworld {

    @RequestMapping
    public static String greet(){

        return "Hello World!, Welcome to Java Springboot";
    }
}
