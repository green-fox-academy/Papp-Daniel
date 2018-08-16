public class Main {
    public static void main(String[] args) {
        Sharpie sharpie1 = new Sharpie("red", 33, 100);
        sharpie1.use();

        System.out.println(sharpie1.inkAmount);
    }
}
