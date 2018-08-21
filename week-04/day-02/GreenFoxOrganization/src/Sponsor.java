public class Sponsor extends Person {
    String company;
    int hiredStudents;

    Sponsor(String name, int age, String gender, String company) {
        super(name, age, gender);
        this.company = company;
    }

    @Override
    void introduce() {
        System.out.println("Hi, I'm " + this.getName() + " , a " + this.getAge() + " year old " + this.getGender() + " who represents " + company + " and hired " + hiredStudents + " students so far.");
    }
    void hire(){
        hiredStudents++;
    }

    @Override
    void getGoal() {
        System.out.println("Hire brilliant junior software developers.");
    }
}
