import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        // Modify this program to greet the User instead of the World!
        // The program should ask for the name of the User
       // System.out.println("Hello, World!");

        Scanner name = new Scanner(System.in);
        System.out.println("Enter is your name");
        String userName = name.nextLine();
        System.out.println("Hello " + userName + (" !! <3"));
    }
}