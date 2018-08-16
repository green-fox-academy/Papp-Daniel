public class Counter {
    int value;
    int number;

    Counter(int value, int number) {
        this.value = value;
    }

    void add(int number) {
        this.number = value + number;
    }

    void add() {
        this.value += 1;
    }
    void get(){
        this.value = value;
    }
    void reset(){
        
    }
}
