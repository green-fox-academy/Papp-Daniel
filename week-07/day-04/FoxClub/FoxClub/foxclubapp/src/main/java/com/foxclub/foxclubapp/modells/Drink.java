package com.foxclub.foxclubapp.modells;

import java.util.ArrayList;
import java.util.List;

public class Drink {
    private List<String> drinks = new  ArrayList<>();

    public Drink() {
        this.drinks.add("protein shake");
        this.drinks.add("Red Bull");
        this.drinks.add("Chivas Regal");
    }

    public List<String> getDrinks() {
        return drinks;
    }

}
