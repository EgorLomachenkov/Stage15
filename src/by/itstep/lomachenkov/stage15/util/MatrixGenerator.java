package by.itstep.lomachenkov.stage15.util;

import java.util.Random;

public class MatrixGenerator {
    private static final Random RND;

    static {
        RND = new Random();
    }

    public static void initMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = RND.nextInt(100);
            }
        }
    }
}
