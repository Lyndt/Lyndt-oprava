import java.util.Scanner;

public class DividedByZero {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What number u wanna divide by 10? : ");
        int usersNum = scanner.nextInt();

        divideByNum(usersNum);
    }

    private static void divideByNum(int usersNum) {

        try {
            int num10 = 10;
            int a = num10 / usersNum;
            System.out.println(num10 + " / " + usersNum + " = " + a);
        }
        catch (ArithmeticException zero){
            System.out.println("U can't divide by zero!");
        }
    }
}
// Create a function that divides number 10
// by a number that's passed as a paramater and prints the result.
// It should print "fail" if the parameter is 0