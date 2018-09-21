package com.foxclub.foxclubapp.modells;


import java.util.ArrayList;
import java.util.List;

public class Fox {
    private String name;
    private String food;
    private String drink;
    private String trick;

    public String getTrick() {
        return trick;
    }

    public void setTrick(String trick) {
        this.trick = trick;
    }

    private int numberOfTricks;

    public Fox(String name) {
        this.name = name;
        this.food = "burger";
        this.drink = "cola";
    }


    public int getNumberOfTricks() {
        return numberOfTricks;
    }

    public void setNumberOfTricks(int numberOfTricks) {
        this.numberOfTricks = numberOfTricks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

}