public class Main {
    public static void main(String[] args) {
        Reptiles reptile = new Reptiles("Crocodile",3);
        Mammals mammal = new Mammals("Koala",5);
        Birds bird = new Birds("Parrot",1);

        System.out.println("How do you breed?");
        System.out.println("A " + reptile.getName() + " " + reptile.breed());
        System.out.println("A " + mammal.getName() + " " + mammal.breed());
        System.out.println("A " + bird.getName() + " " + bird.breed());
    }
}
