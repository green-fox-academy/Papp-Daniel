package main.java.music;

public class ElectricGuitar extends StringedInstrument {
    int numberOfStrings;

    ElectricGuitar(){
        this.numberOfStrings=6;
    }

    @Override
    public void sound(){
        System.out.println("Electric Guitar a, "+numberOfStrings + "-stringed instrument that goes Twang");
    }
}
