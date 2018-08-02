public class Cuboid {
    public static void main (String[] args) {
        double aside = 10;
        double bside = 10;
        double cside = 10;

        double volume = aside * bside * cside;
        double surface = 2 * (aside * bside + aside * cside + bside * cside);

        System.out.println("volume:"+volume);
        System.out.println("surface:"+surface);
    }
}
