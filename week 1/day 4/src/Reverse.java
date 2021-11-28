public class Reverse {
    public static void main(String[] args) {

        int[] numbers = {3, 4, 5, 6, 7};

        int temp;
        for (int a = 0; a < numbers.length / 2; a++) {
            temp = numbers[a];
            numbers[a] = numbers[numbers.length - a - 1];
            numbers[numbers.length - a - 1] = temp;
        }

        for (int el : numbers){
            System.out.println(el);
        }
    }
}
// - Create an array variable named `numbers`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Reverse the order of the elements of `numbers`
// - Print the elements of the reversed `numbers`