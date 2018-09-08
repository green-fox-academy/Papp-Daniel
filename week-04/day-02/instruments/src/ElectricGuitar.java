import java.sql.SQLOutput;

public class ElectricGuitar extends StringedInstrument{
    public ElectricGuitar(int numberOfStrings) {
        super(numberOfStrings);
        setName("Electric Guitar");
    }
    public ElectricGuitar() {
        setNumberOfStrings(6);
        setName("Electric Guitar");
    }

    @Override
    public String sound() {
        return getName() + " is a " + getNumberOfStrings() + " instrument that goes Twang";
    }

    @Override
    public void play() {
        System.out.println(sound());
    }
}
