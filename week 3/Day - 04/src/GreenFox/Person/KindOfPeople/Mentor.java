package GreenFox.Person.KindOfPeople;

import GreenFox.Person.Person;

public class Mentor extends Person {
    protected String level;

    public Mentor(String name, int age, String gender, String level) {
        super(name, age, gender);
        this.level = level;
    }

    @Override
    public void getGoal() {
        System.out.println(super.myGoal() + "Educate brilliant junior software developers.");
    }
    public void introduce() {
        System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + " " + level + " mentor.");
    }
}
