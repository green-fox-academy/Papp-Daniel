import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Ship {
    List<Integer> listOfPirates = new ArrayList<>();
    Random r = new Random();
    public int numbersOfShipCrew = r.nextInt(40);
    public int randomRum = r.nextInt(5);

    public Ship() {
        this.listOfPirates = listOfPirates;
    }

    void fillShip() {



        for (int i = 0; i < numbersOfShipCrew; i++) {
            int list = r.nextInt(40) + 1;
            listOfPirates.add(list);
        }
        System.out.println("Number of alive pirates :" + numbersOfShipCrew);
        System.out.println("Rum consumed by captain : " + randomRum);

    }

    boolean shipBattle() {
        Random newShip = new Random();
        int losses = newShip.nextInt(40);
        int newShipCrew = newShip.nextInt(40);
        int enemyCaptainRum = newShip.nextInt(5);
        boolean winner;
        if (numbersOfShipCrew > newShipCrew) {
            winner = true;
            System.out.println("The victory is ours!!! Arrrggghhh!!!!");
            System.out.println("The defeated ship losses is :" +losses);
            System.out.println("Yo Ho Ho drink some rum :"+ randomRum);
        } else {
            winner = false;
            System.out.println("We have defeated lads :(");
            System.out.println("Our losses is : "+losses);

        }

        return winner;
    }
}
