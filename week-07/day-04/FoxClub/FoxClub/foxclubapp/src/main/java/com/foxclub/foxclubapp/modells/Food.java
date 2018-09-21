package com.foxclub.foxclubapp.modells;

import java.util.ArrayList;
import java.util.List;

public class Food {
    private List<String> foods = new ArrayList<>();

    public Food() {
        this.foods.add("Hambuger");
        this.foods.add("Pizza");
        this.foods.add("Chicken breast with rice");
    }

    public List<String> getFoods() {
        return foods;
    }
}
