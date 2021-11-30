import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class ListIntroduction2 {
    public static void main(String[] args) {

        ArrayList<String> listA = new ArrayList<>(Arrays.asList("Apple", "Avocado", "Blueberries", "Durian", "Lychee"));

        ArrayList listB = new ArrayList(listA);

        System.out.println(listB.contains("Durian"));
        listB.remove("Durian");

        listA.add(4,"Kiwifruit");
       // System.out.println(listA);
       // System.out.println(listB);

      /*  if(listA.size() == listB.size()) {
            System.out.println("list A and list B has a same size");
        } else if(listA.size() > listB.size()) {
            System.out.println("list A is bigger than list B");
        } else {
            System.out.println("list A is smaller than list B");
        } */
        System.out.println(listA.size() == listB.size());

        System.out.println(listA.indexOf("Avokado"));
        System.out.println(listB.indexOf("Durian"));

        listB.addAll(Arrays.asList("Passion Fruit","Pomelo"));
        System.out.println(listB);

        System.out.println(listA.get(2));

        System.out.println(listA);
        System.out.println(listB);



    }
}
/*Create a list ('List A') which contains the following values
Apple, Avocado, Blueberries, Durian, Lychee
Create a new list ('List B') with the values of List A
Print out whether List A contains "Durian" or not
Remove "Durian" from List B
Add "Kiwifruit" to List A after the 4th element
Compare the size of List A and List B
Get the index of "Avocado" from List A
Get the index of "Durian" from List B
Add "Passion Fruit" and "Pomelo" to List B in a single statement
Print out the 3rd element from List A
Print all elements of List A
Print all elements of List B
The full output of your main method should be the following:

true
false
1
-1
Blueberries
[Apple, Avocado, Blueberries, Durian, Kiwifruit, Lychee]
[Apple, Avocado, Blueberries, Lychee, Passion Fruit, Pomelo]

 */