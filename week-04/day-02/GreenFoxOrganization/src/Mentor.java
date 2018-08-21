public class Mentor extends Person {
    String level;

    Mentor(String name, int age, String gender, String level) {
        super(name, age, gender);
        this.level = level;
    }

    void getGoal() {
        System.out.println("Educate brilliant junior software developers.");
    }

    void introduce() {
        System.out.println("Hi I am " + this.getName() + " a " + this.getAge() + " years old " + this.getGender() + " " + level + " to intermediate");
    }

}
