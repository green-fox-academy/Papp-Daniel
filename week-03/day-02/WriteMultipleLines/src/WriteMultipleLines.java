import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WriteMultipleLines {
    public static void main(String[] args) {
        Path filePath = Paths.get("my-file.txt");
        String newWord = "apple";
        int numbOfLines = 5;
        getNewWord(filePath, newWord, numbOfLines);


    }

    public static void getNewWord(Path filpath, String newWord, int numbOfLines) {
        List<String> contantOfFile = new ArrayList<>();
        for (int i = 0; i < numbOfLines; i++) {
            contantOfFile.add(newWord);
        }
        try {
            Files.write(filpath, contantOfFile);
        } catch (Exception e) {
            System.out.println("Can not get a word into the file");
        }
    }
}
