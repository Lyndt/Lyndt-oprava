import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
// triangle like this:
//
// *
// **
// ***
// ****
//
// The triangle should have as many lines as the number was

        Scanner scanner = new Scanner(System.in);
        System.out.println("how many lines you want? : ");
        int num = scanner.nextInt();

        for (int a = 0; a <= num; a++) {
            for (int b = 0; b < a; b++) {
                System.out.print("*");
            }  System.out.println();

        }


    }
}
