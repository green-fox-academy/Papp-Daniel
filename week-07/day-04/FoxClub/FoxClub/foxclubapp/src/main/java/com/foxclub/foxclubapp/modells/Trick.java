package com.foxclub.foxclubapp.modells;

import java.util.ArrayList;
import java.util.List;

public class Trick {
    private List<String> listOfTricks = new ArrayList<>();

    public Trick() {
        this.listOfTricks.add("Coding in Java");
        this.listOfTricks.add("Coding in C");
        this.listOfTricks.add("Coding in Ruby");
    }

    public List<String> getListOfTricks() {
        return listOfTricks;
    }
}
