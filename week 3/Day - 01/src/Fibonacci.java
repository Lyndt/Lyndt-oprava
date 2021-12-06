public class Fibonacci {
    public static void main(String[] args) {
//        int index = 0;
//        while (true) {
//            System.out.println(fibonacci(index));
//            index++;
//        }
        System.out.println(fibonacci(13));
        // n = 3/ fibon 3/ fibon 2 + fibon 1 = 1 + 1
        // n = 4/ fibon 4/ fibon 3 + fibon 2 = 2 + 1
        // n = 5/ fibon 5/ fibon 4 + fibon 3 = 3 + 2....
        // n = 13/ fibon 13/ fibon 12 + fibon 11 = 144 + 89...

    }
    public static long fibonacci(int n) {
        if (n < 0) {
            return 0;
        }
        if (n == 0) {
            return 0;
        }
        if (n <= 2) {
            return 1;
        } else {
            long fibTerm = fibonacci(n - 1) + fibonacci(n - 2);
            return fibTerm;
        }

    }
}

// The fibonacci sequence is a famous bit of mathematics,
// and it happens to have a recursive definition.
// The first two values in the sequence are 0 and 1 (essentially 2 base cases).
// Each subsequent value is the sum of the previous two values,
// so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21 and so on.
// Define a recursive fibonacci(n) method that
// returns the nth fibonacci number,
// with n=0 representing the start of the sequence.
// The method should be able to handle invalid input (e.g. negative numbers)
