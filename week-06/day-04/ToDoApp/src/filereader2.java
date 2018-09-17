import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class filereader2 {
    public static final String filename = "src/ToDo.txt";

    public List<Task> loadTasksNew(){
        try {
            List<String> lines = Files.readAllLines(Paths.get(filename));

        } catch (IOException e) {
            System.out.println("No file exist!");
        }
        return null;
    }
}
