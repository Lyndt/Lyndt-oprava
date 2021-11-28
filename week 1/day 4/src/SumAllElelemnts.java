public class SumAllElelemnts {
    public static void main(String[] args){

        int[] numbers = {3, 4, 5, 6 ,7};
        print(numbers);

    }
    public static void print(int[] myPrint) {
        for (int a = 0; a < myPrint.length; a++) {
            System.out.print(myPrint[a]);
        }
    }
}
// - Create an array variable named `numbers`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Print the sum of the elements of `numbers`