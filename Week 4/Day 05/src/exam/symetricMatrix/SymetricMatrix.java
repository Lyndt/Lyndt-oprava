package exam.symetricMatrix;

import java.util.Arrays;

public class SymetricMatrix {
    public static void main(String[] args) {
        int[][] example1 = {{1, 0, 1}, {0, 2, 2}, {1, 2, 5}};
        if (isMatrixSymetric(example1, example1.length)){
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        int[][] example2 = {{7, 7, 7}, {6, 5, 7}, {1, 2, 1}};
        if (isMatrixSymetric(example2, example2.length)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }




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