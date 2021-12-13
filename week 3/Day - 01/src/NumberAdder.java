public class NumberAdder {
    public static void main(String[] args) {
        System.out.println(recursiveN(10));

    }
    public static int recursiveN(int n) {
        if (n < 1 ) {
            return 0;
        }
        else {
            return n + recursiveN(n - 1);
        }

    }

}
// Write a recursive function that takes one parameter: n and returns
// the sum of numbers (integers) from 1 to n. The function should
// return 0 for inputs less than 1.