package com.foxclub.foxclubapp.modells;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Fox {
    private String name;
    private List tricks;
    private String food;
    private String drink;

    public Fox() {
        this.name = name;
        this.tricks = tricks;
        this.food = food;
        this.drink = drink;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getTricks() {
        return tricks;
    }

    public void setTricks(List tricks) {
        this.tricks = tricks;
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
