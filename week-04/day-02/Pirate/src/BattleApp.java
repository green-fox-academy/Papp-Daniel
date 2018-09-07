public class BattleApp {
    public static void main(String[] args) {
        Ship ship1 = new Ship();
        Ship ship2 = new Ship();
        Armada armada = new Armada();
        Armada armada2 = new Armada();

        ship1.fillShip();
        ship2.fillShip();

        System.out.println(ship1.shipStatus());
        System.out.println("--------------------------");
        System.out.println(ship2.shipStatus());
        System.out.println(ship1.battle(ship2));
        System.out.println("--------------------------");
        System.out.println(ship1.shipStatus());
        System.out.println("--------------------------");
        System.out.println(ship2.shipStatus());
        System.out.println("--------------------------");
        armada.fillArmada();
        armada2.fillArmada();
        armada.armadaStatus();
        armada2.armadaStatus();
        System.out.println("--------------------------");
        armada.war(armada2);
        armada.armadaStatus();
        System.out.println("--------------------------");
        armada2.armadaStatus();
    }
}
