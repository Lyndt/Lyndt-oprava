import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        // Write a program that asks for 5 integers in a row,
        // then it should print the sum and the average of these numbers like:
        //
        // Sum: 22, Average: 4.4

        Scanner numbers = new Scanner(System.in);
        System.out.println("add first number");
        int first = numbers.nextInt();
        System.out.println("add second number");
        int sec = numbers.nextInt();
        System.out.println("add third number");
        int third = numbers.nextInt();
        System.out.println("add fourth number");
        int four = numbers.nextInt();
        System.out.println("add five number");
        int five = numbers.nextInt();

        int sum = first + sec + third + four + five;
        int averaage = sum / 5;

        System.out.println("Sum is: " + sum + " , average is: " + averaage);
    }
}