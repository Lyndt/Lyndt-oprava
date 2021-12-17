package exam.symetricMatrix;

import java.util.Arrays;

public class SymetricMatrix {
    public static void main(String[] args) {
        int[][] matrix1 = {{1, 0, 1}, {0, 2, 2}, {1, 2, 5}};




    }

    public static boolean isMatrixSymetric(int[][] matrix, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    return false;
                }
            }
        } return true;

    }
}