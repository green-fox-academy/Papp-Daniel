import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReversedLines {

    public static void main(String[] args) {
        // Create a method that decrypts reversed-lines.txt
    decryptsReversedLines("reversedlines.txt");

    }
    public static void decryptsReversedLines (String filename){
        try {
            Path filePath = Paths.get(filename);
            List<String> lines = Files.readAllLines(filePath);
            for (String line : lines) {
                byte[]lineToByte = line.getBytes();
                byte[] result = new byte[lineToByte.length];
                for (int i = 0; i < lineToByte.length; i++) {
                    result[i] = lineToByte[lineToByte.length-i-1];
                }
                System.out.println(new String(result));
            }
        } catch (IOException e) {
            System.out.println("No file");
        }
    }
}