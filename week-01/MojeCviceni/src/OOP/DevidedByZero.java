package OOP;

import java.util.Scanner;

public class DevidedByZero {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What number you wanna divide 10 by?: ");
        int input = scanner.nextInt();
        divisor(input);
    }
    public static void divisor(int inputUser) {
        try {
            int result = 10 / inputUser;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.err.println("You can't divide by 0, dummy!!");
        }
    }
}
