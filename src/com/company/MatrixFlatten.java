package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class MatrixFlatten {

    private final ArrayList vector;
    private final int secondD;
    private final int thirdD;

    public MatrixFlatten(Integer[][][] matrix) {
        int firstD = matrix.length;
        this.secondD = matrix[0].length;
        this.thirdD = matrix[0][0].length;
        this.vector = new ArrayList<>(firstD * this.secondD * this.thirdD);
        for (Integer[][] integers : matrix) {
            for (int j = 0; j < this.secondD; j++) {
                this.vector.addAll(Arrays.asList(integers[j]).subList(0, this.thirdD));
            }
        }
    }

    public void get(int i, int j, int k) {
        int vec = (int) vector.get((i * this.secondD * this.thirdD) + (j * this.thirdD) + k);
        System.out.println(vec);
    }
}

