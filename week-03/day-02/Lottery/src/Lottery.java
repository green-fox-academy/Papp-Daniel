import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Lottery {

    public static void main(String[] args) {
        // Create a method that find the 5 most common lottery numbers in lottery.csv
        System.out.println(findTheMostCommon("lottery.csv"));

    }
    public static Integer findTheMostCommon (String filename) {
        List<Integer> lotteryNumbers = new ArrayList<>();
        Integer result = 0;
        try {
            Path filePath = Paths.get(filename);
            List<String> lines = Files.readAllLines(filePath);
            for (int i = 0; i < lines.size(); i++) {
                String[] splittedLines = lines.get(i).split(";");
                lotteryNumbers.add(Integer.parseInt(splittedLines[11]));
                lotteryNumbers.add(Integer.parseInt(splittedLines[12]));
                lotteryNumbers.add(Integer.parseInt(splittedLines[13]));
                lotteryNumbers.add(Integer.parseInt(splittedLines[14]));
                lotteryNumbers.add(Integer.parseInt(splittedLines[15]));
            }
            Map<Integer,Integer> map = new HashMap<>();
            for (Integer lotteryNumber : lotteryNumbers) {
                Integer counter = map.get(lotteryNumber);
                if (counter == null){
                    counter = 1;
                }
                map.put(lotteryNumber,counter+1);
            }
            Map.Entry<Integer,Integer> max = null;
            for (Map.Entry<Integer,Integer> counter : map.entrySet()){
                if (max ==null || max.getValue() < counter.getValue()){
                    max = counter;
                }
            }
            result = max.getKey();
        } catch (IOException e) {
            System.out.println("Could not read the file!");
        }
        return result;
    }
}