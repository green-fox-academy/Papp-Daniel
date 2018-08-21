import java.util.ArrayList;
import java.util.List;

public class Cohort {
    private String name;
    private List<Student> listOfStudent;
    private List<Mentor> listOfMentors;

    Cohort() {
        this.name = "badboi";
        this.listOfStudent = new ArrayList<Student>();
        this.listOfMentors = new ArrayList<Mentor>();
    }

    void addStudent(Student student) {
        this.listOfStudent.add(student);
    }

    void addMentor(Mentor mentor) {
        this.listOfMentors.add(mentor);
    }

    void info() {
        System.out.println("The " + name + " cohort has " + listOfStudent.size() + " students and " + listOfMentors.size() + " mentors.");
    }
}
