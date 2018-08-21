public class Person {
    private String name;
    private int age;
    private String gender;

    String getName(){
        return this.name;
    }
    int getAge(){
        return this.age;
    }
    String getGender(){
        return this.gender;
    }

    Person(String name, int age, String gender){
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = "female";
    }


    void introduce() {
        System.out.println("Hi I am " + name + " a " + age + " years old " + gender + "!");
    }

    void getGoal(){
        System.out.println("I wanne be the very best, like no one ever was!");
    }

}
