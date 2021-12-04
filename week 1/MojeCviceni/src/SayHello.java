import java.util.Scanner;

public class SayHello {
    public static void main(String[] args) {

        Scanner year = new Scanner(System.in);
        System.out.println("what year u wanna to count? :");
        int whatYear = year.nextInt();
        int remainYears = yearsTillCentury(whatYear);
        System.out.println(remainYears + " is the remain of your century!");
    }




//    }
    //kolik let chybi do konce stoleti
    public static int yearsTillCentury(int currentYear) { // nesmi byt void, protoze vracime hodnotu do main
        int num = currentYear % 100;
        int remainTo = 100 - num;
        return remainTo; //pod return uz nemuze byt nic dalsiho
    }
}
