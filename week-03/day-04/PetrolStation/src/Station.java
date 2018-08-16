public class Station {
    static int gasAmount;

    Station(int gasAmount){
        this.gasAmount = 1000;
    }

    static void refill(){
        Station.gasAmount -= Car.capacity;
        Car.gasAmount += Car.capacity;
    }
}
