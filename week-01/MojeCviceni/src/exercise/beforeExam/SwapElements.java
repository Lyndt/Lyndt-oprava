package exercise.beforeExam;

public class SwapElements {
    public static void main(String[] args) {
        String[] orders = {"first", "second", "third"};
        String temp = orders[0];
        orders[0] = orders[2];
        orders[2] = temp;
        for (int i = 0; i < orders.length; i++) {
            System.out.print(orders[i] + " ");

        }
    }
}
// - Create an array variable named `orders`
//   with the following content: `["first", "second", "third"]`
// - Swap the first and the third element of `orders`