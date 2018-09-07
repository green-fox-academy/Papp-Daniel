import java.util.ArrayList;
import java.util.List;

public class Armada {
    private List<Ship> ships;

    public Armada() {
        this.ships = new ArrayList<>();
    }
    public void fillArmada() {
        for (int i = 0; i < 10; i++) {
            this.ships.add(new Ship());
            ships.get(i).fillShip();
        }
    }
    public void armadaStatus() {
        for (Ship ship : ships) {
            System.out.println(ship.shipStatus());
        }
    }
    public void war(Armada other) {
        for (int i = 0; i < ships.size(); i++) {
            for (int j = 0; j < other.ships.size(); j++) {
                ships.get(i).battle(other.ships.get(j));
            }
        }
    }

}
