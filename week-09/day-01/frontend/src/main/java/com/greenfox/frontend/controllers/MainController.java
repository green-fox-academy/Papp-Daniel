package com.greenfox.frontend.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @GetMapping("/")
    public String getIndex() {
        return "index";
    }

    @GetMapping("/doubling")
    @ResponseBody
    public UserOutput doubling(@RequestParam int input) {
        UserOutput userOutput = new UserOutput();
        userOutput.received = input;
        userOutput.result = input * 2;
        return userOutput;
    }

    static class UserOutput {
        public int received;
        public int result;
    }

    @GetMapping("/greeter")
    @ResponseBody
    public Greet getGreeting(@RequestParam String name, String title) {
        Greet greet = new Greet();
        if (name == null ) {
            greet.error = "Please provide a name!";
        } else if(title == null){
            greet.error = "Please provide a title!";
        }
        else{
            greet.welcome_message = "Oh, hi there " + name + ", my dear " + title + "!";
        }
        return greet;
    }

    static class Greet {
        public String welcome_message;
        public String error;
    }

    
}
