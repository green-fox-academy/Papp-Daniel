public class BattleApp {
    public static void main(String[] args) {
        Ship ship1 = new Ship();
        Ship ship2 = new Ship();
        Armada armada = new Armada();
        Armada armada2 = new Armada();

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
