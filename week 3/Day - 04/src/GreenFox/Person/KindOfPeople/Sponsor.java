package GreenFox.Person.KindOfPeople;

import GreenFox.Person.Person;

public class Sponsor extends Person {
    protected String company;
    protected int hiredStudents;

    public Sponsor(String name, int age, String gender) {
        super(name, age, gender);
    }
}
