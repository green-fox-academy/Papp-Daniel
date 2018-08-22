package main.java.music;

public class ElectricGuitar extends StringedInstrument {
    int numberOfStrings;

    public ElectricGuitar() {
        this.numberOfStrings = 6;
    }

    @Override
    public void play() {
        System.out.println("Electric Guitar a, " + numberOfStrings + "-stringed instrument that goes Twang");
    }


}
