package com.greenfoxacademy.helloworld.controller;

import com.greenfoxacademy.helloworld.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam("name") String name) {
        return new Greeting(1,"Hello, " + name);
    }
}
