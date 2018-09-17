package com.greenfoxacademy.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloWebController {
    AtomicLong id = new AtomicLong();

    @RequestMapping("web/greeting")
    public String greeting(@RequestParam("name") String name) {
        return "Hello " + name + "! This site was loaded for " + id.incrementAndGet() + " times";
    }
}
