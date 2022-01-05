package exercise.beforeExam;

public class DiagonalMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {0,0,0,0},
                {0,0,0,0},
                {0,0,0,0},
                {0,0,0,0}
        };
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j){
                    matrix[i][j] = 1;
                }
                System.out.print(matrix[i][j]);
            }
            System.out.println();

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