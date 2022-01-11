public class Bunnies {
    public static void main(String[] args) {
        System.out.println(numOfEars(15));

    }
    public static int numOfEars(int numOfBunnies) {
        if (numOfBunnies == 0) {
            return 0;
        } else if (numOfBunnies < 0) {
            return 0;
        } return numOfEars(numOfBunnies - 1) + 2;
    }
}
// We have a number of bunnies and each bunny has two big floppy ears. Write
// a recursive method (no loops or multiplication) which takes the number of
// bunnies as its sole parameter and returns the total number of ears
// the bunnies have. The method should be able to handle invalid input
// (e.g. negative numbers)