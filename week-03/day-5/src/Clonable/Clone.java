package Clonable;

public class Clone {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student = new Student("JohnTheClone,",20,"male","BMI");
        Student JohnTheClone = ((Student)student.clone());

        JohnTheClone.introduce();


    }


}