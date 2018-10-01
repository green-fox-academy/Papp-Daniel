package com.greenfox.frontend.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {
    @GetMapping("/")
    public String getIndex() {
        return "index";
    }

    @GetMapping("/doubling")
    @ResponseBody
    public UserOutput doubling(@RequestParam Integer input) {
        UserOutput userOutput = new UserOutput();
        if (input == null) {
            userOutput.error = "Please provide an input!";
        } else {
            userOutput.received = input;
            userOutput.result = input * 2;
        }
        return userOutput;
    }

    static class UserOutput {
        public int received;
        public int result;
        public String error;
    }

    @GetMapping("/greeter")
    @ResponseBody
    public Greet getGreeting(@RequestParam String name, String title) {
        Greet greet = new Greet();
        if (name == null) {
            greet.error = "Please provide a name!";
        } else if (title == null) {
            greet.error = "Please provide a title!";
        } else {
            greet.welcome_message = "Oh, hi there " + name + ", my dear " + title + "!";
        }
        return greet;
    }

    static class Greet {
        public String welcome_message;
        public String error;
    }

    @GetMapping("/appenda/{appendable}")
    @ResponseBody
    public Append getAppendaA(@PathVariable String appendable) {
        Append append = new Append();
        append.appended = appendable + "a";
        return append;
    }

    static class Append {
        public String appended;
    }

    @PostMapping("/dountil/{action}")
    @ResponseBody
    public Result postAction(@PathVariable String action, @RequestBody Until until) {
        Result result = new Result();
        if(until.until==null) {
            result.error = "Please provide a number!";
        }
        if (action.equals("sum")) {
            for (int i = 0; i <= until.until; i++) {
                result.result += i;
            }
            return result;
        }
        if (action.equals("factor")) {
            result.result = 1;
            for (int i = 1; i <= until.until; i++) {
                result.result = result.result * i;
            }
        }
        return result;
    }

    static class Until {
        public Integer until;
    }

    static class Result {
        public int result;
        public String error;
    }
}
