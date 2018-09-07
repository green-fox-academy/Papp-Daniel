import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        // Write a function that copies a file to an other
        // It should take the filenames as parameters
        // It should return a boolean that shows if the copy was successful

        Path filePath = Paths.get("text.txt");


    }
    public boolean chechCopy (Path filepath ){
        try {
            FileChannel src = new FileInputStream("text.txt").getChannel();
            FileChannel dest = new FileOutputStream("text2.txt").getChannel();
            dest.transferFrom(src,0,src.size());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }
}
