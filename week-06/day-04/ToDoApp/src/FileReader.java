import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.emptyList;

public class FileReader {
    public static final String filename = "src/ToDo.txt";

    public List<Task> loadTasks() {
        try {
            List<Task> tasks = new ArrayList<>();
            List<String> lines = Files.readAllLines(Paths.get(filename));

            for (String line : lines) {
                String[] parts = line.split("-");
                String[] parts2 = parts[1].split(" ");

                if (parts.length < 2) {
                    throw new RuntimeException("File corrupted");
                }
                String name="";
                for (int i = 3; i <= parts2.length-1; i++) {
                    name += parts2[i];
                    name += " ";
                }
                Task task = new Task(Long.parseLong(line.substring(0,1)), name,false);
                tasks.add(task);
            }

            return tasks;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return emptyList();
    }
}