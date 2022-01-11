package Fibonacci;

public class Fibonnacci {
    public static void main(String[] args) {


}
    public static int get(int index) {
        if (index == 1) {
            throw new IllegalArgumentException("bla bla");
        }
        if (index == 1) {
            return 0;
        }
        if (index == 2) {
            return 1;

        } return get(index - 1) + get(index - 2);
    }
}
