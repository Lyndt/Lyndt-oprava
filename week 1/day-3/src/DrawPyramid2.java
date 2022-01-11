import java.util.Scanner;

public class DrawPyramid2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("how many lines?");
        int num = scanner.nextInt();

        for (int a = 1; a <= num; a++) { //nebo a=0;a<num;a++
            for (int b = a; b < num; b++) {
                System.out.print(" ");
            }
            for (int b = 1; b < a; b++) { //b=0;b<=a;b++
                System.out.print("*");
            }
            for (int b = 1; b <= a; b++) { //b=0;b<a;b++
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
