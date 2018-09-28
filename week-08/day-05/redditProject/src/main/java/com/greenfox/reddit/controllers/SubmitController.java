package com.greenfox.reddit.controllers;

import com.greenfox.reddit.services.RedditService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SubmitController {
    private RedditService redditService;

    public SubmitController(RedditService redditService) {
        this.redditService = redditService;
    }

    @GetMapping("/submit")
    public String getSubmitPage() {
        return "submit";
    }

    @PostMapping("/submit")
    public String postSubmit(String name, String url) {
        redditService.addNewReddit(name, url);

        return "redirect:/";
    }
}
