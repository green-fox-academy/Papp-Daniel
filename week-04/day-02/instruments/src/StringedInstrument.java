public abstract class StringedInstrument extends Instrument {
    private int numberOfStrings;

    @Override
    public void play() {
        sound();
    }
    public abstract String sound();

    public StringedInstrument(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }
    public StringedInstrument(){

    }
}
