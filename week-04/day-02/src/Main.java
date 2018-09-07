public class Main {
    public static void main(String[] args) {
        Carrier carrier = new Carrier(1000,500);
        carrier.add(new F35());
        carrier.add(new F35());
        carrier.add(new F35());
        carrier.add(new F16());
        carrier.add(new F16());
        carrier.add(new F16());
        Carrier enemy = new Carrier(1000,1000);
        enemy.add(new F35());
        enemy.add(new F35());
        enemy.add(new F35());
        enemy.add(new F16());
        enemy.add(new F16());
        enemy.add(new F16());

        carrier.fill();
        carrier.getStatus();
        System.out.println("-------------------------------");
        enemy.fill();
        carrier.fight(enemy);
        carrier.getStatus();
        System.out.println("--------------------");
        enemy.getStatus();

    }
}
