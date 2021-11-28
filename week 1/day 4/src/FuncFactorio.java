//urcuje kolika způsoby můžu uspořádat daný počet prvků
public class FuncFactorio {
    public static void  main(String[] args) {
        int number = 10; //prirozene cislo nebo nula (n!=n*(n-1)*(n-2)....)
        System.out.println(calculateFactorial(number));
    }
    public static int calculateFactorial(int factorialos) {
        int factorial= 1;
        for (int i = 1; i < factorialos + 1; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
}
//  Create the usual class wrapper and main method on your own
// - Create a function called `calculateFactorial()`
//   that returns the factorial of its input