import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class CountLines {
    public static void main(String[] args) {
        // Write a function that takes a filename as string,
        // then returns the number of lines the file contains.
        // It should return zero if it can't open the file, and
        // should not raise any error.

        Path filePath = Paths.get("C:\\Users\\Dániel Papp\\Desktop\\GreenFox\\daniboy01\\week-03\\day-02\\CountLines\\text.txt");
        int numberOfLines = countLines(filePath);
        System.out.println(numberOfLines);

    }

    public static int countLines(Path filePath) {
        int numberOfLines = 0;
        try {
            List<String> lines = Files.readAllLines(filePath);
            for (int i = 0; i < lines.size() ; i++) {
                numberOfLines++;
            }
        } catch (Exception e){
            System.out.println("There are not lines to count");
        }
    return numberOfLines;
    }

}