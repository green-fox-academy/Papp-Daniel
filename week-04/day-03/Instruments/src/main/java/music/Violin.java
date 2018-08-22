package main.java.music;

public class Violin extends StringedInstrument{
    int numberOfStrings;

    public Violin(){
        this.numberOfStrings = 4;
    }

    @Override
    public void play() {
        System.out.println("Violin, a "+numberOfStrings+ "-stirnged instrument that goes Screech");
    }
}
