package GreenFox;


import GreenFox.Person.KindOfPeople.Mentor;
import GreenFox.Person.KindOfPeople.Student;
import GreenFox.Person.Person;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {

        ArrayList<Person> people = new ArrayList<>();
        Person linda = new Person("Linda Sukovská", 34, "female");
        people.add(linda);
        Person jane = new Student("Jane Doe", 30, "female", "school of life",0);
        people.add(jane);
        Person john = new Mentor("John Doe", 40, "male", "senior");
        people.add(john);

        for (Person person : people) {
            person.introduce();
            person.getGoal();
            System.out.println();




        }








    }
}
