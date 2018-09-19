package com.greenfox.playingaroundwithcolors;

import org.springframework.stereotype.Service;

@Service
public class RedColor implements MyColor {

    @Override
    public void printColor() {
        System.out.println("This color is red");
    }
}
