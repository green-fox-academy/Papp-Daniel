public class TakesLonger {
    public static void main(String[] args) {
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        StringBuffer builder = new StringBuffer("Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.");
        builder.replace(18,21," It always takes longer than");

        System.out.println(builder);

        //System.out.println(a.indexOf("It"));
        //System.out.println(a.indexOf("you"));

    }
}
