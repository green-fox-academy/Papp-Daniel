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
    public String homepage(@RequestParam("name") String name, Model model, String trick) {
        foxService.foxLogin(name);
        Fox aFox = foxService.findByName(name);
        model.addAttribute("name", name);
        model.addAttribute("info", "This is " + aFox.getName() + "." + " Currently living on " + aFox.getFood() + " and " + aFox.getDrink() + ". He knows " + aFox.getNumberOfTricks() + " tricks");
        model.addAttribute("tricks", aFox.getTrick());

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
