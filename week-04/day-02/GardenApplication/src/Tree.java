public class Tree extends Plant {
    private double wateramount;

    public double getWateramount() {
        return wateramount;
    }

    public Tree(String color) {
        super(color);
        this.wateramount = 0.0;
    }


    @Override
    public void watering(int water) {
        System.out.println("Watering with " + water);
        double absordedWater = water / 1.4;
        this.wateramount += absordedWater;
        gardenStatus();
    }


    @Override
    public void gardenStatus() {
        if (wateramount < 10) {
            System.out.println("The " + getColor() + " tree needs water.");
        } else {
            System.out.println("The " + getColor() + " tree doesnt need water.");
        }
    }
}
