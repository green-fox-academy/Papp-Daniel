import java.util.ArrayList;
import java.util.List;

public class Garden {
    private List<Tree> trees;
    private List<Flower> flowers;

    public Garden() {
        this.trees = new ArrayList<>();
        this.flowers = new ArrayList<>();
    }
    public void addTree(String color) {
        trees.add(new Tree(color));
    }
    public void addFlower(String color) {
        flowers.add(new Flower(color));
    }
    public void gardenStatus() {
        for (int i = 0; i < trees.size(); i++) {
            trees.get(i).gardenStatus();
        }
        for (int j = 0; j < flowers.size(); j++) {
            flowers.get(j).gardenStatus();
        }
    }
    public void wateringGarden(int water) {
        for (int i = 0; i < trees.size(); i++) {
            if (trees.get(i).getWateramount() < 10) {
                trees.get(i).watering(water/trees.size());
            }
        }
        for (int i = 0; i < flowers.size(); i++) {
            if (flowers.get(i).getWateramount() < 5)  {
                flowers.get(i).watering(water/flowers.size());
            }
        }
    }
}
