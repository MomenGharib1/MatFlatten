package com.company;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Integer[][][] matrix = new Integer[5][3][1];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 1; k++) {
                    matrix[i][j][k] = random.nextInt();
                }
            }
        }
        MatrixFlatten flatter = new MatrixFlatten(matrix);
        flatter.get(2, 2, 2);
    }
}
