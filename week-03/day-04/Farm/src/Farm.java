import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Farm {
    static ArrayList<Animal> listOfAnimals = new ArrayList<>();
    int freePlaces = 5;

    void breed() {
        for (int i = 0; i <= freePlaces; i++) {
            Animal animal = new Animal(50, 50);
            listOfAnimals.add(animal);
        }
        System.out.println(listOfAnimals);
    }


}



