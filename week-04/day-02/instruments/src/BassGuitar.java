public class BassGuitar extends StringedInstrument {

    public BassGuitar(int numberOfStrings) {
        super(numberOfStrings);
        setName("Bass Guitar");
    }
    public BassGuitar() {
        setNumberOfStrings(4);
        setName("Bass Guitar");
    }
//Bass Guitar, a 4-stringed instrument that goes Duum-duum-duum
    @Override
    public String sound() {
        return getName() + " is a " + getNumberOfStrings() + "-stringed instrument that goes Duum-duum-duum";
    }

    @Override
    public void play() {
        System.out.println(sound());
    }
}
