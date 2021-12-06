public class Power {
    public static void main(String[] args) {

        System.out.println(nAndBase(3, 2));

    }

    public static int nAndBase(int n, int base) {
        if (base >= 1) {
            return (n * nAndBase(n, base - 1));
        } else {
            return 1;
        }
    }
}
/// Given base and n that are both 1 or more, write a recursive method (no loops)
//// which returns the value of base to the n-th power, so powerN(3, 2) is 9 (3  ).