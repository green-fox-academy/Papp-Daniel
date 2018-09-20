package com.foxclub.foxclubapp.sevices;

import com.foxclub.foxclubapp.modells.Fox;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoxService {
    private List<Fox> listOfFoxes;

    public FoxService() {
        this.listOfFoxes = new ArrayList<>();
    }

    public void foxRegister(String name) {
        listOfFoxes.add(new Fox(name));
    }

    public Fox foxLogin(String name) {
        if (findByName(name)==null) {
            foxRegister(name);
        }
        return findByName(name);

    }

    public Fox findByName(String name) {
        for (Fox listOfFox : listOfFoxes) {
            if(listOfFox.getName().equals(name)) {
                return listOfFox;
            }
        }
        return null;
    }
}
