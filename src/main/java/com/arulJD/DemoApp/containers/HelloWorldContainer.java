package com.arulJD.DemoApp.containers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldContainer {

    @GetMapping("/helloworld")
    public String func(){
        return "Hello World!";
    }
}
