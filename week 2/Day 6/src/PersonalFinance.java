import java.util.*;

public class PersonalFinance {
    public static void main(String[] args) {

        ArrayList<Integer> sum = new ArrayList(Arrays.asList());
        sum.add(500);
        sum.add(1000);
        sum.add(1250);
        sum.add(175);
        sum.add(800);
        sum.add(120);


        int howMuchSpend = 0;

        for (int a = 0; a < sum.size(); a++){
            howMuchSpend  += sum.get(a);

        }
        System.out.println("We spend totally of " +howMuchSpend + " money!");
        System.out.println(Collections.max(sum) + " was max spend");
        System.out.println(Collections.min(sum) + " was smallest spend");

        float aaverageSum = howMuchSpend / sum.size();
        System.out.println(aaverageSum+ " is average spend!");


    }
}

/*    We are going to represent our expenses in a list containing integers.

        Create a list with the following items:
        500, 1000, 1250, 175, 800 and 120
        Create an application which prints out the answers to the following questions:
        How much did we spend?
        Which was our greatest expense?
        Which was our cheapest spending?
        What was the average amount of our spendings? (print this as a float value)
        The full output of your main method should be the following:

        3845
        1250
        120
        640.8333

 */