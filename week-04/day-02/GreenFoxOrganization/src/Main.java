public class Main {
    public static void main(String[] args) {
        Sponsor sponsor = new Sponsor("asdf", 22, "male", "Google");
        sponsor.hire();
        sponsor.getGoal();
        sponsor.introduce();

        Student student = new Student("asdf", 22, "male", "asdf");
        student.introduce();

    }
}
