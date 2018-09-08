import java.util.ArrayList;
import java.util.List;

public class Carrier {
    private List<Aircraft> aircrafts;
    private int ammo;
    private int HP;

    public Carrier(int ammo, int HP) {
        this.ammo = ammo;
        this.HP = HP;
        this.aircrafts = new ArrayList<>();
    }

    public void add(Aircraft aircraft) {
        this.aircrafts.add(aircraft);
    }
    public void fill() {
        if(this.ammo <= 0){
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < aircrafts.size(); i++) {
            aircrafts.get(i).refill(ammo);
        }
    }
    public void fight (Carrier enemyCarrier) {
        int damagedealt = 0;
        for (Aircraft aircraft : aircrafts) {
            damagedealt += aircraft.fight();
        }
        enemyCarrier.HP -= damagedealt;
    }

    public void getStatus() {
        if(this.HP <=0){
            System.out.println("It's dead Jim :(");
        } else {
            System.out.println("HP: " + this.HP + "," + "Aircraft count: " + aircrafts.size() + "," + "Ammo Strorage: " + this.ammo + "," + "Total damage: " + totalDamage());
            for (Aircraft aircraft : aircrafts) {
                System.out.println(aircraft.getStatus());
            }
        }
        
    }
    public int totalDamage() {
        int totalDamage = 0;
        for (Aircraft aircraft : aircrafts) {
            totalDamage = aircraft.ammoLeft * aircraft.damage;
        }
        return totalDamage;
    }
}
