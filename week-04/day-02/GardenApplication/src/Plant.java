public abstract class Plant {
    private String color;


    public Plant(String color) {
        this.color = color;

    }

    public String getColor() {
        return color;
    }


    public abstract void watering(int water);

    public abstract void gardenStatus();
}
