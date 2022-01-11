package com.oldexercises;

import java.util.Scanner;

public class CalculateFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What number you wanna make factorial from? :");
        int numberFromUser = scanner.nextInt();
        System.out.println("Factorial of " + numberFromUser + " is " + calculateFactorial(numberFromUser));
    }

    public static int calculateFactorial(int scan) {
        int number = 0;
        int result = 0;
        for (int i = 1; i <= scan; i++) {
            number += i;
            result = number / scan;
        }
        return result;

    }

}
//  Create the usual class wrapper and main method on your own

// - Create a function called `calculateFactorial()`
//   that returns the factorial of its input