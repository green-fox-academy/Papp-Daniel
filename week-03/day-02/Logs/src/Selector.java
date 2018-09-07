import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Selector {

    public Selector() {
    }

    public String[] getTheIp() {

        String[] IPs;
        try {
            Path filePath = Paths.get("src/text.txt");
            List<String> lines = Files.readAllLines(filePath);
            for (String line : lines) {
                IPs = line.split("\\s");
                String Ips = IPs[8];
                IPs = new String[] {IPs[8]};
            }
        } catch (IOException e) {
            System.out.println("The file is not exist");
        }
        System.out.println(IPs[8]);
        return IPs;
    }
}
