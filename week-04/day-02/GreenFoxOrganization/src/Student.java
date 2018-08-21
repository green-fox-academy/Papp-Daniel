public class Student extends Person {
    String previousOrganization;
    int skippedDays;

    @Override
    void getGoal() {
        System.out.println("Be a junior software developer");
    }

    void introduce() {
        System.out.println("Hi, I'm " + name + " a "+age+" year old "+gender+" from "+previousOrganization);
    }
    void skipDays(int skippedDays, int numberOfDays){
        skippedDays+=numberOfDays;
    }

    Student(String name, int age, String gender, String previousOrganization){
        super(name,age,gender);
        this.skippedDays = 0;
    }
    Student(String name, int age, String gender){
        super(name,age,gender);
        this.previousOrganization = "The School of Life";
        this.skippedDays = 0;
    }

}
