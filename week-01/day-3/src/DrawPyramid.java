import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How tall it should be?");
        int tall = scanner.nextInt();


        for (int a = 0; a < tall; a++) {
            for (int b = tall; b >= a; b--) {
                System.out.print(" ");
            }
            for (int c = 0; c <= a; c++) {
                System.out.print(" *"); //bez mezery to bude zase triangle
            }
            System.out.println();



        }
    }
}
