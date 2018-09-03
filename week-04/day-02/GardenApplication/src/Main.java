public class Main {
    public static void main(String[] args) {
        Garden garden = new Garden();
        garden.addTree("red");
        garden.addTree("green");
        garden.addTree("purple");
        garden.addTree("red");
        garden.addFlower("orange");
        garden.addFlower("orange");
        garden.addFlower("orange");
        garden.gardenStatus();
        System.out.println("--------------------------------------");
        garden.wateringGarden(60);


    }
}
