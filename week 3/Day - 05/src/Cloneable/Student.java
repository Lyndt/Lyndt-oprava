package Clonable;

public class Student extends Person implements Cloneable {

    public String previousOrganization; //the name of the student’s previous company / school
    public int skippedDays; //the number of days skipped from the course


    public void getGoal() {
        System.out.println("Be a junior software developer.");
    }

    public void introduce() {
        System.out.println("Hi,I'm " + name + " ,a " + age + " year old " + gender + " from " + previousOrganization + " who skipped" + skippedDays + "days from the course already.");
    }

    public void skipDays(int numberOfDays) {
        this.skippedDays += numberOfDays;
    }

    public Student(String name, int age, String gender, String previousOrganization) {
        super(name, age, gender);
        this.previousOrganization = previousOrganization;

    }


    public Student() {

        this.previousOrganization = "the school of life";
        this.skippedDays = 0;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}