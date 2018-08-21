import java.util.ArrayList;
import java.util.List;

public class Cohort {
    private String name;
    private List<String> listOfStudent;
    private List<String> listOfMentors;

    Cohort() {
        this.name = name;
        this.listOfStudent = new ArrayList<>();
        this.listOfMentors = new ArrayList<>();
    }
    void addStudent(Student student){
        listOfStudent.add(1,student);
    }
}
