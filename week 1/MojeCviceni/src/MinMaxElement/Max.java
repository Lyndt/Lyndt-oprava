package MinMaxElement;

public class Max {
    public static void main(String[] args) {
        int[] input = {1,50,23,45,81,12};
        System.out.println(findMax(input, 0));

    }

    private static int findMax(int[] max, int index) {
        if (index == max.length) {
            return 0;
        }
        if (max[index] > findMax(max, index +1)){
            return max[index];
        }
        return findMax(max, index + 1);
    }


}
