public class Main {
    public static void main(String[] args) {
        Gnirts gnirts = new Gnirts("asdfsd");

        System.out.println(gnirts.text);
        System.out.println(gnirts.text.length());
        System.out.println(gnirts.text.charAt(2));
        System.out.println(gnirts.text.subSequence(1,5));

        System.out.println("--------------------------------------------------");

        Shifter shifter = new Shifter("asdfghjkl", 3);
        System.out.println(shifter.text);
        System.out.println(shifter.length());
        System.out.println(shifter.charAt(2));
        System.out.println(shifter.subSequence(1,3));

    }
}
