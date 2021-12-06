public class SumDigits {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(152));


    }
    public static int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        } else {
            return (n % 10 +sumOfDigits(n / 10));
        }
    }
}
// Given a non-negative integer n, return the sum of its digits recursively
// (without loops).
//
// Hint
//
// Mod (%) by 10 yields the rightmost digit (e.g. 126 % 10 is 6)
//
// Divide (/) by 10 removes the rightmost digit (e.g. 126 / 10 is 12).