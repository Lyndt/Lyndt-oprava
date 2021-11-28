public class Matrix {
    public static void main(String[] args) {


        int[][] matrix = {
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
        };

        matrixLine(matrix);
    }
    public static void matrixLine(int[][] loopMatrix) {
        for (int a = 0; a < loopMatrix.length; a++) {
            System.out.println();
            for (int b = 0; b < loopMatrix.length; b++) {

                if (b==a) {
                    loopMatrix[a][b]= 1;
                }

                System.out.print(loopMatrix[a][b]);
            }
        }
    }
}
// - Create a two dimensional array dynamically with the following content.
//   Note that a two dimensional array is often called matrix if every
//   internal array has the same length.
//   Use a loop!
//
//   1 0 0 0
//   0 1 0 0
//   0 0 1 0
//   0 0 0 1
//
//   Its length should depend on a variable
//
// - Print this two dimensional array to the output