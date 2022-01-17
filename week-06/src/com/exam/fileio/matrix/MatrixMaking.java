package com.exam.fileio.matrix;

import java.util.Scanner;

public class MatrixMaking {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many rows you want?:");
        int rows = scanner.nextInt();
        System.out.println("How many columns?:");
        int colums = scanner.nextInt();
        //TODO: make 2d array
        int[][] matrixArray = new int[rows][colums];

        System.out.println("enter the matrix data:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colums; j++) {

                matrixArray[i][j] = scanner.nextInt();

            }
        }
        //TODO: print matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colums; j++) {
                System.out.print(matrixArray[i][j] + "\t");

            }
            System.out.println();

        }
    }

}
