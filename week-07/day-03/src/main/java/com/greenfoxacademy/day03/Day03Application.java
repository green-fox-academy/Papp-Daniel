package com.greenfoxacademy.day03;

import com.greenfoxacademy.day03.services.Printer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Day03Application implements CommandLineRunner {

    private Printer printer;

    public Day03Application(Printer printer) {
        this.printer=printer;
    }

    public static void main(String[] args) {
        SpringApplication.run(Day03Application.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
        printer.log("szervusz");
    }
}
