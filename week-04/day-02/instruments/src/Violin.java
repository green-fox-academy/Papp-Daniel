public class Violin extends StringedInstrument {
    public Violin() {
        setNumberOfStrings(4);
        setName("Violin");
    }

    public Violin(int numberOfStrings) {
        super(numberOfStrings);
        setName("Violin");

    }

    //Violin, a 4-stringed instrument that goes Screech
    @Override
    public String sound() {
        return getName() + " is a " + getNumberOfStrings() + " instrument that goes Screech";
    }

    @Override
    public void play() {
        System.out.println(sound());
    }
}
