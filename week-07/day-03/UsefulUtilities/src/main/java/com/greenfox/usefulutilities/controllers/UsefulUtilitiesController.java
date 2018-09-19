package com.greenfox.usefulutilities.controllers;

import com.greenfox.usefulutilities.services.UtilityService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UsefulUtilitiesController {
    private UtilityService utilityService;

    public UsefulUtilitiesController(UtilityService utilityService) {
        this.utilityService = utilityService;
    }


    @RequestMapping("/useful")
    public String mapColor(Model model) {
        model.addAttribute("color", utilityService.randomColor());
        return "useful";
    }

    @RequestMapping("/colorred")
    public String mapColored(Model model) {
        model.addAttribute("colored",utilityService.randomColor());
        return "colorred";
    }

    @RequestMapping("/email")
    public String mapEmail(Model model,@RequestParam("email") String email) {
        model.addAttribute("email",utilityService.validateEmail(email));
        return "email";
    }
}
