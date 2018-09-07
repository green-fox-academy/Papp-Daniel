public class Birds extends Animals {
    public Birds(String name, int age) {
        super(name, age);
    }

    @Override
    public String breed() {
        return " is breeding by laying eggs";
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
