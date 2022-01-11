package com.oldexercises;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What number you wanna to sum?");
        int usersNumber = scanner.nextInt();
        System.out.println(usersNumber + " is your number...");
        System.out.println("...so sum from 0 to your number is " + sum(usersNumber));

    }

    public static int sum(int scan) {
        int sumOfNumbers = 0;
        for (int i = 1; i <= scan; i++) {
            sumOfNumbers += i;
        }
        return sumOfNumbers;

    }
}
// Create the usual class wrapper and main method on your own

// Write a function called `sum()` that returns the sum of numbers from zero to the given parameter