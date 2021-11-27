import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        // Write a program that asks for two numbers and prints the bigger one

        Scanner scanner = new Scanner(System.in);
        System.out.println("add number");
        int firstNum = scanner.nextInt();
        System.out.println("add next number");
        int secNum = scanner.nextInt();

        if (firstNum > secNum)
            System.out.println("first number " +firstNum+" is bigger");
        else
            System.out.println("second number " +secNum+ " is bigger");
    }
}