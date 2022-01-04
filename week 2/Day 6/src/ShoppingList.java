import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingList {
    public static void main(String[] args) {

        ArrayList<String> shoppingList = new ArrayList<>(Arrays.asList("eggs", "milk", "fish", "apples", "bread", "chicken"));
        if (shoppingList.contains("bananas")) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        if (shoppingList.contains("milk")) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}

/*    We are going to represent a shopping list by a list containing strings.

        Create a list with the following items:
        eggs, milk, fish, apples, bread and chicken
        Create an application which prints out the answers to the following questions:
        Do we have milk in the shopping list? (yes/no)
        Do we have bananas in the shopping list? (yes/no)
        The full output of your main method should be the following:

        yes
        no */