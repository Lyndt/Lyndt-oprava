package GreenFox.Person;

public class Person {
    protected String name;
    protected int age;
    protected String gender;


    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public String myGoal() {
        return "My goal is: ";

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void getGoal() {
        System.out.println("My goal is: Live for the moment!");
    }


    public void introduce() {
        System.out.println("Hi, I'm " + getName() + ", a " + getAge() + " years old.");
    }

}
