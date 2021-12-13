public class MaximumFinder {
    public static void main(String[] args) {
        // Write a function that finds the largest element of an array using recursion.

        int[] input = {2, 18, 8, 51, 45, 1, 69, 11};
        System.out.println(findingMax(input, 0));
    }

    public static int findingMax(int[] max, int index) {
        if (index == max.length) {
            return 0;
        }
        if (max[index] > findingMax(max, index + 1)) {
            return max[index];
        }
        return findingMax(max, index + 1);
    }
}