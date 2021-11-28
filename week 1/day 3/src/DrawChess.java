package src;

import java.util.Scanner;

public class DrawChess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How big chess should be? :");
        int c = scanner.nextInt();
        for (int a = 0; a < c; a++) {
            for (int b = 0; b < c; b++) {
                if (a % 2 != 0) {              //pokud se rovna 2, budou řádky prohozeny
                    System.out.print(" %");
                } else {
                    System.out.print("% ");
                }
            }
            System.out.println();
        }
    }
}