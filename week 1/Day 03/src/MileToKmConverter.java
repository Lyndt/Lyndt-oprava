import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for a double that is a distance in miles,
        // then it converts that value to kilometers and prints it

        Scanner miles = new Scanner(System.in);
        System.out.println("How many miles you wanna converts to kilometers?? : ");
        double userMiles = miles.nextDouble();

        // 1 mile = 1,609344 kilometers
        double userKilometers = userMiles * 1.609344;

        System.out.println(userMiles + (" miles is ") + userKilometers + (" kilometers :-)"));
    }
}