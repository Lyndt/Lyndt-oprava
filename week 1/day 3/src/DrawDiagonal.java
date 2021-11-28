import java.util.Scanner;

public class DrawDiagonal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many lines?");
        int lines = scanner.nextInt();

        for (int a = 0; a < lines; a++) {
            for (int b = 0; b < lines; b++) {
                if (a == 0 || a == lines-1 || b == 0 || b == lines -1 || a == b) {
                    System.out.print("%");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }


    }
}// Write a program that reads a number from the standard input, then draws a
// square like this:
//
//
// %%%%%
// %%  %
// % % %
// %  %%
// %%%%%
//
// The square should have as many lines as the number was
