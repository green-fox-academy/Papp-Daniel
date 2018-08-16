public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(0,0);
        Station station1 = new Station(1000);
        Station.refill();
        System.out.println(station1.gasAmount);
        System.out.println(car1.gasAmount + " " + car1.capacity);
    }
}
