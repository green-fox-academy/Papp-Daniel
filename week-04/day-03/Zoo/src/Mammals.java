import java.sql.SQLOutput;

public class Mammals extends Animals {
    public Mammals(String name, int age) {
        super(name, age);
    }

    @Override
    public String breed() {
        return " breeding by miniature versions out.";
    }

    @Override
    public String eating() {
       return " is herbivorous";
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
