package com.foxclub.foxclubapp.controllers;

import com.foxclub.foxclubapp.modells.Fox;
import com.foxclub.foxclubapp.sevices.FoxService;
import com.foxclub.foxclubapp.sevices.NutritionStoreService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@ComponentScan
public class NutritionStoreController {
    private NutritionStoreService nutritionStoreService;
    private FoxService foxService;

    public NutritionStoreController(NutritionStoreService nutritionStoreService, FoxService foxService) {
        this.nutritionStoreService = nutritionStoreService;
        this.foxService = foxService;
    }

    @RequestMapping("/nutritionStore")
    public String getNutritionStore(@RequestParam("name") String name, Model model) {
        Fox fox = foxService.findByName(name);
        model.addAttribute("fox", fox);
        model.addAttribute("foods", nutritionStoreService.getFood().getFoods());
        model.addAttribute("drinks", nutritionStoreService.getDrink().getDrinks());

        return "nutritionStore";
    }

    @PostMapping("/nutritionStore")
    public String postNutritionFox(@RequestParam("name") String name, String food, String drink) {
        Fox fox = foxService.findByName(name);
        fox.setDrink(drink);
        fox.setFood(food);
        return "redirect:/?name=" + fox.getName();
    }

}
