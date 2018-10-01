package com.greenfox.probavizsga.controllers;

import com.greenfox.probavizsga.services.MatrixSeviceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {
    private MatrixSeviceImpl matrixService;

    public MainController(MatrixSeviceImpl matrixService) {
        this.matrixService = matrixService;
    }


    @GetMapping("/")
    public String getMain(Model model,boolean validate){
        model.addAttribute("validate",validate);
        return "index";
    }

    @PostMapping("/matrix")
    public String postMatrix(String matrix){
        matrixService.addMatrix(matrix);
        matrixService.validateMatrix(matrix);
        return "redirect:/";
    }
}
