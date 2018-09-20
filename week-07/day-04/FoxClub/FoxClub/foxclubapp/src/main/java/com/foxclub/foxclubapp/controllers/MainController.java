package com.foxclub.foxclubapp.controllers;

import com.foxclub.foxclubapp.modells.Fox;
import com.foxclub.foxclubapp.sevices.FoxService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@ComponentScan
public class MainController {

    private FoxService foxService;

    public MainController(FoxService foxService) {
        this.foxService = foxService;
    }

    @RequestMapping("/")
    public String homepage(@RequestParam("name") String name, Model model) {
        Fox aFox = foxService.findByName(name);
        foxService.foxLogin(aFox.getName());
        model.addAttribute("name", aFox.getName());
        model.addAttribute("food", aFox.getFood());
        model.addAttribute("drink", aFox.getDrink());
        model.addAttribute("tricks", aFox.getNumberOfTricks());

        return "index";
    }

    @PostMapping("/login")
    public String postLogin(String name) {
        return "redirect:/?name=" + name;
    }

    @GetMapping("/login")
    public String getLogin() {
        return "login";
    }

}
