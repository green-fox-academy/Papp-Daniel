package com.foxclub.foxclubapp.controllers;

import com.foxclub.foxclubapp.modells.Fox;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class LoginController {

    private Fox fox;

    public LoginController(Fox fox) {
        this.fox = new Fox();
    }

    @GetMapping("/login")
    public String getLogin() {
        return "login";
    }

    @PostMapping("/login")
    public String postLogin(Model model, String name) {
        return "redirect:/?name="+name;
    }
}
