import java.util.Random;

public class Pirate {
    private int drankRum;
    private int HP;

    public void setDrankRum(int drankRum) {
        this.drankRum = drankRum;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getDrankRum() {
        return drankRum;
    }

    public int getHP() {
        return HP;
    }

    public Pirate() {
        this.drankRum = 0;
        this.HP = 10;
    }

    public void drinkSomeRum() {
        this.drankRum++;
    }
    public String howsItGoingMate() {
        if (this.drankRum>= 0 && this.drankRum<=4){
            return "Pour me anudder!";
        } else {
            return "Arghh, I'ma Pirate. How d'ya d'ink its goin?";
        }
    }
    public void die() {
       HP = 0;
        System.out.println("he's dead");
    }
    public void brawl(Pirate other) {
        Random r = new Random();
        int chance = r.nextInt(100);
        if (chance < 33){
            die();
        }
        if (chance >= 33 && chance <= 66) {
            other.die();
        }
        if (chance > 66) {
            System.out.println("they both pass out");
        }
    }
}
