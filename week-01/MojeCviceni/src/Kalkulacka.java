import java.util.Scanner;

public class Kalkulacka {
    public static void main(String[] args) {
        dividingWithReminder();






    }
    public static void dividingWithReminder() {
        Scanner divNum = new Scanner(System.in);
        double dividentNum;
        double divisor;
        System.out.println("enter divident:");
        dividentNum = divNum.nextDouble();
        System.out.println("enter divisor:");
        divisor = divNum.nextDouble();
        double result = dividentNum / divisor;
        System.out.println(dividentNum +" / "+ divisor +" = "+ result);
        System.out.println("and reminder is "+ dividentNum % divisor);


    }


}
