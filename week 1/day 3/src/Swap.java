public class Swap {
    public static void main(String[] args) {
        // Swap the values of the variables
        int a = 123;
        int b = 526;

        System.out.println("before swap");
        System.out.println(a);
        System.out.println(b);

        System.out.println("after swap");
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a);
        System.out.println(b);


    }
}