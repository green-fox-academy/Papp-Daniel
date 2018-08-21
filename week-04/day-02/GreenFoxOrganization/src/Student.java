public class Student extends Person {
    String previousOrganization;
    int skippedDays;

    Student(String name, int age, String gender, String previousOrganization){
        super(name,age,gender);
        this.skippedDays = 0;
        this.previousOrganization = "The School of Life";
    }

    @Override
    void getGoal() {
        System.out.println("Be a junior software developer");
    }

    void introduce() {
        System.out.println("Hi, I'm " + this.getName() + " a "+this.getAge()+" year old "+this.getGender()+" from "+previousOrganization);

    }
    void skipDays(int skippedDays, int numberOfDays){
        skippedDays+=numberOfDays;
        System.out.println("I have skipped " + skippedDays + " days");
    }




}
