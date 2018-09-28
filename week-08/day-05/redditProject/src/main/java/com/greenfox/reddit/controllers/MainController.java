package com.greenfox.reddit.controllers;


import com.greenfox.reddit.repositories.RedditRepository;
import com.greenfox.reddit.services.RedditServiseImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {
    private RedditServiseImpl redditServise;

    public MainController(RedditServiseImpl redditServise) {
        this.redditServise = redditServise;
    }

    @GetMapping("/")
    public String getMainPage(Model model) {
        model.addAttribute("reddits", redditServise.findAllByOrderByVoteDesc());
        return "index";
    }

    @PostMapping("/{id}/upvote")
    public String upVote(@PathVariable long id) {
        redditServise.increaseVoteByOne(id);
        return "redirect:/";
    }

    @PostMapping("/{id}/downvote")
    public String downVote(@PathVariable long id) {
        redditServise.decreaseVoteByOne(id);
        return "redirect:/";
    }

}
