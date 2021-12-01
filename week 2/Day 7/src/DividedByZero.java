import java.util.Scanner;

public class DividedByZero {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What number u wanna divide by 0? : ");
        double usersNum = scanner.nextLine();

        divideByNum(usersNum);
    }

    private static void divideByNum(double usersNum) {

        try {
            double num10 = 10;
            double a = num10 / usersNum;
            System.out.println(10 +  " / " + usersNum+ " = " a);
        }
    }
}
// Create a function that divides number 10
// by a number that's passed as a paramater and prints the result.
// It should print "fail" if the parameter is 0