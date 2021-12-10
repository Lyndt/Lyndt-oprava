package GreenFox.Person.KindOfPeople;

import GreenFox.Person.Person;

public class Student extends Person {
    protected String previousOrganization;
    protected int skippedDays;

    public Student(String name, int age, String gender, String previousOrganization, int skippedDays) {
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
        this.skippedDays = skippedDays;
    }


    @Override
    public void getGoal() {
        System.out.println(super.myGoal() + "Be a junior software developer.");
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name +", a " + age + " year old " + gender + " from " + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
    }
}
