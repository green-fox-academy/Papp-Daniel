import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {
    private List<Pirate> crew;
    private int maxCrew;
    private Captain captain;

    public Ship() {
        this.crew = new ArrayList<>();
        this.maxCrew = 50;
        captain = new Captain();
    }

    public void addPirate() {
        crew.add(new Pirate());
    }

    public void fillShip() {
        for (int i = 0; i < maxCrew-1; i++) {
            addPirate();
        }
        Captain captain = new Captain();
        crew.add(captain);
    }

    public String shipStatus() {
        return "The number of alive pirates is :" + crew.size() + " , " + " the captain consumed rum :" + captain.getDrankRum();
    }

    public boolean battle(Ship other) {
        boolean battleResult = true;
        Random randomLoses = new Random();
        int loses = 10;//randomLoses.nextInt(10);
        int score = crew.size() - captain.getDrankRum();
        int otherScore = other.crew.size() - captain.getDrankRum();
        if (score > otherScore) {
            battleResult = true;
        } else {
            battleResult = false;
        }
        if (battleResult = true) {
            for (int i = 0; i < loses; i++) {
                other.crew.remove(loses);
            }
            System.out.println("They lost " + loses + " lads");
        } else {
            for (int j = 0; j < loses; j++) {
                crew.remove(j);
            }
            System.out.println("We lost " + loses + " lads");

        }
        return battleResult;
    }

}
