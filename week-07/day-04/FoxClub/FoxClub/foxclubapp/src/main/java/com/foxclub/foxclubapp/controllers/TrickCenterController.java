package com.foxclub.foxclubapp.controllers;

import com.foxclub.foxclubapp.modells.Fox;
import com.foxclub.foxclubapp.sevices.FoxService;
import com.foxclub.foxclubapp.sevices.TrickCenterServices;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@ComponentScan
public class TrickCenterController {
    private TrickCenterServices trickCenterServices;
    private FoxService foxService;

    public TrickCenterController(TrickCenterServices trickCenterServices, FoxService foxService) {
        this.trickCenterServices = trickCenterServices;
        this.foxService = foxService;
    }

    @RequestMapping("/trickcenter")
    public String getTrickCenter(@RequestParam("name") String name, Model model) {
        Fox fox = foxService.findByName(name);
        model.addAttribute("fox", fox);
        model.addAttribute("tricks", trickCenterServices.getTrick().getListOfTricks());
        return "trickcenter";
    }

    @PostMapping("/trickcenter")
    public String postTrickCenter(@RequestParam("name") String name, String trick) {
        Fox fox = foxService.findByName(name);
        fox.setTrick(trick);

        return "redirect:/?name=" + fox.getName();
    }
}
