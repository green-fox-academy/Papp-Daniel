package com.foxclub.foxclubapp.sevices;

import com.foxclub.foxclubapp.modells.Trick;
import org.springframework.stereotype.Service;

@Service
public class TrickCenterServices {
    private Trick trick = new Trick();

    public String findTrick(String trickName) {
        for (String trick : trick.getListOfTricks()) {
            if (trick.equals(trickName)) {
                return trick;
            }
        }
        return null;
    }

    public Trick getTrick() {
        return trick;
    }
}

