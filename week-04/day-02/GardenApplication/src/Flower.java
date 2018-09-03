public class Flower extends Plant {
    private double wateramount;

    public double getWateramount() {
        return wateramount;
    }

    public Flower(String color) {
        super(color);
        this.wateramount = 0.0;
    }

    @Override
    public void watering(int water) {
        System.out.println("Watering with " + water);
        double absordedWater = water/1.75;
        this.wateramount += absordedWater;
        gardenStatus();
    }

    @Override
    public void gardenStatus() {
        if (wateramount < 5) {
            System.out.println("The " + getColor() + " flower needs water");
        } else {
            System.out.println("The " + getColor() + " flower doesnt need water");
        }
    }
}
