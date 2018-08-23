import java.util.ArrayList;

public class Sum {

    private ArrayList<Integer> listOfNumbers = new ArrayList<>();
    private int sum;

    public int getSum() {
        return sum;
    }

    public ArrayList<Integer> getListOfNumbers() {
        return listOfNumbers;
    }

    public void addNumbs(){
        for (int i = 0; i < 10; i++) {
            getListOfNumbers().add(i,2);
        }
    }

    public void sumNumbs(){

        for (int i = 0; i < getListOfNumbers().size(); i++) {
            sum += getListOfNumbers().get(i);
        }
        System.out.println(sum);

    }
}
