package com.foxclub.foxclubapp.enums;

public enum FoodEnum {
    PIZZA("pizza"),
    HAMBUREGER("hamburger"),
    CHICKENBREATSTWITHRICE("chichken breast with rice");

    private final String display;

    FoodEnum(String display) {
        this.display = display;
    }
    public String getDisplay() {
        return display;
    }

}
