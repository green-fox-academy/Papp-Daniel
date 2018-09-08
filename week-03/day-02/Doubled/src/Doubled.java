import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Doubled {

    public static void main(String[] args) {
        // Create a method that decrypts the duplicated-chars.txt
        decryptsTheDuplicated("file.txt");

    }

    public static void decryptsTheDuplicated(String filename) {
        String result = "";
        List<String> a = new ArrayList<>();
        try {
            Path filePath = Paths.get(filename);
            List<String> lines = Files.readAllLines(filePath);
            for (int i = 0; i < lines.size(); i++) {
                String[] character = lines.get(i).split("(?!^)");
                for (int j = 0; j < character.length; j++) {
                    a.add(character[j]);
                }
                    for (int k = 0; k < a.size(); k++) {
                        if (a.get(k).contains (a.get(k + 1))) {
                            a.remove(k);
                        }
                        System.out.print(a.get(k));
                    }
                }

       } catch (IOException e) {
           System.out.println("No file");
       }
    }
}