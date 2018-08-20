import java.sql.SQLOutput;
import java.util.Random;

public class Pirate {
    static int health = 10;
    static int drinkRum = 0;

    Pirate(int health, int drinkRum) {
        this.health = health;
        this.drinkRum = drinkRum;
    }

    public static void drinkSomeRum() {
        drinkRum++;
        health--;
        System.out.println("The pirate has lost HP, he has:" + health + " HP");
        System.out.println("The pirate drunk some rum his drunkenness point is: " + drinkRum);
    }

    public void howsItGoingMate() {
        if (drinkRum <= 4) {
            System.out.println("Pour me anudder!");
        } else {
            System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin? - the pirate passed out");
        }
    }

    public static void die() {
        if (drinkRum > 4 && health == 0) {
            System.out.println("He's dead");
        }
    }

    void brawl() {
        Random r = new Random();
        int random = r.nextInt();

        System.out.println(r);

        if (random < 33) {
            System.out.println("The pirate is dead");
        }
        if (random > 33 && random < 66) {
            System.out.println("Both of the two pirates are dead");
        }
        if (random > 66) {
            System.out.println("Both of the two pirates passed out");
        }
    }
}
