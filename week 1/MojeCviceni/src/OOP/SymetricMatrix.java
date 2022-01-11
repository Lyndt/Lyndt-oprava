package OOP;

public class SymetricMatrix {

    public static boolean isSymetricMatrixSame(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    return false;
                }

            }

        }
        return true;
    }

    public static void main(String[] args) {
        int[][] array1 = {
                {1, 0, 1},
                {0, 2, 2},
                {1, 2, 5}
        };
        System.out.println(isSymetricMatrixSame(array1));
        int[][] array2 = {
                {7, 7, 7},
                {6, 5, 7},
                {1, 2, 1}
        };
        System.out.println(isSymetricMatrixSame(array2));
    }
}
