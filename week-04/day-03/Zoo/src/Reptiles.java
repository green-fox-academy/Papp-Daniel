public class Reptiles extends Animals {
    public Reptiles(String name, int age) {
        super(name, age);
    }

    @Override
    public String breed() {
        return " is breeding by laying eggs";
    }

    @Override
    public String eating() {
        return " is carnivorous";
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
