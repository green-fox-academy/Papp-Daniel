public class Animal {
    int hunger;
    int thirst;

    Animal(int hunger, int thirst) {
        this.hunger = 50;
        this.thirst = 50;

    }
    void eat(){
        this.hunger -= 1;

    }
    void drink(){
        this.thirst -= 1;
    }
    void play(){
        this.thirst += 1;
        this.hunger += 1;
    }
}
