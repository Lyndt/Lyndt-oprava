import java.util.ArrayList;

public class ListIntroduction {
    public static void main(String[] args) {


        nameList();
    }

    private static void nameList() {
        ArrayList names = new ArrayList();
        System.out.println(names.size());

        names.add("William");
        System.out.println("is list empty? : " + names.isEmpty());

        names.add("John");
        names.add("Amanda");
        System.out.println(names.size());

        System.out.println(names.get(2));

        for (int a = 0; a < names.size(); a++){
            System.out.println(names.get(a));
        }
        System.out.println("\t");
        for (int a = 0; a < names.size(); a++){
            System.out.println(a+1 +". " + names.get(a));
        }

        System.out.println("\t");
        names.remove(1);
        System.out.println(names);

        System.out.println("\t");
        for (int a = 0; a < names.size(); a++){
            System.out.println(names.get(names.size() -1 - a));
        }
        System.out.println("\t");
        names.clear();
        System.out.println(names.size());




    }
}
/* Create an empty list which will contain names (strings)
Print out the number of elements in the list -
Add "William" to the list -
Print out whether the list is empty or not -
Add "John" to the list -
Add "Amanda" to the list -
Print out the number of elements in the list -
Print out the 3rd element
Iterate through the list and print out each name:

William
John
Amanda

Iterate through the list and print:

1. William
2. John
3. Amanda

Remove the 2nd element
Iterate through the list in a reversed order and print out each name:

Amanda
William

Remove all elements
Print out the number of elements in the list
The full output of your main method should be the following:

0
false
3
Amanda
William
John
Amanda
1. William
2. John
3. Amanda
Amanda
William
0

 */