import java.util.HashMap;
import java.util.Map;

public class ShoppingfList2 {
    public static void main(String[] args) {


        HashMap<String, Double> productPrices = new HashMap<>();
        productPrices.put("Milk", 1.07);
        productPrices.put("Rice", 1.59);
        productPrices.put("Eggs", 3.14);
        productPrices.put("Cheese", 12.60);
        productPrices.put("Chicken Breasts", 9.40);
        productPrices.put("Apples", 2.32);
        productPrices.put("Tomato", 2.58);
        productPrices.put("Potato", 1.75);
        productPrices.put("Onion", 1.10);

        HashMap<String, Integer> bobShoppingList = new HashMap<>();
        bobShoppingList.put("Milk", 3);
        bobShoppingList.put("Rice", 2);
        bobShoppingList.put("Eggs", 2);
        bobShoppingList.put("Cheese", 1);
        bobShoppingList.put("Chicken Breasts", 4);
        bobShoppingList.put("Apples", 1);
        bobShoppingList.put("Tomato", 2);
        bobShoppingList.put("Potato", 1);
        bobShoppingList.put("Bananas", 1);

        HashMap<String, Integer> aliceShoppingList = new HashMap<>();
        aliceShoppingList.put("Rice", 1);
        aliceShoppingList.put("Eggs", 5);
        aliceShoppingList.put("Chicken Breasts", 2);
        aliceShoppingList.put("Apples", 1);
        aliceShoppingList.put("Tomato", 10);

        System.out.println(howManyPay(productPrices, bobShoppingList));
        System.out.println(howManyPay(productPrices, aliceShoppingList));
        String stockItem1 = "Rice";
        System.out.println(whoGetMoreOf(aliceShoppingList,bobShoppingList, stockItem1));
        String stockItem2 = "Potato";
        System.out.println(whoGetMoreOf(aliceShoppingList,bobShoppingList, stockItem2));
        String stockItem3 = "Ham";
        System.out.println(whoGetMoreOf(aliceShoppingList, bobShoppingList, stockItem3));
        String stockItem4 = "Apples";
        System.out.println(whoGetMoreOf(aliceShoppingList, bobShoppingList, stockItem4));
        System.out.println(whoBoughtMore(bobShoppingList, aliceShoppingList));
        System.out.println(whoBoughtMoreDiferentItems(aliceShoppingList, bobShoppingList));

    }
    public static String howManyPay(HashMap<String,Double> inStock, HashMap<String,Integer>client) {
        double sum = 0.0;
        for (Map.Entry<String,Integer> key : client.entrySet()) {
            for (Map.Entry<String,Double> keyItem : inStock.entrySet()) {
                if (key.getKey().equals(keyItem.getKey())) {
                    sum += (key.getValue() * keyItem.getValue());
                }

            }

        }
        return String.format("%.2f", sum);

    }
    public static String whoBoughtMore(HashMap<String,Integer> alice, HashMap<String,Integer> bob) {
        int first = 0;
        int second = 0;

        for (Map.Entry<String,Integer> stock : alice.entrySet()) {
            first += stock.getValue();
        }
        for (Map.Entry<String,Integer> stock : bob.entrySet()) {
            second += stock.getValue();
        }
        if (first > second) {
            return "Alice";
        } else {
            return "Bob";
        }


    }
    public static String whoGetMoreOf(HashMap<String,Integer> aliceList, HashMap<String,Integer> bobList, String item) {
        String person = "";
        if (aliceList.containsKey(item) && bobList.containsKey(item) || !aliceList.containsKey(item) && !bobList.containsKey(item)) {
            if (aliceList.get(item) == bobList.get(item)) {
                return "No one";
            }
            else if (aliceList.get(item) < bobList.get(item)) {
                return  "Bob";
            }
            else if (aliceList.get(item) > bobList.get(item)) {
                return "Alice";
            }
        } else if (!aliceList.containsKey(item) && bobList.containsKey(item)) {
            return "Bob";
        } else if (aliceList.containsKey(item) && !bobList.containsKey(item)) {
            return "Alice";
        }
        return person;
    }
    public static String whoBoughtMoreDiferentItems(HashMap<String, Integer> aliceList, HashMap<String, Integer> bobList) {
        String person = "";
        int aliceSum = 0;
        int bobSum = 0;
        for (String stock : aliceList.keySet()) {
            aliceSum += aliceList.get(stock);
        }
        for (String stock : bobList.keySet()) {
            bobSum += bobList.get(stock);
        }
        if (bobSum > aliceSum) {
            return "Bob";
        } else if (aliceSum > bobSum) {
            return "Alice";
        } else {
            return "Both bought same";
        }
    }
}
/* Create an application which prints out the answers to the following questions:

How much does Bob pay?
How much does Alice pay?
Who buys more Rice?
Who buys more Potato?
Who buys more Ham?
Who buys more Apples?
Who buys more of different products?
Who buys more items? (more pieces)
The full output of your main method should be the following:

72.09
64.2
Bob
Bob
no one
no one
Bob
Alice */