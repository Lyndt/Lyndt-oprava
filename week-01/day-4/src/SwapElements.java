public class SwapElements {
    public static void main(String[] args) {

        String[] others = {"first", "second", "third"};
        String othersTemp = others[0];
        others[0] = others[2];
        others[2] = othersTemp;

        print(others);

    }
    public static void print(String[] printAray){
        for (int a = 0; a < printAray.length; a++) {
            System.out.println(printAray[a]);
        }
    }
}

// - Create an array variable named `orders`
//   with the following content: `["first", "second", "third"]`
// - Swap the first and the third element of `orders`