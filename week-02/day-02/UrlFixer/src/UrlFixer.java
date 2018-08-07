import java.util.ArrayList;
import java.util.Arrays;

public class UrlFixer {
    public static void main(String[] args) {

        String url = "https//www.reddit.com/r/nevertellmethebots";

        url = url.replace("bots", "odds");
        url = url.replaceAll("https","https:");

        System.out.println(url);

    }
}
