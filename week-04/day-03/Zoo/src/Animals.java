public abstract class Animals {
    private String name;
    private int age;


    public Animals(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    abstract public String breed();

    abstract public String eating();
}
