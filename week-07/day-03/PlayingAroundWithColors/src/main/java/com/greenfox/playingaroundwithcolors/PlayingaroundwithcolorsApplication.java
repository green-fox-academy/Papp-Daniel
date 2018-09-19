package com.greenfox.playingaroundwithcolors;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PlayingaroundwithcolorsApplication implements CommandLineRunner {

    private MyColor color;

    public PlayingaroundwithcolorsApplication(RedColor redColor) {
        this.color = color;
    }

    public static void main(String[] args) {
        SpringApplication.run(PlayingaroundwithcolorsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        color = new BlueColor();
        color.printColor();
    }
}
