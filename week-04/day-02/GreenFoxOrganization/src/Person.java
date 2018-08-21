public class Person {
    String name;
    int age;
    String gender;

    void introduce(String name, int age, String gender) {
        System.out.println("Hi I am " + name + "a " + age + " years old " + gender + "!");
    }

    void getGoal(){
        System.out.println("I wanne be the very best, like no one ever was!");
    }
    Person(String name, int age, String gender){

    }
    public Person(){
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = "female";
    }
}
