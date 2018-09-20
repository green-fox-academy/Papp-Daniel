package com.foxclub.foxclubapp.controllers;

import com.foxclub.foxclubapp.modells.Fox;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    private Fox fox;

    public HomeController(Fox fox) {
        this.fox = new Fox();
    }

    @RequestMapping("/index")
    public String printHome(Model model) {
        model.addAttribute("name",fox.getName());
        return "index";
    }

    @GetMapping("/")
    public String postIndex(String name, Model model) {
        model.addAttribute("name", name);
        return "index";
    }
}
