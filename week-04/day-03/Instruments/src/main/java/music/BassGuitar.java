package main.java.music;

public class BassGuitar extends StringedInstrument {
    int numberOfStrings;

    public BassGuitar() {
        this.numberOfStrings = 4;
    }

    @Override
    public void play() {
        System.out.println("Bass Guitar, a " + numberOfStrings + "-stringed instrument that goes Duum-duum-duum");
    }
}
